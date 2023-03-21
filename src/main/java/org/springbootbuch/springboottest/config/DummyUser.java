package org.springbootbuch.springboottest.config;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;

public class DummyUser implements UserDetails{

	@Override
	public String getUsername() {
		return "bill";
	}

	@Override
	public String getPassword() {
		return "12345";
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return List.of(() -> "READ");
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonLocked() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}
