package com.wargaming.tech.controllers;

import com.wargaming.tech.dto.UserDto;
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

	@PostMapping(value = "/users")
	public ResponseEntity<Object> joinPool(@RequestBody @Valid UserDto user) {
		// TODO body
		return ResponseEntity.ok(new Object());
	}
}
