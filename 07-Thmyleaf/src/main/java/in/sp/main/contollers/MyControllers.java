package in.sp.main.contollers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyControllers {
	
	@GetMapping("/profile")
	public String openProfilePage(Model model) {
		
		String name = "Naman Rawat";
		model.addAttribute("modelName", name);
		
		return "profile";
	}
	

	@GetMapping("/openConditional")
	public String ConditionalPage(Model model) {
		
		int no1 = 10;
		int no2 = 20;
		
		model.addAttribute("num1", no1);
		model.addAttribute("num2", no2);
		
		
		return "conditional";
	}
	
	
	@GetMapping("/openLooping")
	public String LoopingPage(Model model) {
		
		List<Integer> numbers = List.of(1,2,3,4,5);
		model.addAttribute("modelNumbers", numbers);
		
		
		return "looping";
	}
	
	@GetMapping("/practise")
	public String practise(Model m)
	{
		
		List<String> names = List.of("harsh","ashim","naman");
		
		m.addAttribute("names",names);
		
		return "practise";
	}
	

}
