package com.sikkandar.EsBackend.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class KeyValues {
	
	private Object topValue;
	private long count;
	
	public KeyValues() {}
	public Object getTopValue() {
		return topValue;
	}
	public void setTopValue(Object topValue) {
		this.topValue = topValue;
	}
	public long getCount() {
		return count;
	}
	public void setCount(long count) {
		this.count = count;
	}

}
