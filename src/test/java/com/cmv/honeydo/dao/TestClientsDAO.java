package com.cmv.honeydo.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cmv.honeydo.domain.Client;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/spring/honeydo-context.xml")
public class TestClientsDAO {
	
	@Autowired
	private ClientsDAO clientsDAO;
	
	@Test
	public void getClient() {
		Client client = clientsDAO.getClient(Integer.valueOf(1));
		
		System.out.print(client.toString());
	}

}
