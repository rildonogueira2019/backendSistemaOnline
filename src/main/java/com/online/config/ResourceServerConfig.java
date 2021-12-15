package com.online.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

@Configuration
@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {
    @Override
    public void configure(HttpSecurity http) throws Exception {
        // config relation resourceserver (api)
        // aqui são colocados ou definidos os acessos as apis da aplicação criada
        // url para os modulos e usuários
        http.
                authorizeRequests().
                antMatchers("/api/testes/**")
                .hasRole("USER")
                .antMatchers("/api/login").permitAll()
                .anyRequest().denyAll();
    }
}
