package egovframework.example.asusmain.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AsusMainController {
	
	@RequestMapping(value = "asus.do")
	public String initMain() throws Exception {

		return "asusmain/asusmain.brand";
	}
}
