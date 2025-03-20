package com.nisum.challenge.user.infraestructure.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.nisum.challenge.user.application.services.UserServices;
import com.nisum.challenge.user.application.usecases.CreateUserUseCaseImpl;
import com.nisum.challenge.user.application.usecases.DeleteUserUseCaseImpl;
import com.nisum.challenge.user.application.usecases.GetUserUseCaseImpl;
import com.nisum.challenge.user.application.usecases.UpdateUserUseCaseImpl;
import com.nisum.challenge.user.domain.ports.out.ExternalServicePort;
import com.nisum.challenge.user.domain.ports.out.UserRepositoryPort;
import com.nisum.challenge.user.infraestructure.repositories.JpaUserRepositoryAdapter;

@Configuration
public class ApplicationConfig {

	@Bean
	public UserServices userService(UserRepositoryPort userRepositoryPort) {
		return new UserServices(new CreateUserUseCaseImpl(userRepositoryPort),
				new UpdateUserUseCaseImpl(userRepositoryPort), new GetUserUseCaseImpl(userRepositoryPort),
				new DeleteUserUseCaseImpl(userRepositoryPort));
	}

	@Bean
	public UserRepositoryPort userRepositoryPort(JpaUserRepositoryAdapter jpaUserRepositoryAdapter) {
		return jpaUserRepositoryAdapter;
	}
	
	@Bean
	public ExternalServicePort externalServicePort() {
		return new ExternalServicePort();
	}
	
}
