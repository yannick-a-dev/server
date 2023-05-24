package com.springangul.springangulproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springangul.springangulproject.models.Server;

public interface ServerRepository extends JpaRepository<Server, Long> {

	Server findByIpAddress(String ipAddress);
}
