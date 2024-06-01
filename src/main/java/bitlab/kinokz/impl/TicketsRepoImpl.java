package bitlab.kinokz.impl;

import bitlab.kinokz.model.Tickets;
import bitlab.kinokz.repo_services.TicketsRepoInterface;
import bitlab.kinokz.repository.TicketsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketsRepoImpl implements TicketsRepoInterface {

	@Autowired
	private TicketsRepository ticketsRepository;

	@Override
	public List<Tickets> getAllTickets() {
		return ticketsRepository.findAll();
	}

	@Override
	public Tickets getTicketById(Long id) {
		return ticketsRepository.findTicketsById(id);
	}

	@Override
	public Tickets addTicket(Tickets tickets) {
		return ticketsRepository.save(tickets);
	}


	public List<Tickets> getTicketByEventId(Long id) {
		return ticketsRepository.findAllByEvent_Id(id);
	}

	@Override
	public List<Tickets> getAllTicketByUserId(Long id) {
		return ticketsRepository.findAllByUserId(id);
	}

	public List<Tickets> getAllActivityTicketsByUserId(Long id){
		return ticketsRepository.getAllActivityTicketsByUserId(id);
	}
}
