package jsh.project.sns;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

@RunWith(SpringRunner.class)
@SpringBootTest
class DemoApplicationTests {

	@Before
    public void setup() {
        RestAssured.port = 8081;
    }

	@Test
	void contextLoads() {
		//window 환경에서 vscode java test는 잘 실행된다.
		System.out.println("test중입니다.");
	}

	@Test
	public void 기본path로_접근하면_index_html_호출된다 () throws Exception {
		given()
				.get("/")
			.then()
				.statusCode(200)
				.contentType("text/html");
    }


}
