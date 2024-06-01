package bitlab.kinokz.mapper;

import bitlab.kinokz.dto.EventDTO;
import bitlab.kinokz.model.Event;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EventMapper {
	EventDTO toDto(Event event);

	Event toModel(EventDTO eventDTO);

	List<EventDTO> toDtoList(List<Event> list);

	List<Event> toEventList(List<EventDTO> list);
}
