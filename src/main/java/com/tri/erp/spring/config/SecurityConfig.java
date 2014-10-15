package com.tri.erp.spring.config;

import javax.sql.DataSource;

import com.jolbox.bonecp.BoneCPDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebMvcSecurity 
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    DataSource dataSource;

    /**
     *
     * @param builder
     * @throws Exception
     */
    @Override
    public void configure(WebSecurity builder) throws Exception {
        builder .ignoring()
                .antMatchers("/resources/**", "/logoutSuccess");
    }
    
    @Override
    protected void configure(HttpSecurity http) throws Exception { 
        http
            .authorizeRequests()
            .antMatchers("/admin/**").hasAuthority("ADMIN")
            .anyRequest().authenticated();
        http
            .formLogin().loginPage("/login")
            .permitAll();
        http
            .logout()
                .logoutSuccessUrl("/logoutSuccess")
            .and()
                .csrf();
        http
            .exceptionHandling().accessDeniedPage("/403");
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception { 
        auth
                .jdbcAuthentication()
                .passwordEncoder(passwordEncoder())
                .dataSource(dataSource)
                .usersByUsernameQuery("select username,password, enabled from User where username=?")
                .authoritiesByUsernameQuery("select username, role from UserRole where username=?");
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        PasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder;
    }
}
