package net.fsd.search.cfg;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableAspectJAutoProxy(proxyTargetClass=true)
@ComponentScan({"net.fsd.model","net.fsd.security", "net.fsd.comm.log","net.fsd.login",
	"net.fsd.search.controller","net.fsd.search.service"})
@EntityScan("net.fsd.entity")
@EnableJpaRepositories("net.fsd.search.dao")
//@ComponentScan("net.fsd.model, net.fsd.search.*, net.fsd.security")
//@EnableJpaRepositories(basePackages = {"com.xx","com.yy"})
//@EntityScan(basePackages = {"com.xx","com.yy"})
public class AppConfigSearch {

}
