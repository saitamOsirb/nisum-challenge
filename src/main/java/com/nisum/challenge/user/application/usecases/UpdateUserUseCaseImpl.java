package com.nisum.challenge.user.application.usecases;

import java.util.Optional;

import com.nisum.challenge.user.domain.models.User;
import com.nisum.challenge.user.domain.ports.in.UpdateUserUseCase;
import com.nisum.challenge.user.domain.ports.out.UserRepositoryPort;

public class UpdateUserUseCaseImpl implements UpdateUserUseCase {
	
	public UpdateUserUseCaseImpl(UserRepositoryPort userRepositoryPort) {
		this.userRepositoryPort = userRepositoryPort;
	}

	private final UserRepositoryPort userRepositoryPort;

	@Override
	public Optional<User> updateUser(String id, User updateUser) {
		return userRepositoryPort.update(updateUser);
	}
}
