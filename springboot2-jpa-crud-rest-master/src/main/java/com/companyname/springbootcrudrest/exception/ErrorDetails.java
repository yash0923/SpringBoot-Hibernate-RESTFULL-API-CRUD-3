package com.companyname.springbootcrudrest.exception;
/**
 * Created in Eclipse IDE.
 * Project : springboot2-jpa-crud-rest-master
 * User: yash
 * Date: 18/01/2020
 */

import java.util.Date;

public class ErrorDetails {
	private Date timestamp;
	private String message;
	private String details;

	public ErrorDetails(Date timestamp, String message, String details) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public String getMessage() {
		return message;
	}

	public String getDetails() {
		return details;
	}
}
