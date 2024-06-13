package deyvis.example.demo_jwt.User;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    //puede colocar query metodos
    Optional<User> findByUsername(String username);
}
