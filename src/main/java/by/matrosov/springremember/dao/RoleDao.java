package by.matrosov.springremember.dao;

import by.matrosov.springremember.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Role, Integer> {
}
