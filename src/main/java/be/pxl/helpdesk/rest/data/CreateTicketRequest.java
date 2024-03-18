package be.pxl.helpdesk.rest.data;

import be.pxl.helpdesk.domain.Priority;

public class CreateTicketRequest {

	private String subject;
	private String body;
	private String reporter;
	private Priority priority;

	public String getSubject() {
		return subject;
	}

	public String getBody() {
		return body;
	}

	public String getReporter() {
		return reporter;
	}

	public Priority getPriority() {
		return priority;
	}
}
