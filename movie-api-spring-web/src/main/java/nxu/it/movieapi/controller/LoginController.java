package nxu.it.movieapi.controller;

import nxu.it.api.common.result.ApiResult;
import nxu.it.api.common.result.ResponseType;
import nxu.it.movieapi.utils.JwtUtils;
import nxu.it.movieapi.vo.UserVo;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.Jedis;

import java.util.HashMap;
import java.util.Map;

@RestController
public class LoginController {
    @CrossOrigin(origins = "http://localhost")
    @PostMapping("/login")
    public ApiResult login(@RequestBody UserVo userVo) {

        if(userVo.getUsername().equals("admin") && userVo.getPassword().equals("admin")) {
            Map<String , Object> claims = new HashMap<>();
            claims.put("username", userVo.getUsername());
            String token = JwtUtils.generateJwt(claims);
            Jedis jedis = new Jedis("192.168.112.136");
            jedis.auth("api");
            jedis.set("token", token);
            return ApiResult.success(token);

        }
        return ApiResult.fail(ResponseType.NOT_FOUND,"用户名或密码错误");
    }

}

