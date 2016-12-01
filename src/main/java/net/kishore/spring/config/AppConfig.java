/**
 * 
 */
package net.kishore.spring.config;

/**
 * @author Krishna
 *
 */
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "net.kishore.spring")
public class AppConfig {

}