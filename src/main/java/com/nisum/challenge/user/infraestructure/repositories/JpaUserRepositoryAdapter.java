package com.nisum.challenge.user.infraestructure.repositories;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

import com.nisum.challenge.user.domain.models.User;
import com.nisum.challenge.user.domain.ports.out.UserRepositoryPort;
import com.nisum.challenge.user.infraestructure.entities.UserEnitity;

public class JpaUserRepositoryAdapter implements UserRepositoryPort {

	private final JpaUserRepository jpaUserRepository;

	public JpaUserRepositoryAdapter(JpaUserRepository jpaUserRepository) {
		this.jpaUserRepository = jpaUserRepository;
	}

	@Override
	public User save(User user) {
		UserEnitity userEntity = UserEnitity.fromDomainModel(user);
		UserEnitity savedUserEntity = jpaUserRepository.save(userEntity);
		return savedUserEntity.toDomainModel();
	}

	@Override
	public Optional<User> findById(UUID id) {
		return jpaUserRepository.findById(id).map(UserEnitity::toDomainModel);
	}

	@Override
	public List<User> findAll() {
		return jpaUserRepository.findAll().stream().map(UserEnitity::toDomainModel).collect(Collectors.toList());
	}

	@Override
	public Optional<User> update(User user) {

		if (jpaUserRepository.existsById(user.getId())) {
			UserEnitity userEntity = UserEnitity.fromDomainModel(user);
			UserEnitity updateUserEntity = jpaUserRepository.save(userEntity);
			return Optional.of(updateUserEntity.toDomainModel());
		}
		return Optional.empty();
	}

	@Override
	public boolean deleteById(UUID id) {
		if (jpaUserRepository.existsById(id)) {
			jpaUserRepository.deleteById(id);
			return true;
		}
		return false;
	}

}
