package com.proyectorecetas.presentacion.controladores.errores;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomErrorController implements ErrorController {

	@RequestMapping("/error")
	public String error(Model modelo, HttpServletRequest request, Exception exception) {
		Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);

		do {
			exception = (Exception) exception.getCause();
		} while (exception != null);

		modelo.addAttribute("status", status);

		return "error";
	}
}