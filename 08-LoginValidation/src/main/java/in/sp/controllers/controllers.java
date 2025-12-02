package in.sp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import in.sp.SpringBootProgram9LoginValidationApplication;
import in.sp.entities.LoginData;

@Controller
public class controllers {

	@GetMapping("/form")
	public String loginForm(Model model) {
		System.out.println("Opening form...");
		model.addAttribute("loginData", new LoginData());
		return "form";
	}

	@PostMapping("/success")
	public String successPage(@Validated @ModelAttribute("loginData") LoginData loginData, BindingResult result) {

		if (result.hasErrors()) {
			System.out.println("Validation errors: " + result);
			return "form"; // redisplay form with validation errors
		}

		System.out.println("Form submitted: " + loginData);
		return "success";
	}

}
