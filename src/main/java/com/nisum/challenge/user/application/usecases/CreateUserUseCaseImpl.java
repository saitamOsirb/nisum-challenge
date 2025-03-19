package com.nisum.challenge.user.application.usecases;

import com.nisum.challenge.user.domain.models.User;
import com.nisum.challenge.user.domain.ports.in.CreateUserUseCase;
import com.nisum.challenge.user.domain.ports.out.UserRepositoryPort;

public class CreateUserUseCaseImpl implements CreateUserUseCase {

	private final UserRepositoryPort userRepositoryPort;

	public CreateUserUseCaseImpl(UserRepositoryPort userRepositoryPort) {
		this.userRepositoryPort = userRepositoryPort;
	}

	@Override
	public User createUser(User user) {
		return userRepositoryPort.save(user);
	}

	

}
