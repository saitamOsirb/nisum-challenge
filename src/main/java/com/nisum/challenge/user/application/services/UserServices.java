package com.nisum.challenge.user.application.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.nisum.challenge.user.domain.models.User;
import com.nisum.challenge.user.domain.ports.in.CreateUserUseCase;
import com.nisum.challenge.user.domain.ports.in.DeleteUserUseCase;
import com.nisum.challenge.user.domain.ports.in.GetUserUseCase;
import com.nisum.challenge.user.domain.ports.in.UpdateUserUseCase;

public class UserServices implements CreateUserUseCase, GetUserUseCase, DeleteUserUseCase, UpdateUserUseCase {

	private final CreateUserUseCase createUserUseCase;
	private final UpdateUserUseCase updateUserUseCase;
	private final GetUserUseCase getUserUseCase;
	private final DeleteUserUseCase deleteUserUseCase;

	public UserServices(CreateUserUseCase createUserUseCase, UpdateUserUseCase updateUserUseCase,
			GetUserUseCase getUserUseCase, DeleteUserUseCase deleteUserUseCase) {
		super();
		this.createUserUseCase = createUserUseCase;
		this.updateUserUseCase = updateUserUseCase;
		this.getUserUseCase = getUserUseCase;
		this.deleteUserUseCase = deleteUserUseCase;
	}

	@Override
	public Optional<User> updateUser(String id, User updateUser) {
		return updateUserUseCase.updateUser(id, updateUser);
	}

	@Override
	public boolean deleteUser(UUID user) {
		return deleteUserUseCase.deleteUser(user);
	}

	@Override
	public Optional<User> getUser(UUID id) {
		return getUserUseCase.getUser(id);
	}

	@Override
	public List<User> getAllUser() {
		return getUserUseCase.getAllUser();
	}

	@Override
	public User createUser(User user) {
		return createUserUseCase.createUser(user);
	}

}
