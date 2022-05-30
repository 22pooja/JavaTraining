package com.example.demoSpringsecurityMultiplePassUname;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class MySecurity extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		//super.configure(auth);
		auth.inMemoryAuthentication()
		.withUser("xyz")
		.password("abc")
		.roles("USER");
	}
	@Bean
public PasswordEncoder getPasswordEncoder()
{
		return NoOpPasswordEncoder.getInstance();
}
}
	

