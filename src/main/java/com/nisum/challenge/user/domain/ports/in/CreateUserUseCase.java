package com.nisum.challenge.user.domain.ports.in;

import com.nisum.challenge.user.domain.models.User;

public interface CreateUserUseCase {
	User createUser(User user);
}
