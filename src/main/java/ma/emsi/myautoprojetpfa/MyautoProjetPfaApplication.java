package ma.emsi.myautoprojetpfa;

import org.springframework.http.HttpMethod;
import org.springframework.web.filter.CorsFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;


import java.util.Arrays;

@SpringBootApplication
public class MyautoProjetPfaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyautoProjetPfaApplication.class, args);
    }


    // If you're using spring security, you should add configuration.setAllowCredentials(true);
    // here too and don't forget to add http.cors() in spring security configuration.


}
