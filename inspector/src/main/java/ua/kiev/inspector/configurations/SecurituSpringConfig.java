package ua.kiev.inspector.configurations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.encoding.ShaPasswordEncoder;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@Configuration
@EnableWebSecurity
public class SecurituSpringConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
    private AuthenticationProvider inspectorAuthenticationProvider;
	
	@Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.authenticationProvider(inspectorAuthenticationProvider);
    }
	
	private static String REALM="MY_TEST_REALM";
	
	@Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
            	.antMatchers("/").permitAll()
            	.antMatchers("/inspector", "/registration", "/addUser").permitAll()
            	.antMatchers("/resources/**").permitAll()
            	.anyRequest().authenticated()
                .and()
                .httpBasic().realmName(REALM).authenticationEntryPoint(getBasicAuthEntryPoint()).and()
            .formLogin()
            	.loginPage("/login")
            	.failureUrl("/login?error")
            	.usernameParameter("username")
            	.passwordParameter("password")
            	.permitAll()
            	.and()
            .logout()
            	.logoutSuccessUrl("/")
            	.permitAll()
            	.and()
            .csrf()
            	.disable();
        
    }
	
	 @Bean
	    public InspectorAuthenticationEntryPoint getBasicAuthEntryPoint(){
	        return new InspectorAuthenticationEntryPoint();
	    }
	     

	@Bean
    public ShaPasswordEncoder getShaPasswordEncoder(){
        return new ShaPasswordEncoder();
    }
}
