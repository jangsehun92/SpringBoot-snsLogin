package jsh.project.sns;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
//import static io.restassured.RestAssured.given;
import io.restassured.RestAssured; //restApi test

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

}
