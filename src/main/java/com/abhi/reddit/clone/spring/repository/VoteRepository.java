package com.abhi.reddit.clone.spring.repository;

import com.abhi.reddit.clone.spring.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoteRepository extends JpaRepository<Vote,Long> {
}
