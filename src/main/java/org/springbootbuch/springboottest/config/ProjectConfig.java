package org.springbootbuch.springboottest.config;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.core.userdetails.UserDetails;

@Configuration
public class ProjectConfig {
	
	@Bean
	public UserDetailsService userDetailsService() {
		UserDetails u = new User("john", "1234", "read");
		List<org.springframework.security.core.userdetails.UserDetails> users = List.of(u);
		return new InMemoryUserDetailsService(users);
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
}

