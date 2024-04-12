package struts_login_valid;

import com.opensymphony.xwork2.ActionSupport;

public class login extends ActionSupport{
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String username;
  private String password;
  private String phoneno;
  private String email;
  
  public String execute() {
	  return SUCCESS;
  }
  
  public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}
  
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getPhoneno() {
	return phoneno;
}
public void setPhoneno(String phoneno) {
	this.phoneno = phoneno;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
  

public void validate() {
  if(getUsername().length()==0) {
	  addFieldError("username",getText("Username is required"));
  }
  
  if(getPassword().length()==0) {
	  addFieldError("password", getText("password is required"));
  }
  
  if(getPhoneno().length()==0) {
	  addFieldError("phoneno", getText("Phone number is required"));
  }
  else if (!(getPhoneno().length() == 10)) {
	  addFieldError("phoneno", getText("Enter 10 digit number"));
  }
 
  if (getEmail().length()==0) {
	  addFieldError("email", getText("Add email"));
  }
}
}


