package entity;

import java.util.LinkedHashMap;


/**
* @author shouqing E-mail:shouqing777@gmail.com
* @version 創建時間：2018年8月13日 下午4:30:30
* 類說明
*/
public class Adventurer {
	
	private String firstName;	
	private String lastName;
	private String country;
	private String skill;
	private LinkedHashMap<String, String> skills;
	private String race;
	private String weapon;
	private String [] armor;
	
	public Adventurer() {
		
		this.skills = new LinkedHashMap<>();
		
		skills.put("combo","combo");
		skills.put("camp","camp");
		skills.put("cock","cook");

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public LinkedHashMap<String, String> getSkills() {
		return skills;
	}

	public void setSkills(LinkedHashMap<String, String> skills) {
		this.skills = skills;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	public String[] getArmor() {
		return armor;
	}

	public void setArmor(String[] armor) {
		this.armor = armor;
	}

	
}
