package project.security.jwt;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "jwt")
public class JwtProperties
{
    private String secretKey = "verySecretKey";
    private long validityInMs = 180000;

    public String getSecretKey()
    {
        return secretKey;
    }

    public void setSecretKey(String secretKey)
    {
        this.secretKey = secretKey;
    }

    public long getValidityInMs()
    {
        return validityInMs;

    }

    public void setValidity(long validity)
    {
        this.validityInMs = validity;
    }
}
