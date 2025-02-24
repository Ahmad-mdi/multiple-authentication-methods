package com.configsample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

@SpringBootApplication
public class ConfigSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigSampleApplication.class, args);
        UserDetails user = User.withUsername("123")
                .password("{noop}123") // اگر از رمز ساده استفاده می‌کنید
                .build();

        JwtUtil jwtUtil = new JwtUtil();
        jwtUtil.init();

        // تولید توکن JWT
        String token = jwtUtil.generateToken(String.valueOf(user));

        // نمایش توکن
        System.out.println("Generated JWT Token: " + token);
    }

}
