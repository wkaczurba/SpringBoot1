package com;

import java.util.List;

import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

// Probably not the best of instantiating it, as there is no interface.
@Repository
public class CustomerRepository {

	JdbcOperations jdbc;
	
	public CustomerRepository(JdbcOperations jdbc) {
		this.jdbc = jdbc;
	}
	
	public void Save(Customer customer) {
		jdbc.update("insert into customers (firstName, lastName, phoneNumber, emailAddress) values (?, ?, ?, ?)", 
				customer.getFirstName(), customer.getLastName(), customer.getPhoneNumber(), customer.getEmailAddress());
	}
	
	public List<Customer> findAll() {
		return jdbc.query("select id, firstName, lastName, phoneNumber, emailAddress from customers", (rs, rowNum) -> {
			System.out.println(rs.toString());
			Customer customer = new Customer();
				customer.setId(rs.getLong(1));
				customer.setFirstName(rs.getString(2));
				customer.setLastName(rs.getString(3));
				customer.setPhoneNumber(rs.getString(4));
				customer.setEmailAddress(rs.getString(5));
			return customer;
		});
		
	}
	
}
