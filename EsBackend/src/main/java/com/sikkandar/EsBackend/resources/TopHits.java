package com.sikkandar.EsBackend.resources;

import java.util.List;

import com.sikkandar.EsBackend.model.EventLogs;
import com.sikkandar.EsBackend.model.KeyValues;
import com.sikkandar.EsBackend.service.Connection;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/getTopHits")
public class TopHits {
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public  List<KeyValues> getTopHits(EventLogs details){
		
		String criteria = details.getCriteria();
		String value = details.getValue();
		String eventCategory= details.getEventCategory();
		
		Connection connection = new Connection();
        
        List<KeyValues> topKey = connection.findTopHits(value,criteria,eventCategory);
        
        return topKey;
	}
}
