package be.pxl.helpdesk.service;

import be.pxl.helpdesk.repository.UserRepository;
import be.pxl.helpdesk.rest.data.UserDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

	private final UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public List<UserDTO> getUsers() {
		return userRepository.findAll().stream().map(UserDTO::new).collect(Collectors.toList());
	}
}
