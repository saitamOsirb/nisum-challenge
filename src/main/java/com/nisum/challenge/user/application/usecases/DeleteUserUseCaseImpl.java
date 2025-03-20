package com.nisum.challenge.user.application.usecases;

import java.util.UUID;

import com.nisum.challenge.user.domain.ports.in.DeleteUserUseCase;
import com.nisum.challenge.user.domain.ports.out.UserRepositoryPort;

public class DeleteUserUseCaseImpl implements DeleteUserUseCase{

	private final UserRepositoryPort userRepositoryPort;
	
	public DeleteUserUseCaseImpl(UserRepositoryPort userRepositoryPort) {
		this.userRepositoryPort = userRepositoryPort;
	}
	
	@Override
	public boolean deleteUser(UUID id) {
		return userRepositoryPort.deleteById(id);
	}

}
