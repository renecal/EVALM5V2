/*package com.prueba.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@Configuration
@EnableWebSecurity
public class WebSecutiryConfig extends WebSecurityConfigurerAdapter{
	 String[] resources = new String[]{
	            "/include/**","/css/**","/icons/**","/img/**","/js/**","/layer/**"
	    };

	    @Override
	    protected void configure(HttpSecurity http) throws Exception {
	        http
	        // define los request y asigna quienes pueden ingresar
	            .authorizeRequests()
		        .antMatchers(resources).permitAll()  
		        //.antMatchers("/","/index").permitAll()
		        .antMatchers("/login").permitAll()
		        .antMatchers("/panel").permitAll()
		       // .antMatchers("/panel*").access("hasRole('ADMIN')") // cambiar a panel
		        .antMatchers("/registros/listar*").access("hasRole('administrador')")
		        //.antMatchers("/registros/listar*").access("hasRole('administrador')")
		        .antMatchers("/index*").access("hasRole('user') or hasRole('administrador')") // cambiar a panel user
		        //index2 solo para ejemplificar
	                .anyRequest().authenticated() // cualquier otra request debe estar autenticada
	                .and()
	            .formLogin() // verificacion del login
	                .loginPage("/login")
	                .permitAll()
	                .defaultSuccessUrl("/panel")
	                .failureUrl("/login")
	                .usernameParameter("username")
	                .passwordParameter("password")
	                .and()
	            .logout()
	                .permitAll()
	                .logoutSuccessUrl("/login?logout");
	    }
	    BCryptPasswordEncoder bCryptPasswordEncoder;
	    //Crea el encriptador de contraseñas	
	    @Bean
	    public BCryptPasswordEncoder passwordEncoder() {
			bCryptPasswordEncoder = new BCryptPasswordEncoder(4);
	        return bCryptPasswordEncoder;
	    }

	    @Autowired
	    UserDetailServiceImpl userDetailsService;

	    //Registra el service para usuarios y el encriptador de contrasena
	    @Autowired
	    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception { 
	        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
	    }
	}

*/



