package be.pxl.helpdesk.rest.data;

public class CreateTicketCommentRequest {

	private String comment;
	private String reporter;
	private boolean solved;

	public String getComment() {
		return comment;
	}

	public String getReporter() {
		return reporter;
	}

	public boolean isSolved() {
		return solved;
	}
}
