package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
* @author shouqing E-mail:shouqing777@gmail.com
* @version 創建時間：2018年8月12日 下午9:57:54
* 類說明
*/

@Controller
@RequestMapping("/param")
public class ParamController {
	
	@RequestMapping("nameForm")
	public String nameForm() {
		return "nameForm";
	}
	
	@RequestMapping("getNameForm")
	public String getNameForm() {
		return "getNameForm";
	}
	
	@RequestMapping("getNameFormTwo")
//	@GetMapping
	public String getNameFormTwo(HttpServletRequest request , Model theModel) {
		
		String name = request.getParameter("name");
		
		if (name != null) {
			name = name.toUpperCase();
		}
		
		theModel.addAttribute("upperName",name);
		
		return "getNameFormTwo";
		
	}
	
	@GetMapping("getNameFormThree")
	public String getNameFormThree(@RequestParam("name") String name , Model theModel) {
		
		if (name != null) {
			name = name.toUpperCase();
		}
		
		theModel.addAttribute("upperName",name);
		
		return "getNameFormThree";
		
	}
	
}
