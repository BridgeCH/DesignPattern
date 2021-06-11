package clapton.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 切面定义
 */
@ConfigurationProperties("itstack.door")
public class StarterServiceProperties {

    private String userStr;

    public String getUserStr() {
        return userStr;
    }

    public void setUserStr(String userStr) {
        this.userStr = userStr;
    }

}
