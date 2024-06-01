package bitlab.kinokz.services;


import bitlab.kinokz.BodySample.TicketBody;
import bitlab.kinokz.EmailTicketSender;
import bitlab.kinokz.dto.TicketDTO;
import bitlab.kinokz.impl.TicketsRepoImpl;
import bitlab.kinokz.mapper.TicketMapper;
import bitlab.kinokz.model.Event;
import bitlab.kinokz.model.Tickets;
import bitlab.kinokz.model.User;
import bitlab.kinokz.repository.EventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TicketsService {

	private final TicketsRepoImpl ticketsRepo;
	private final UserService userService;
	private final TicketMapper mapper;
	private final EmailTicketSender sender;
	private final ListsForData lists;
	private final EventRepository eventRepository;
	private final BookingSystem bookingSystem;
	private final TicketNumberGenerator ticketNumberGenerator;

	public TicketDTO addTicket(TicketBody ticketBody) {
		User user = (User) userService.loadUserByUsername(ticketBody.getUsername());
		if (user != null) {
			Tickets tickets1 = new Tickets();
			Event event = eventRepository.findAllById(ticketBody.getId());
			if (bookingSystem.minusBalance(user, ticketBody.getPrice())) {
				int random = ticketNumberGenerator.generateTicketNumber();
				tickets1.setPrimeCodeTicket((long) random);
				tickets1.setUser(user);
				tickets1.setEvent(event);
				lists.minusPlace(ticketBody.getPlace());
				tickets1.setPlace(ticketBody.getPlace());
				sender.sendEmail(user.getEmail(), "Your ticket", tickets1);
				return mapper.toDto(ticketsRepo.addTicket(tickets1));
			}
		}
		return null;
	}

	public List<TicketDTO> getTickets() {
		return mapper.toDtoList(ticketsRepo.getAllTickets());
	}


	public TicketDTO getTicketByUserId(Long id) {
		return mapper.toDto(ticketsRepo.getTicketById(id));
	}

	public List<TicketDTO> getTicketByEventId(Long id) {
		return mapper.toDtoList(ticketsRepo.getTicketByEventId(id));
	}

	public List<TicketDTO> getAllTicketByUserId(Long id) {
		return mapper.toDtoList(ticketsRepo.getAllTicketByUserId(id));
	}

	public List<TicketDTO> getAllActivityTicketsByUserId(Long id) {
		return mapper.toDtoList(ticketsRepo.getAllActivityTicketsByUserId(id));
	}

}
