package controller;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import entity.Customer;

/**
* @author shouqing E-mail:shouqing777@gmail.com
* @version 創建時間：2018年8月14日 下午12:11:56
* 類說明
*/

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder){
		
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
		
	}

	@RequestMapping("/showForm")
	public String showForm(Model model) {
		
//		Customer customer = new Customer();
//		model.addAttribute("customer",customer);
		
		model.addAttribute("customer",new Customer());
		
		return "customer-form";
		
	}
	
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("customer") Customer customer,BindingResult result) {
		
		if (result.hasErrors()){
			return "customer-form";
		}
		
		return "customer-confirm";
		
	}
	

}
