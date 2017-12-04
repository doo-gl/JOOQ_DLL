package doo.gl.jooq.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import doo.gl.jooq.model.User;

public interface UserRepository extends JpaRepository<User, String> {



}
