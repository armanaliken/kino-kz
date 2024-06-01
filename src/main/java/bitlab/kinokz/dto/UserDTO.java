package bitlab.kinokz.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {

	private String email;
	private String fullName;
	private String imgLink;

	private int balance;
}
