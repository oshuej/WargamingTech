package com.wargaming.tech.services;

import com.wargaming.tech.dto.UserDto;
import org.springframework.stereotype.Service;

@Service
public interface MatchMakerService {
	void joinPool(UserDto user);
}
