package com.gan.hbdemo.run;


import java.util.Date;

import org.hibernate.Session;

import com.gan.hbdemo.beans.UserInfo;
import com.gan.hbdemo.util.HibernateUtil;

public class HbDemoTest {

	public static void main(String[] args) {
		System.out.println("Hibernate one to one (Annotation)");
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		UserInfo userInfo = new UserInfo();
		//userInfo.setId(1);
		userInfo.setName("Ganesh Devendran");
		userInfo.setJoiningDate(new Date());
		session.beginTransaction();
		
		session.save(userInfo);
		session.getTransaction().commit();

		UserInfo userInfos = session.get(UserInfo.class, userInfo.getId());
		System.out.println(userInfos.getName());
		System.out.println(userInfos.getJoiningDate());
		System.out.println("Done");

	}

}
