package com.github.carloshh.poc.exceptions.api;

import com.github.carloshh.poc.exceptions.exception.BusinessException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExceptionController {

    @GetMapping("/exception")
    public void exception() {
        throw new BusinessException("This is a test exception");
    }

}
