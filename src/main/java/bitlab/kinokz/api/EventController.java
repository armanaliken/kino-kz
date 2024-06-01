package bitlab.kinokz.api;


import bitlab.kinokz.BodySample.EventSample;
import bitlab.kinokz.BodySample.EventStatus;
import bitlab.kinokz.dto.EventDTO;
import bitlab.kinokz.services.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping(value = "/events")
@RestController
public class EventController {

	private final EventService eventService;

	@GetMapping(value = "/getAllEvents")
	public List<EventDTO> getAllEvents() {
		return eventService.getAllEvents();
	}

	@PreAuthorize("hasAnyRole('ROLE_ADMIN')")
	@PostMapping(value = "/addEvent")
	public EventDTO addEvent(@RequestBody EventSample eventSample) {
		return eventService.addEvent(eventSample);
	}

	@GetMapping(value = "/getEvent/{id}")
	public EventDTO getEventById(@PathVariable(name = "id") Long id) {
		return eventService.getEventById(id);
	}

	@PreAuthorize("hasAnyRole('ROLE_ADMIN')")
	@PostMapping(value = "/updateEvent")
	public EventDTO updateEvent(@RequestBody EventSample eventSample) {
		return eventService.updateEvent(eventSample);
	}

	@PreAuthorize("isAuthenticated()")
	@GetMapping(value = "/getAllActivityEvents")
	public List<EventDTO> getAllActivityEvents(){
		return eventService.getAllActivityEvents();
	}

	@PreAuthorize("hasAnyRole('ROLE_ADMIN')")
	@PostMapping(value = "/event-status-change")
	public EventDTO changeStatus(@RequestBody EventStatus eventStatus){
		return eventService.changeStatus(eventStatus);
	}
}
