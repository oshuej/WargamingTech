package com.wargaming.tech.dto;
import javax.validation.constraints.NotNull;


public class UserDto {
	@NotNull
	private String name;
	@NotNull
	private double skill;
	@NotNull
	private double latency;

	public String getName () {
		return name;
	}

	public void setName (String name) {
		this.name = name;
	}

	public double getSkill () {
		return skill;
	}

	public void setSkill (double skill) {
		this.skill = skill;
	}

	public double getLatency () {
		return latency;
	}

	public void setLatency (double latency) {
		this.latency = latency;
	}
}
