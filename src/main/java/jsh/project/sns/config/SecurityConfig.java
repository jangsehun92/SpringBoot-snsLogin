package jsh.project.sns.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;

import lombok.AllArgsConstructor;

// @Configuration
// @EnableWebSecurity
@EnableWebSecurity
@EnableOAuth2Client
@AllArgsConstructor
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	/*
	Spring 버젼이 2.x대로 넘어오면서 oauth 관련 설정들이 조금씩 바뀌어 전체적으로 다시 바꿔야할듯
	spring-security-oauth2 = 2.3.4.RELEASE
	spring-security-oauth2-autoconfigure = 2.0.0.RELEASE 
	버전으로 낮추니 특정 어노테이션 사용가능(일단 이렇게 예제 진행해야할듯하다)
	*/
    @Override
	public void configure(WebSecurity web) throws Exception {
		//리소스 폴더 내에 css&lib 폴더를 두고 사용할 경우 추가해 주면 된다.
		web.ignoring().antMatchers("/css/**", "/script/**", "image/**", "/fonts/**", "lib/**");
    }
	
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
			.antMatchers("/","/login").permitAll()
			.anyRequest().authenticated()
				.and()
			.logout().logoutSuccessUrl("/").permitAll()
				.and()
			.headers().frameOptions().sameOrigin()
				.and()
			.csrf().disable();

	}

}