package org.springbootbuch.springboottest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

//@SpringBootTest
@ExtendWith(SpringExtension.class)
@WebMvcTest
class SpringBootTestApplicationTests {
	
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void helloWorldShouldWork() throws Exception {
		this.mockMvc
			.perform(get("/hello").param("name","World"))
			.andExpect(status().isOk())
			.andExpect(content().string("Hello, World\n"));
	}

}
