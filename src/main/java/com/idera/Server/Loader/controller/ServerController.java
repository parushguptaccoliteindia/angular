package com.idera.Server.Loader.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.idera.Server.Loader.model.Server;

@RestController
@RequestMapping("/api/server")
public class ServerController {

	@RequestMapping("/list")
	public ResponseEntity<List<Server>> getAuthenticatedUser() {
	
		List<Server> server_list= new ArrayList<Server>();
		
		Server server =new Server(Long.valueOf(1),"Abcd",true);
		
		Server server1= new Server(Long.valueOf(2),"Def",false);
		
		Server server2= new Server(Long.valueOf(3),"Fgh",true);
		
		server_list.add(server);
		server_list.add(server1);
		server_list.add(server2);
		
		return new ResponseEntity<>(server_list,
				HttpStatus.OK);
	}
	
}
