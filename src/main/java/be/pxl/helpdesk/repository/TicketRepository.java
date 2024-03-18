package be.pxl.helpdesk.repository;

import be.pxl.helpdesk.domain.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {

}
