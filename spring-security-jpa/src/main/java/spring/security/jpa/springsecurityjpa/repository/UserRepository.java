package spring.security.jpa.springsecurityjpa.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spring.security.jpa.springsecurityjpa.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>{

	Optional<User> findByUserName(String string);
	
}
