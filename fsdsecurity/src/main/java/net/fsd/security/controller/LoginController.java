package net.fsd.security.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.fsd.comm.BaseController;
import net.fsd.security.service.FSDUserDetailsService;

@RestController
public class LoginController extends BaseController{

    @Autowired
    private FSDUserDetailsService authService;

    @RequestMapping(value = "/auth/login", method = RequestMethod.POST)
    public String createToken( @RequestParam String username,@RequestParam String password ) throws AuthenticationException {
        return authService.login( username, password );
    }

    @RequestMapping(value = "/auth/allowaccess", method = RequestMethod.POST)
    public boolean createToken() throws AuthenticationException {
        return true;
    }
    
    /*@RequestMapping(value = "/auth/register", method = RequestMethod.POST)
    public FSDUser register( @RequestBody FSDUser addedUser ) throws AuthenticationException {
        return authService.register(addedUser);
    }*/

}