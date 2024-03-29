package com.aiwolves.webapp.controllers;

import com.aiwolves.webapp.dtos.UserDto;
import com.aiwolves.webapp.entities.User;
import com.aiwolves.webapp.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/users")
@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/me")
    public ResponseEntity<UserDto> authenticatedUser() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        
        User currentUser = (User) authentication.getPrincipal();
        
        UserDto user = new UserDto();
        	user.setCreatedAt(currentUser.getCreatedAt());
        	user.setLastupdate(currentUser.getLastupdate());
        	user.setUsername(currentUser.getUsername());
        	user.setAuthorities(currentUser.getAuthorities());  	
        	user.setAccountNonExpired(currentUser.isAccountNonExpired());
        	user.setAccountNonLocke(currentUser.isAccountNonLocked());
        	user.setCredentialsNonExpired(currentUser.isCredentialsNonExpired());
        	user.setEnabled(currentUser.isEnabled());       	
        	
        return ResponseEntity.ok(user);
    }

    @GetMapping("/")
    public ResponseEntity<List<User>> allUsers() {
        List <User> users = userService.allUsers();

        return ResponseEntity.ok(users);
    }
}
