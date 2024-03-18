package be.pxl.helpdesk.rest.data;

import java.time.LocalDateTime;

public class TicketCommentDTO {
	private UserDTO reporter;
	private String comment;
	private LocalDateTime dateTime;

//	public TicketCommentDTO(TicketComment ticketComment) {
//		this.reporter = new UserDTO(ticketComment.getReporter());
//		this.comment = ticketComment.getComment();
//		this.dateTime = ticketComment.getDateCreated();
//	}

	public UserDTO getReporter() {
		return reporter;
	}

	public String getComment() {
		return comment;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}
}
