//package cn.lubing36.springSecurity;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@EnableWebSecurity
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
//
//	@Autowired
//	public void configgureGlobal(AuthenticationManagerBuilder auth) throws Exception{
//		auth.inMemoryAuthentication().withUser("lubing36").password("123456789").roles("USER");
//	}
//}
