package com.nisum.challenge.user.domain.ports.in;

import java.util.Optional;

import com.nisum.challenge.user.domain.models.User;

public interface UpdateUserUseCase {
	Optional<User> updateUser(String id, User updateUser);
}
