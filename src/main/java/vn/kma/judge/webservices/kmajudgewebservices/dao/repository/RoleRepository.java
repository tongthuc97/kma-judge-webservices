package vn.kma.judge.webservices.kmajudgewebservices.dao.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vn.kma.judge.webservices.kmajudgewebservices.dao.model.Role;
import vn.kma.judge.webservices.kmajudgewebservices.dao.model.RoleName;





@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}