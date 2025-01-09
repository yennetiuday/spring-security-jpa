package com.uday.spring_security_jpa.repo;

import com.uday.spring_security_jpa.models.Authority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorityRepository extends JpaRepository<Authority, Long> {
    List<Authority> findByUsername(String username);
}
