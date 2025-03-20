package com.nisum.challenge.user.domain.ports.in;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.nisum.challenge.user.domain.models.User;

public interface GetUserUseCase {
	Optional<User> getUser(UUID id);

	List<User> getAllUser();

}
