package my.app.activity08.repository;

import java.util.Optional;
import my.app.activity08.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Integer>{
    Optional<User> findByUsername(String username);
}
