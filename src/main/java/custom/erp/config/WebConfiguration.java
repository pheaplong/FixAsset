package custom.erp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.AntPathMatcher;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfiguration extends WebMvcConfigurationSupport {
	 @Override
	    public void configurePathMatch(PathMatchConfigurer configurer) {
	        AntPathMatcher matcher = new AntPathMatcher();
	        matcher.setCaseSensitive(false);
	        configurer.setPathMatcher(matcher);
	    }

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/api/**")
				.allowedOrigins("*")
				.allowedHeaders("*")
				.allowedMethods( "GET",  "DELETE","POST","PUT");
			}
		};
	}
}
