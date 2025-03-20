package com.nisum.challenge.user.application.usecases;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.nisum.challenge.user.domain.models.User;
import com.nisum.challenge.user.domain.ports.in.GetUserUseCase;
import com.nisum.challenge.user.domain.ports.out.UserRepositoryPort;

public class GetUserUseCaseImpl implements GetUserUseCase {

	private final UserRepositoryPort userRepositoryPort;

	public GetUserUseCaseImpl(UserRepositoryPort userRepositoryPort) {
		this.userRepositoryPort = userRepositoryPort;
	}

	@Override
	public Optional<User> getUser(UUID id) {
		return userRepositoryPort.findById(id);
	}

	@Override
	public List<User> getAllUser() {
		return userRepositoryPort.findAll();
	}

}
