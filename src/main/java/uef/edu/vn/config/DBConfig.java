package uef.edu.vn.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class DBConfig {

    private static final String DRIVER
            = "com.mysql.cj.jdbc.Driver";

    private static final String URL
            = "jdbc:mysql://sql12.freesqldatabase.com:3306/sql12831978"
            + "?useSSL=false"
            + "&serverTimezone=Asia/Ho_Chi_Minh"
            + "&allowPublicKeyRetrieval=true";

    private static final String USERNAME = "sql12831978";

    private static final String PASSWORD = "pKkw8eu5yW";

    @Bean
    public DataSource dataSource() {

        DriverManagerDataSource dataSource
                = new DriverManagerDataSource();

        dataSource.setDriverClassName(DRIVER);
        dataSource.setUrl(URL);
        dataSource.setUsername(USERNAME);
        dataSource.setPassword(PASSWORD);

        return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate() {
        return new JdbcTemplate(dataSource());
    }
}
