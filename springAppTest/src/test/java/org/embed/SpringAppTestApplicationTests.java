package org.embed;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.embed.controller.HomeController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class SpringAppTestApplicationTests {
   
	//WebMock Test 시작
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	void shouldReturnDefaultMessage() throws Exception {
		this.mockMvc.perform(get("/")).andDo(print()).andExpect(status().isOk()).andExpect(content().string(containsString("Hello, World")));
	}
   
	//class HttpRequestTest 시작
	@LocalServerPort
	private int port;
   
	@Autowired
	private TestRestTemplate restTemplate;
   
   
	@Test
	void greetingShouldReturnDefaultMessage() throws Exception {
		assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/", String.class)).contains("Hello, World!!");
		System.out.println(assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/", String.class)).contains("Hello, World!!"));
	}
	//class HttpRequestTest 종료
   
   
	@Autowired
	private HomeController controller;
   
	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
	}
   
	@Test
	@DisplayName("두 숫자의 합 비교")
		void testEqualsSum() {
		int a = 5;
		int b = 7;
		int expectedSum = 12;
		int atualSum = a + b;
		Assertions.assertEquals(expectedSum, atualSum);
	}
   
	@Test
	@DisplayName("Object Null 여부 테스트")
	void testIsNotNull() {
		//Object obj = "메세지"
		Object obj = null;
		Assertions.assertNull(obj);
		System.out.println("[+] @Test assertNull Annotation");
   }

}

