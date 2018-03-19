package com.niit.model;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.pojo.Category;
@Transactional
@Repository("categoryDAOImpl")
public class CategoryDAOImpl implements CategoryDAO {
	
	@Autowired
	SessionFactory sessionFactory;

	public boolean addCategory(Category category)
	{
		
		 try
			{
				
			Session session=sessionFactory.openSession();
			session.save(category);
			session.close();
			
				return true;
			}
			catch(Exception e)
			
			{
				e.printStackTrace();
				return false;	
			}
			
		}


	public boolean updateCategory(Category category) {
		
		try
		{
		sessionFactory.getCurrentSession().update(category);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised:"+e);
		return false;
		}
	}

	public boolean deleteCategory(Category category) {
		try
		{
		sessionFactory.getCurrentSession().update(category);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised:"+e);
		return false;
		}
	}

	public Category getCategory(int categoryId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Category> listCategories() {
		// TODO Auto-generated method stub
		return null;
	}

}
