package individual.professortao.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class CorsConfiguration {

    @Value("${security.allow_origins:}")
    private String allowOrigins;

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
//                registry.addMapping("/**")
//                        .allowedOrigins("http://vredu.baidu.com", "http://vr.baidu.com", "https://vredu.baidu.com", "https://vr.baidu.com")
//                        .allowCredentials(true).maxAge(3600);
                if (!allowOrigins.equals("")) {
                    String[] origins = allowOrigins.split(";");
                    registry.addMapping("/**").allowedOrigins(origins).allowCredentials(true).maxAge(3600);
                }
            }
        };
    }
}