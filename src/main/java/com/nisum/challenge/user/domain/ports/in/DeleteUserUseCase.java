package com.nisum.challenge.user.domain.ports.in;

import java.util.UUID;

public interface DeleteUserUseCase {

	boolean deleteUser(UUID user);
}
