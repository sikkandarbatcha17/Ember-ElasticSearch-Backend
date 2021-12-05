package com.sikkandar.EsBackend;

import java.util.List;

import com.sikkandar.EsBackend.model.EventLogs;
import com.sikkandar.EsBackend.model.KeyValues;

public interface IConnection {
	List<EventLogs> findEventLogs(int currentPage, int numOfRecords,String eventId,String logEvent);
    long getNumberOfRows(String eventId,String logEvent);
    List<KeyValues> findTopHits(String eventId,String logEvent,String eventCat);
}
