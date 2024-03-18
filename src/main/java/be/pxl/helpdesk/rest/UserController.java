package be.pxl.helpdesk.rest;

import be.pxl.helpdesk.rest.data.UserDTO;
import be.pxl.helpdesk.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("users")
@RestController
public class UserController {

	private final UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping
	public List<UserDTO> getAllUsers() {
		return userService.getUsers();
	}
}
