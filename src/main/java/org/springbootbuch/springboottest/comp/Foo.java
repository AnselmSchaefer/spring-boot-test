package org.springbootbuch.springboottest.comp;

import org.springframework.stereotype.Component;

@Component
public class Foo {
	private final Bar bar;
	
	public Foo(Bar bar) {
		this.bar = bar;
	}
	
	public Bar getBar() {
		return bar;
	}
}
