package com.william.os.resources.exceptions;

import java.io.Serializable;

public class StandardError implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long Timestamp;
	private Integer status;
	private String error;

	public StandardError() {
		super();

	}

	public StandardError(Long timestamp, Integer status, String error) {

		super();
		Timestamp = timestamp;
		this.status = status;
		this.error = error;
	}

	public Long getTimestamp() {
		return Timestamp;
	}

	public void setTimestamp(Long timestamp) {
		Timestamp = timestamp;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
	

}
