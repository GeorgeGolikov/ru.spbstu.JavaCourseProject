package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.entity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer>
{
    Optional<User> findUserByUserName(String userName);
}
