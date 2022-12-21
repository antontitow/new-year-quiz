package ru.titov.quiz.controller;

import org.apache.catalina.connector.Response;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @autor : antontitow {@literal antontitow@bk.ru}
 * @created : 21.12.2022, 23:16
 */
@Controller
public class QuizGreetingController {

  @GetMapping("/health")
  @ResponseBody
  int healthCheck() {
    return Response.SC_OK;
  }

  @GetMapping("/greeting")
  String greeting() {
    return "index";
  }
}
