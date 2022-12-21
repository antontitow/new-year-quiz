package ru.titov.quiz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class QuizApplication {

  public static void main(String[] args) {
    SpringApplication.run(QuizApplication.class, args);
    System.out.println("QUIZ started");
  }
}
