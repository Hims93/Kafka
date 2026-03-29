package com.example.demo.DTO;


public class UserDto {
 private String user;
 @Override
public String toString() {
	return "UserDto [user=" + user + ", email=" + email + ", address=" + address + ", mobile=" + mobile + "]";
}
private String email;
 private String address;
 private String mobile;
public String getUser() {
	return user;
}
public void setUser(String user) {
	this.user = user;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
}
