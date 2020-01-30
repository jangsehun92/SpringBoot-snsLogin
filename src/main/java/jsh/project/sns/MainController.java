package jsh.project.sns;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class MainController {

	//application.properties 외에 추가적으로 사용할 properties를 추가해 줄 수 있다.
	private static final String PROPERTIES = "spring.config.location=classpath:/application.yml, classpath:/google.yml";

	public static void main(String[] args) {
		//SpringApplication.run(MainController.class, args);
		new SpringApplicationBuilder(MainController.class)
									.properties(PROPERTIES)
									.run(args);
	}

}
