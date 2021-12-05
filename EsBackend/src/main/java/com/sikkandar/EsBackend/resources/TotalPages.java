package com.sikkandar.EsBackend.resources;

import com.sikkandar.EsBackend.model.EventLogs;
import com.sikkandar.EsBackend.service.Connection;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/getpages")
public class TotalPages {
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public	int getEventLogs(EventLogs details){
		
		int recordsPerPage = details.getRecordsPerPage();
		String criteria = details.getCriteria();
		String value = details.getValue();
		
		Connection connection = new Connection();
		
		long row= connection.getNumberOfRows(value,criteria);
        int rows = (int)row;
        
        int noOfPages = rows / recordsPerPage;
        
        if(noOfPages%recordsPerPage>0)
        {
        	noOfPages++;
        }
        
        return noOfPages;
	}

}
