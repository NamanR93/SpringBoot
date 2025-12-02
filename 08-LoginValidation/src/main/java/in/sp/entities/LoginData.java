package in.sp.entities;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class LoginData {

    @NotBlank(message = "User name required!!")
    @Size(min = 3, max = 12, message = "must be between 3-12 characters !!")
    private String userName;

    
    @NotBlank(message = "Email required!!")
    @Email(regexp ="^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$")
    private String email;

    
    
    @AssertTrue(message="You must agree to terms")
    private Boolean agreed;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    

    public Boolean getAgreed() {
		return agreed;
	}

	public void setAgreed(Boolean agreed) {
		this.agreed = agreed;
	}

	@Override
    public String toString() {
        return "LoginData [userName=" + userName + ", email=" + email + "]";
    }
}
