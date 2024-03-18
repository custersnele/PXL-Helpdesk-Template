package be.pxl.helpdesk.service;

import be.pxl.helpdesk.domain.Ticket;
import be.pxl.helpdesk.domain.User;
import be.pxl.helpdesk.exception.BusinessException;
import be.pxl.helpdesk.exception.NotFoundException;
import be.pxl.helpdesk.repository.TicketRepository;
import be.pxl.helpdesk.repository.UserRepository;
import be.pxl.helpdesk.rest.data.CreateTicketRequest;
import org.springframework.stereotype.Service;

@Service
public class TicketService {

	private final UserRepository userRepository;
	private final TicketRepository ticketRepository;

	public TicketService(UserRepository userRepository, TicketRepository ticketRepository) {
		this.userRepository = userRepository;
		this.ticketRepository = ticketRepository;
	}

	public long createTicket(CreateTicketRequest createTicketRequest) {
		User reporter = userRepository.findUserByEmail(createTicketRequest.getReporter()).orElseThrow(() -> new NotFoundException("No user found with email [" + createTicketRequest.getReporter() + "]"));
		if (reporter.isLocked()) {
			throw new BusinessException("Account [" + createTicketRequest.getReporter() + "] is currently locked.");
		}
		Ticket ticket = new Ticket(reporter, createTicketRequest.getSubject(), createTicketRequest.getBody());
		ticket = ticketRepository.save(ticket);
		return ticket.getId();
	}
}
