package com.vscodetest.vst.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class VstController {
    @GetMapping("/")
    public String getMethodName() {
        return "Hello33";
    }
    
}
