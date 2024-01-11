package com.proyectorecetas.presentacion.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String mostrarPaginaLogin(Model model, String error, String logout) {
        if (error != null) {
            model.addAttribute("error", "Nombre de usuario o contraseña incorrectos.");
        }

        if (logout != null) {
            model.addAttribute("message", "¡Te has desconectado correctamente!");
        }

        return "login"; // "login" es el nombre de la vista para la página de inicio de sesión (crea el archivo login.jsp)
    }
}