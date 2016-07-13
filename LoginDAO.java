package com.niit.ShoppingCartWebApp;

public class LoginDAO {
	public boolean isValidUser(String UserID,String Password)
	{
		if(UserID.equals(Password))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	

}

