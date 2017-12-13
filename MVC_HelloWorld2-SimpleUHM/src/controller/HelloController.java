package controller;

import java.util.HashMap;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest req,
			HttpServletResponse resp) throws Exception {
		
			//SimpleUrlHandlerMapping m = new SimpleUrlHandlerMapping();
			//m.setMappings(mappings); here mappings data type is property
		// so we need to do property dependency injection between <props> and </props> in front contriollr
			String Name = req.getParameter("name");
			
			Map m = new HashMap();
			m.put("msg", "Hello.....using simple url handler mappings : "+Name);
			
			ModelAndView mav = new ModelAndView("success",m);
		
		return mav;
	}

}
