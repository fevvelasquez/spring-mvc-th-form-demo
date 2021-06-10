package me.fevvelasquez.spring.mvc.th.form.demo.model.domain;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class User {
	// @NotEmpty
	// @NotNull
	@Size(min = 3, max = 8)
	@NotBlank(message = "username must not be blank")
	private String username;
	@Email
	@NotBlank
	private String email;

	public User(String username, String email) {
		this.username = username;
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
