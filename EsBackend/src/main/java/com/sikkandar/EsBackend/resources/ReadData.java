package com.sikkandar.EsBackend.resources;

import java.util.List;

import com.sikkandar.EsBackend.model.Details;
import com.sikkandar.EsBackend.model.EventLogs;
import com.sikkandar.EsBackend.model.KeyValues;
import com.sikkandar.EsBackend.service.Connection;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/readdata")
public class ReadData {
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public List<EventLogs> getEventLogs(EventLogs details){
		
		int currentPage = details.getCurrentPage();
		int recordsPerPage = details.getRecordsPerPage();
		String criteria = details.getCriteria();
		String value = details.getValue();
		
		System.out.println("CP="+currentPage+" RP="+recordsPerPage+
				" Criteria="+criteria+" value="+value);
		
		Connection connection = new Connection();
		List<EventLogs> eventLogs = connection.findEventLogs(currentPage,
                recordsPerPage,value,criteria);
		
		long row= connection.getNumberOfRows(value,criteria);
        int rows = (int)row;
        
        int noOfPages = rows / recordsPerPage;
        
        if(noOfPages%recordsPerPage>0)
        {
        	noOfPages++;
        }
//		for(EventLogs result: eventLogs)
//		{
//			System.out.println("Id "+result.getId());
//			System.out.println("Type: "+result.getType());
//			System.out.println("Severity: "+result.getSeverity());
//			System.out.println("Source: "+result.getSource());
//			System.out.println("EventId "+result.getEventId());
//			System.out.println("Message: "+result.getMessage());
//			System.out.println("TimeGenerated "+result.getTimeGenerated());
//			System.out.println();
//		}
		return eventLogs;
        //return noOfPages;
	}

}
