package com.example.erdetfredag.Controller;

import com.example.erdetfredag.Services.Calculator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

  Calculator cal = new Calculator();

  @GetMapping("/")
  public String index() {

    return "Er det fredag? " + cal.dayname();
    }

    }


