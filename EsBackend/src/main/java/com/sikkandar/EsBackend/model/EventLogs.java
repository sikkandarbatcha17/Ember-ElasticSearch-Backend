package com.sikkandar.EsBackend.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class EventLogs {
	
	private Object Id;
	private Object Type;
	private Object Severity;
	private Object Source;
    private Object EventId;
    private Object Message;
    private Object TimeGenerated;
    private int currentPage;
	private int recordsPerPage;
	private String criteria;
	private String value;
	private int noOfPages;
	private String eventCategory;
    
	public EventLogs(){
    	
    }
	
	public String getEventCategory() {
		return eventCategory;
	}

	public void setEventCategory(String eventCategory) {
		this.eventCategory = eventCategory;
	}
	
    public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getRecordsPerPage() {
		return recordsPerPage;
	}

	public void setRecordsPerPage(int recordsPerPage) {
		this.recordsPerPage = recordsPerPage;
	}

	public String getCriteria() {
		return criteria;
	}

	public void setCriteria(String criteria) {
		this.criteria = criteria;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public int getNoOfPages() {
		return noOfPages;
	}

	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}
    
    public Object getId() {
		return Id;
	}
	public void setId(Object id) {
		Id = id;
	}

	public Object getType() {
		return Type;
	}
	public void setType(Object type) {
		Type = type;
	}
	public Object getSeverity() {
		return Severity;
	}
	public void setSeverity(Object severity) {
		Severity = severity;
	}
	public Object getSource() {
		return Source;
	}
	public void setSource(Object source) {
		Source = source;
	}
	public Object getEventId() {
		return EventId;
	}
	public void setEventId(Object eventId) {
		EventId = eventId;
	}
	public Object getMessage() {
		return Message;
	}
	public void setMessage(Object message) {
		Message = message;
	}
	public Object getTimeGenerated() {
		return TimeGenerated;
	}
	public void setTimeGenerated(Object timeGenerated) {
		TimeGenerated = timeGenerated;
	}
	
}

