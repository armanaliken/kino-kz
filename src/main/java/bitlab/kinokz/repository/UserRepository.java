package bitlab.kinokz.repository;

import bitlab.kinokz.model.User;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);

	User findAllById(Long userId);

}
