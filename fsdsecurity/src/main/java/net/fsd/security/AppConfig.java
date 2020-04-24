package net.fsd.security;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableAspectJAutoProxy(proxyTargetClass=true)
@ComponentScan({"net.fsd.model", "net.fsd.security.cfg","net.fsd.security.filter","net.fsd.comm", "net.fsd.comm.log",
	"net.fsd.security.service", "net.fsd.security.controller"})

//@ComponentScan("net.fsd.model, net.fsd.*.service, net.fsd.*.controller, net.fsd.security, net.fsd.comm.log")
@EntityScan("net.fsd.entity")
@EnableJpaRepositories("net.fsd.security.dao")
//@EnableAspectJAutoProxy

//@EnableJpaRepositories(basePackages = {"com.xx","com.yy"})
//@EntityScan(basePackages = {"com.xx","com.yy"})
public class AppConfig {

}
