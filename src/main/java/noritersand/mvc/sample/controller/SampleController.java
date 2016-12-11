package noritersand.mvc.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SampleController {
	@RequestMapping("/sample/draw-sample.do")
	public ModelAndView drawSample(ModelAndView mv) {
		mv.setViewName("/sample/sample");
		return mv;
	}
}
