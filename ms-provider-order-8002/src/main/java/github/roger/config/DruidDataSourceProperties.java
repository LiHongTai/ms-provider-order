package github.roger.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "spring.datasource.druid")
@Data
public class DruidDataSourceProperties {
    private String username;
    private String password;
    public String filters;
    private String jdbcUrl;
    private String driverClassName;
    private Integer initialSize;
    private Integer maxActive;
    private Integer minIdle;
    private long maxWait;
    private boolean poolPreparedStatements;
    private long timeBetweenEvictionRunsMillis;
}
