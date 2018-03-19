package com.niit.model;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.pojo.UserDetails;

@Transactional

@Repository("userDetailsDAOImpl")

public class UserDetailsDAOImpl implements UserDetailsDAO {

	@Autowired
	SessionFactory sessionFactory;

	public boolean addUserDetails(UserDetails userDetails)

	{

		try {

			Session session = sessionFactory.openSession();
			session.save(userDetails);
			session.close();

			return true;
		} catch (Exception e)

		{
			e.printStackTrace();
			return false;
		}

	}

	public boolean updateUserDetails(UserDetails userDetails) {
		try {
			Session session = sessionFactory.openSession();
			session.update(userDetails);
			session.close();

			return true;
		} catch (Exception e)

		{
			e.printStackTrace();
			return false;
		}
		
	}

	public boolean deleteUserDetails(UserDetails userDetails) {
		try {
			sessionFactory.getCurrentSession().delete(userDetails);
			return true;
		} catch (Exception e) {
			System.out.println("Exception Arised:" + e);
			return false;
		}
	}

	public List<UserDetails> listUserDetails() {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from UserDetails");
		List<UserDetails> listUserDetails = query.list();
		session.close();
		return listUserDetails;
	}

	public UserDetails getUserDetails(int userdetailsId) {
		// TODO Auto-generated method stub
		return null;
	}

}
