package dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.Address;
@Repository
public class AddressDAO {
	@Autowired
 private SessionFactory factory;
 
 @Transactional
 public void saveAddress(Address a) {
	 Session s =  factory.getCurrentSession();
	 s.saveOrUpdate(a);
 }
}
