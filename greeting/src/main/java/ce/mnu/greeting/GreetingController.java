package ce.mnu.greeting;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingController {
	
	@GetMapping("/msg")
	public String processMsg(Model model)
	{
		model.addAttribute("name","김상식");
		model.addAttribute("phone","010-1234-5678");
		model.addAttribute("year","3");
		model.addAttribute("num",7);
		return "multi";
	}

}
