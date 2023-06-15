package com.marciogleik.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marciogleik.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
