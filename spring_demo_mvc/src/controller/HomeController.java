package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
* @author shouqing E-mail:shouqing777@gmail.com
* @version 創建時間：2018年8月12日 下午7:32:57
* 類說明
*/
@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}

}
