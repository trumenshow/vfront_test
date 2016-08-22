package spring.mvc.vfront01.Controller;

import java.util.Enumeration;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import spring.mvc.vfront01.Bean.WorkerBean;

@Controller
public class WorkerController {

	@RequestMapping("insertWorker")
	public ModelAndView insertFn(ModelAndView mav){ 
		System.out.println("include insert Form");
		mav.addObject("mainView", "insert");
		mav.setViewName("home");
		return mav;
	};
	@RequestMapping("insertComp")
	public ModelAndView insertComp(ModelAndView mav,HttpServletRequest request){
		Enumeration<String> pnames = request.getParameterNames();
		WorkerBean worker = new WorkerBean();
		
		while(pnames.hasMoreElements()){
			worker.setField(pnames.nextElement(),request);
		}
		
		
		
		mav.setViewName("home");
		return mav;
	}
}












