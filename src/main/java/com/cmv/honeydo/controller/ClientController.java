package com.cmv.honeydo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cmv.honeydo.dao.ClientsDAO;
import com.cmv.honeydo.domain.Client;

@RestController
@RequestMapping("/client")
public class ClientController {
	
	@Autowired
	private ClientsDAO clientsDAO;
	
	@RequestMapping(value = "/default", method = RequestMethod.GET)
	 public Client getClient() {
	  return clientsDAO.getClient(Integer.valueOf(1));
	 }
	
	 @RequestMapping(value = "/id/{id}", method = RequestMethod.GET)
	 public String getGreeting(@PathVariable Integer id) {
	  String result="Hello "+ clientsDAO.getClient(id);  
	  return result;
	 }

}
