package org.pulem3t.tasks.enums;

public enum Role {
	ADMINISTRATOR ("administrator"),
	USER ("user"),
	SUPPORT ("support");
	
	private String role;
	
	private Role(String role) {
		this.role = role;
	}
	
	public String getRole(){
		return role;
	}
}
