package com.oss.carpool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class CarpoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarpoolApplication.class, args);
	}
	
	@Bean
	  public WebMvcConfigurer corsConfigurer(){
	      return new WebMvcConfigurer(){
	          @Override
	          public void addCorsMappings(CorsRegistry registry){
	              registry.addMapping("/**")  // 특정 패턴에 대해 CORS 처리가 가능하도록 함 . 우리는 모든 것에 대해 활성화
	                      .allowedMethods("*") // GET, PUT과 같은 모든 메서드 허용
	                      .allowedOrigins("http://localhost:3000"); 
	          }
	      };
	  }
}
