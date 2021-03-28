package edu.webintegrado.myapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContactoController {

  @GetMapping("/contacto")
  public String contacto(Model model) {
    model.addAttribute("name", "Soy el controlador del contacto");
    return "contacto";
  }

}
