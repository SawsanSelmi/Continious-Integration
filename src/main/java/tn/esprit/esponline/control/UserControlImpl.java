package tn.esprit.esponline.control;

import tn.esprit.esponline.service.IUserService;

public class UserControlImpl {

	IUserService userService;

	public IUserService getUserService() {
		return userService;
	}

	public void setUserService(IUserService userService) {
		this.userService = userService;
	} 

}

