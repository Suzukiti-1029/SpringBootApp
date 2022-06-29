package com.example.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.springmvc.model.Inquiry;
import com.example.springmvc.model.User;

@Controller
public class HomeController {
  @GetMapping("/")
  public String index(@ModelAttribute Inquiry inquiry) {
    return "index";
  }

  @PostMapping("/")
  public String confirm(@Validated @ModelAttribute Inquiry inquiry,
  BindingResult result) {
    if (result.hasErrors()) {
      return "index";
    }
    return "confirm2";
  }

  @GetMapping("/form")
  public String readForm(@ModelAttribute User user) {
    return "form";
  }

  @PostMapping("/form")
  private String confirm(@ModelAttribute User user) {
    return "confirm";
  }
}
