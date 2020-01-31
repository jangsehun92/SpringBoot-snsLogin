package jsh.project.sns;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import jsh.project.sns.controller.LoginController;

@RunWith(SpringRunner.class)
//@SpringBootTest
@WebMvcTest(LoginController.class)
class DemoApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void contextLoads() {
		//window 환경에서 vscode java test는 잘 실행된다.
		System.out.println("test중입니다.");
	}

	@Test
	public void 기본_path_테스트() throws Exception {
	 mockMvc.perform(get("/"))
				 .andExpect(status().isOk())
				 //.andExpect(content().string("login"))
                .andReturn();
	}

	// @Test
	// public void 기본path로_접근하면_index_html_호출된다 () throws Exception {
	// 	given()
	// 			.get("/")
	// 		.then()
	// 			.statusCode(200)
	// 			.contentType("text/html");
    // }


}
