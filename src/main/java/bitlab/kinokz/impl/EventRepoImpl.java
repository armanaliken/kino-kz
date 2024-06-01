package bitlab.kinokz.impl;

import bitlab.kinokz.model.Event;
import bitlab.kinokz.repo_services.EventRepoInterface;
import bitlab.kinokz.repository.EventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class EventRepoImpl implements EventRepoInterface {

	private final EventRepository eventRepository;

	@Override
	public List<Event> getAllEvents() {
		return eventRepository.findAll();
	}

	@Override
	public Event addEvent(Event event) {
		return eventRepository.save(event);
	}

	@Override
	public Event getEventById(Long id) {
		return eventRepository.findAllById(id);
	}

	@Override
	public Event updateEvent(Event event) {
		return eventRepository.save(event);
	}

	@Override
	public List<Event> getAllActivityEvents() {
		return eventRepository.findAllActivity();
	}
}
