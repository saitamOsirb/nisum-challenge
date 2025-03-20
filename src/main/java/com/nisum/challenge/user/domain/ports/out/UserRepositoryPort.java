package com.nisum.challenge.user.domain.ports.out;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.nisum.challenge.user.domain.models.User;

public interface UserRepositoryPort {

	User save(User user);

	Optional<User> findById(UUID id);

	List<User> findAll();

	Optional<User> update(User user);

	boolean deleteById(UUID id);
}
