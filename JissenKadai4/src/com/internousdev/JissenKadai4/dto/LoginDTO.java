/**
 *
 */
package com.internousdev.JissenKadai4.dto;

/**
 * @author internous
 *
 */
public class LoginDTO {
	private static String userName;
	private static String password;


	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		LoginDTO.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		LoginDTO.userName = userName;
	}
}
