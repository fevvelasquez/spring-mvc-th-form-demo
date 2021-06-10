package me.fevvelasquez.spring.mvc.th.form.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import me.fevvelasquez.spring.mvc.th.form.demo.model.domain.User;

/**
 * Demo.
 * 
 * @author fevvelasquez
 *
 */
@Controller
@RequestMapping("/form")
public class FormController {

	@GetMapping
	public String get() {
		return "form";
	}

	@PostMapping("/v1")
	public String process(Model model, @RequestParam String username, @RequestParam String email) {

		model.addAttribute("user", new User(username, email));
		return "result";
	}

	@PostMapping("/v2")
	public String process(User user, Model model) {

		model.addAttribute("user", user);
		return "result";
	}

}
