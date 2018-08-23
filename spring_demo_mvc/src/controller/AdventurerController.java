package controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import entity.Adventurer;

/**
* @author shouqing E-mail:shouqing777@gmail.com
* @version 創建時間：2018年8月13日 下午4:40:56
* 類說明
*/
@Controller
@RequestMapping("/adventurer")
public class AdventurerController {
	
	
	@Value("#{races}")
	private Map<String, String> races;
	
	@RequestMapping("/showForm")
	public String showForm(Model model) {	
		Adventurer adventurer = new Adventurer();
		model.addAttribute("adventurer",adventurer);
		model.addAttribute("race", races);
		return "adventurer-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("adventurer") Adventurer adventurer) {	
		
		System.out.println(adventurer.getFirstName() + " " +adventurer.getLastName());
		
		return "adventurer-confirm";
	}
}
	
