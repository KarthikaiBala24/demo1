package com.niit.model;

import java.util.List;


import com.niit.pojo.UserDetails;

public interface UserDetailsDAO {
	public boolean addUserDetails(UserDetails userdetails);
	public boolean deleteUserDetails(UserDetails userdetails);
	public boolean updateUserDetails(UserDetails userdetails);
	public UserDetails getUserDetails(int userdetailsId);
	public List<UserDetails> listUserDetails();

}
