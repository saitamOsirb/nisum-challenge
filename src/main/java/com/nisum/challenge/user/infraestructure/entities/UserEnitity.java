package com.nisum.challenge.user.infraestructure.entities;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import com.nisum.challenge.user.domain.models.User;

@Table(name = "user")
@Entity
public class UserEnitity {
	@Id
	@Column(name = "id", columnDefinition = "BINARY(16)")
	@GeneratedValue
	private UUID id;
	private String name;
	private String email;
	private String password;
	private String phoneNumber;
	private String cityCode;
	private String countryCode;

	public UserEnitity() {

	}

	public UserEnitity(UUID id, String name, String email, String password, String phoneNumber, String cityCode,
			String countryCode) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.cityCode = cityCode;
		this.countryCode = countryCode;
	}

	public static UserEnitity fromDomainModel(User user) {
		return new UserEnitity(user.getId(), user.getName(), user.getEmail(), user.getPassword(), user.getPhoneNumber(),
				user.getCityCode(), user.getCountryCode());

	}

	public User toDomainModel() {
		return new User(id, name, email, password, phoneNumber, cityCode, countryCode);
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
}
