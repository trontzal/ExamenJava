package com.proyectorecetas.presentacion.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}

	@GetMapping("/login-error")
	public String loginError(Model model) {
		model.addAttribute("loginError", true);
		model.addAttribute("errorMessage", "Nombre de usuario o contraseña incorrectos.");
		return "login";
	}
	
	@GetMapping("/logout-success")
	public String logoutSuccess(Model model) {
	    model.addAttribute("logoutSuccess", true);
	    return "logoutSucces"; 
	}

}
