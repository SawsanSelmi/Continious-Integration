package tn.esprit.esponline.service;

import tn.esprit.esponline.dao.IUserDAO;

public class UserServiceImpl implements IUserService {
	
	IUserDAO userDAO;

	public IUserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(IUserDAO userDAO) {
		this.userDAO = userDAO;
	}
 
}
