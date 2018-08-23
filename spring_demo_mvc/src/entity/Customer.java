package entity;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
* @author shouqing E-mail:shouqing777@gmail.com
* @version 創建時間：2018年8月14日 上午11:58:12
* 類說明
*/
public class Customer {
	
	private String firstName;
	
	@NotNull(message="is required")
	@Size(min=1 ,message="is required")
	private String lastName;

	@NotNull(message="is required")
	@Min(value=0 ,message="value is between 0 and 10")
	@Max(value=10 ,message="value is between 0 and 10")
	private Integer freePasses;
	
	@Pattern(regexp="^[a-zA-Z0-9]{5}",message="only digit 5 chars/digits")
	private String postCode;
	
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
	public Integer getFreePasses() {
		return freePasses;
	}
	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	
}
