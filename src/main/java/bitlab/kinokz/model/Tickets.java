package bitlab.kinokz.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tickets")
@Getter
@Setter
public class Tickets extends BaseModel {

	@ManyToOne
	private Event event;

	@ManyToOne
	private User user;

	@Column(name = "prime_code_ticket")
	private Long primeCodeTicket;

	private int place;
}
