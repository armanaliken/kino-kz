package bitlab.kinokz.repo_services;

import bitlab.kinokz.model.Tickets;

import java.util.List;

public interface TicketsRepoInterface {
	List<Tickets> getAllTickets();

	Tickets getTicketById(Long id);

	Tickets addTicket(Tickets tickets);


	List<Tickets> getTicketByEventId(Long id);

	List<Tickets> getAllTicketByUserId(Long id);

	List<Tickets> getAllActivityTicketsByUserId(Long id);
}
