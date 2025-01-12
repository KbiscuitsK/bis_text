
package nxu.it.movieapi.fliter;

import com.alibaba.fastjson.JSONObject;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import nxu.it.api.common.result.ApiResult;
import nxu.it.api.common.result.ResponseType;
import nxu.it.movieapi.utils.JwtUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Date;

@WebFilter(urlPatterns = "/*")
public class LoginCheckFilter implements Filter {
    private static final Logger log = LoggerFactory.getLogger(LoginCheckFilter.class);

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        // 1. 获取请求的 URL
        String url = request.getRequestURL().toString();
        log.info("请求路径：{}", url);
        System.out.println("当前时间：" + new Date());
        System.out.println("当前时间：" + new Date(System.currentTimeMillis() + 1800*1000));




        // 2. 判断请求 URL 是否包含 /login，如果包含则直接放行
        if (url.contains("/login")) {
            log.info("登录操作，放行");
            filterChain.doFilter(servletRequest, servletResponse);
            return;
        }

        // 3. 从 Authorization 头中获取令牌（Token）
        String authorizationHeader = request.getHeader("Authorization");
        log.info("Authorization 头的值: {}", authorizationHeader);

        // 4. 检查 Authorization 头是否包含 Bearer 前缀
        if (authorizationHeader == null || !authorizationHeader.startsWith("Bearer ")) {
            log.warn("Authorization 头缺失或格式错误");
            respondWithError(response, ResponseType.NOT_FOUND, "未登录");
            return;
        }

        // 5. 去掉 Bearer 前缀，提取实际的 Token 值
        String token = authorizationHeader.substring(7);
        log.info("token: {}",token);
        // 6. 验证 Token 是否有效
        try {
            JwtUtils.parseJWT(token);
            log.info("Token 验证成功");
        } catch (Exception e) {
            log.error("Token 验证失败: {}", e.getMessage());
            respondWithError(response, ResponseType.NOT_FOUND, "未登录或 Token 无效");
            return;
        }

        // 7. 如果验证成功，放行请求
        filterChain.doFilter(servletRequest, servletResponse);
    }


    private void respondWithError(HttpServletResponse response, ResponseType responseType, String message) throws IOException {
        ApiResult responseResult = ApiResult.fail(responseType, message);
        String json = JSONObject.toJSONString(responseResult);
        response.setContentType("application/json;charset=utf-8");
        response.getWriter().write(json);
    }
}
