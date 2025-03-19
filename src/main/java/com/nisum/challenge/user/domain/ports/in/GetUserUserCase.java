package com.nisum.challenge.user.domain.ports.in;

import java.util.List;
import java.util.Optional;

import com.nisum.challenge.user.domain.models.User;

public interface GetUserUserCase {
	Optional<User> getUser(String id);

	List<User> getAllUser();

}
