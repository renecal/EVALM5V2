package com.prueba.security;

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
	        http.authorizeRequests()
		        .antMatchers(resources).permitAll()  
		        .antMatchers("/","/login").permitAll()
		        .antMatchers("/panel**/").access("hasRole('ADMIN') or hasRole('USER')")
		        .antMatchers("/perfil**/").access("hasRole('ADMIN') or hasRole('USER')")
		        .antMatchers("/registros/listar**/").access("hasRole('ADMIN')")
		        .antMatchers("/registros/editar/**").access("hasRole('ADMIN')")
		       // .antMatchers("/registros/nuevo**/").access("hasRole('ADMIN')")
		        .antMatchers("/registros/nuevo").hasAnyRole("ADMIN")
		        // falta agregar las demas vistas
	                .anyRequest().authenticated() // cualquier otra request debe estar autenticada
	                .and()
	            .formLogin() // verificacion del login
	                .loginPage("/login")
	                .permitAll()
	                .defaultSuccessUrl("/panel")
	                .failureUrl("/login?error=true")
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





