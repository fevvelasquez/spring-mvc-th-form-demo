package me.fevvelasquez.spring.mvc.th.form.demo.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
	public String get(Model model) {
		model.addAttribute("user", new User("", ""));
		return "form";
	}

	@PostMapping
	public String processAndValid(@Valid User user, BindingResult bResult, Model model) {

		if (bResult.hasErrors()) {
			return "form";
		}

		model.addAttribute("user", user);
		return "result";
	}

}
