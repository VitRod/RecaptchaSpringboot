package com.vit.controller;

import com.vit.annotation.RequiresCaptcha;
import com.vit.model.HelloDto;
import com.vit.model.HelloResponseDto;
import com.vit.service.ValidateCaptcha;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

//Spring annotations
@RestController
@RequestMapping("/api")
public class HelloCtrl {

    //injected to validate the captcha response coming in the request.
    @Autowired
    ValidateCaptcha service;

    //URL - http://localhost:9001/api/welcome
    @PostMapping("/welcome")
    @ResponseStatus(code = HttpStatus.OK)
    //custom annotation
    @RequiresCaptcha
    public HelloResponseDto welcome(@RequestBody final HelloDto dto) {
        return new HelloResponseDto("Greetings " + dto.getName());
    }
}
