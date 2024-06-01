package bitlab.kinokz.repo_services;

import bitlab.kinokz.model.User;

import java.util.List;

public interface UserRepoInterface {
	User getUserById(Long id);
	User addUser(User user);
	List<User> getAllUsers();

	User updateParam(User user);

	User getUserByEmail(String email);
}
