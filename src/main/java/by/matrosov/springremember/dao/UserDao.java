package by.matrosov.springremember.dao;

import by.matrosov.springremember.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer> {
}
