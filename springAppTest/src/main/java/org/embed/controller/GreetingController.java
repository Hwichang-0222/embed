package org.embed.controller;

import org.embed.service.GreetingService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController {

   private final GreetingService service;
   
   public GreetingController(GreetingService service) {
      // TODO Auto-generated constructor stub
      this.service = service;
   }
   
   @RequestMapping("/greeting")
   public @ResponseBody String greeting() {
      
      return service.greet();
   }
}
