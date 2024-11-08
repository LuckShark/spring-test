package com.lucascrud.userdept.repositories;

import com.lucascrud.userdept.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
