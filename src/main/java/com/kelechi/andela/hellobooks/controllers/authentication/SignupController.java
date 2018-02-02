package com.kelechi.andela.hellobooks.controllers.authentication;

import com.kelechi.andela.hellobooks.dto.UserDTO;
import com.kelechi.andela.hellobooks.service.authentication.SignupServiceImpl;
import com.kelechi.andela.hellobooks.util.response.AuthenticationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SignupController {
    @Autowired
    private SignupServiceImpl signupService;

    @RequestMapping(value = "/api/v1/users/signup", method= RequestMethod.POST)
    public @ResponseBody
    AuthenticationResponse addUser(@RequestBody UserDTO userDto){
        AuthenticationResponse signupUserResponse = signupService.signupUser(userDto);
        return signupUserResponse;
    }
}