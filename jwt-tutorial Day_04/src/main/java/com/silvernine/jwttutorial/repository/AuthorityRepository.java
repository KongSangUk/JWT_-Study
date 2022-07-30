package com.silvernine.jwttutorial.repository;

import com.silvernine.jwttutorial.entity.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepository extends JpaRepository<Authority, String> {
}