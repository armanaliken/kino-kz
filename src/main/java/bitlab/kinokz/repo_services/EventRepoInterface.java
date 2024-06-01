package bitlab.kinokz.repo_services;

import bitlab.kinokz.model.Event;

import java.util.List;

public interface EventRepoInterface {
	List<Event> getAllEvents();

	Event addEvent(Event event);

	Event getEventById(Long id);

	Event updateEvent(Event event);

	List<Event> getAllActivityEvents();
}
