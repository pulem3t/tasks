package org.pulem3t.tasks.entry;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.json.JSONObject;
import org.pulem3t.tasks.enums.Role;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "USERS")
public class User {
	
	@Id
	@Column(name = "ID")
	@Getter @Setter private String id;
	
	@Column(name = "FIRSTNAME")
	@Getter @Setter private String firstName;
	
	@Column(name = "LASTNAME")
	@Getter @Setter private String lastName;
	
	@Column(name = "PATRONYM")
	@Getter @Setter private String patronym;
	
	@Column(name = "EMAIL")
	@Getter @Setter private String email;
	
	@Column(name = "PHONE")
	@Getter @Setter private String phone;
	
	@Column(name = "COMPANY")
	@Getter @Setter private String company;
	
	@Column(name = "ADMINROLE")
	@Getter @Setter private boolean adminRole;
	
	@Column(name = "USERROLE")
	@Getter @Setter private boolean userRole;
	
	@Column(name = "SUPPORTROLE")
	@Getter @Setter private boolean supportRole;
	
	@Column(name = "CREATEDATE")
	@Getter @Setter private long createDate;
	
	@Column(name = "LASTMODDATE")
	@Getter @Setter private long lastmodDate;
	
	public User(){
		this.id = "";
		this.firstName = "";
		this.lastName = "";
		this.patronym = "";
		this.adminRole = false;
		this.userRole = true;
		this.supportRole = false;
		this.createDate = System.currentTimeMillis();
		this.lastmodDate = System.currentTimeMillis();
	}
	
	@Override
	public String toString() {
		JSONObject o = new JSONObject();
		o.put("id", id);
		o.put("firstName", firstName);
		o.put("lastName", lastName);
		o.put("patronym", patronym);
		o.put("email", email);
		o.put("phone", phone);
		o.put("company", company);
		o.put("adminRole", adminRole);
		o.put("userRole", userRole);
		o.put("supportRole", supportRole);
		o.put("createDate", createDate);
		o.put("lastmodDate", lastmodDate);
		return o.toString();
	}

	public List<String> getRoles() {
		List<String> roles = new ArrayList<>();
		if(adminRole) roles.add(Role.ADMINISTRATOR.getRole());
		if(userRole) roles.add(Role.USER.getRole());
		if(supportRole) roles.add(Role.SUPPORT.getRole());
		return roles;
	}
}
