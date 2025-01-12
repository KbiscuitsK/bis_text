package nxu.it.movieapi.utils;

import io.jsonwebtoken.*;

import java.util.Date;
import java.util.Map;

public class JwtUtils {

    private static final String SIGN_KEY = "nxu"; // 签名密钥
    private static final Long EXPIRE = 1800*1000L; // 有效时间（30min）

    /**
     * 生成JWT令牌
     * @param claims JWT 第二部分负载 payload 中存储的内容
     * @return 生成的 JWT 字符串
     */
    public static String generateJwt(Map<String, Object> claims) {
        return Jwts.builder()
                .addClaims(claims) // 自定义信息（有效载荷）
                .signWith(SignatureAlgorithm.HS256, SIGN_KEY.getBytes()) // 使用字节数组作为签名密钥
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRE)) // 设置过期时间
                .compact();
    }

    /**
     * 解析JWT令牌
     * @param jwt JWT令牌
     * @return JWT 第二部分负载 payload 中存储的内容
     */
    public static Claims parseJWT(String jwt) {
        try {
            return Jwts.parser()
                    .setSigningKey(SIGN_KEY.getBytes()) // 使用字节数组作为签名密钥
                    .parseClaimsJws(jwt)
                    .getBody();
        } catch (ExpiredJwtException e) {
            throw new IllegalArgumentException("JWT已过期", e);
        } catch (SignatureException e) {
            throw new IllegalArgumentException("JWT签名无效", e);
        } catch (MalformedJwtException e) {
            throw new IllegalArgumentException("JWT格式错误", e);
        } catch (Exception e) {
            throw new IllegalArgumentException("JWT解析失败", e);
        }
    }
}
