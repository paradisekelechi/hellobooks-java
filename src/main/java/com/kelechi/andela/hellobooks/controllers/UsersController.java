package com.kelechi.andela.hellobooks.controllers.authentication;

import com.kelechi.andela.hellobooks.dto.UserDTO;
import com.kelechi.andela.hellobooks.service.authentication.UsersService;
import com.kelechi.andela.hellobooks.service.authentication.UsersServiceImpl;
import com.kelechi.andela.hellobooks.util.response.AuthenticationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
public class UsersController {
    @Autowired
    private UsersService usersService;

    @RequestMapping(value = "/signup", method= RequestMethod.POST)
    public @ResponseBody
    AuthenticationResponse signinUser(@RequestBody UserDTO userDto){
        AuthenticationResponse signupUserResponse = usersService.signup(userDto);
        return signupUserResponse;
    }

    @RequestMapping(value = "/signin", method= RequestMethod.POST)
    public @ResponseBody
    AuthenticationResponse addUser(@RequestBody UserDTO userDto){
        AuthenticationResponse signinResponse = usersService.signin(userDto);
        return signinResponse;
    }
}
