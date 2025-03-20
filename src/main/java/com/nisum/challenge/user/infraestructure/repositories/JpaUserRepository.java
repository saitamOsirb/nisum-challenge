package com.nisum.challenge.user.infraestructure.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nisum.challenge.user.infraestructure.entities.UserEnitity;

public interface JpaUserRepository extends JpaRepository<UserEnitity,UUID> {

}
