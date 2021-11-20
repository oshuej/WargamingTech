package com.wargaming.tech.controllers;

import com.wargaming.tech.dto.UserDto;
import com.wargaming.tech.services.MatchMakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(
		produces = MediaType.APPLICATION_JSON_VALUE,
		value = {"wargaming/matchmaking/v1"}
)
public class MatchMakerController {

	private final MatchMakerService matchMakerService;

	@Autowired
	public MatchMakerController(MatchMakerService matchMakerService) {
		this.matchMakerService = matchMakerService;
	}

	@PostMapping(value = "/users")
	public ResponseEntity<Object> joinPool(@RequestBody @Valid UserDto user) {
		matchMakerService.joinPool(user);
		return ResponseEntity.ok(new Object());
	}
}
