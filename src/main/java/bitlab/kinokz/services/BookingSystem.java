package bitlab.kinokz.services;


import bitlab.kinokz.model.User;
import bitlab.kinokz.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookingSystem {


	private final UserRepository userRepository;

	public boolean minusBalance(User user, int price) {
		int currentBalance = user.getBalance() - price;
		if (user.getBalance() >= price) {
			user.setBalance(currentBalance);
			userRepository.save(user);
			return true;
		}
		return false;
	}

}
