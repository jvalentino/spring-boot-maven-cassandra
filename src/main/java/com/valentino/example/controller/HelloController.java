package com.valentino.example.controller;

import com.valentino.example.dto.HelloResponseDto;
import com.valentino.example.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * An example rest controller.
 *
 * @author John Valentino
 */
@RestController
public class HelloController {

  /** The hello service */
  @Autowired private HelloService helloService;

  /**
   * Returns a greeting for the given name.
   *
   * @param name The name, but is option.
   * @return Greeting.
   */
  @GetMapping("/hello")
  public HelloResponseDto hello(@RequestParam(required = false) final String name) {
    return helloService.greet(name);
  }
}
