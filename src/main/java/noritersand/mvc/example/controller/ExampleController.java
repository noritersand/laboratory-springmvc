package noritersand.mvc.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ExampleController {
	@RequestMapping("/example/draw-example.do")
	public ModelAndView drawExample(ModelAndView mv) {
		
		System.out.println("잘 들어 오는군?");
		
		mv.setViewName("/example/example");
		return mv;
	}
}
