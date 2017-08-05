package hello;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("myapp")
public class ServerProperties {
	
    private String dburl;

        public String getDbUrl() {
            return dburl;
        }

        public void setDbUrl(String dburl) {
            this.dburl = dburl;
        }
}