package bitlab.kinokz.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "halls")
@Getter
@Setter
public class Hall extends BaseModel {
	private int place;

}
