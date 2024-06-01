package bitlab.kinokz.mapper;


import bitlab.kinokz.dto.UserDTO;
import bitlab.kinokz.model.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
	UserDTO toDtoUser(User user);

	User toModelUser(UserDTO userDTO);

	List<UserDTO> toDtoListUser(List<User> list);

	List<User> toUserList(List<UserDTO> list);
}
