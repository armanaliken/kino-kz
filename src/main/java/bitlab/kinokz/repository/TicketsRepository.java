package bitlab.kinokz.repository;

import bitlab.kinokz.model.Tickets;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@Transactional
public interface TicketsRepository extends JpaRepository<Tickets, Long> {
	List<Tickets> findAll();

	Tickets findTicketsById(Long id);

	List<Tickets> findAllByUserId(Long id);

	List<Tickets> findAllByEvent_Id(Long id);

	@Query(value = "SELECT e FROM Tickets e WHERE e.user.id = :id and e.event.status = 'true'")
	List<Tickets> getAllActivityTicketsByUserId(Long id);
}
