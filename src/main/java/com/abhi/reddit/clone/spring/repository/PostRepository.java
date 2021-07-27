package com.abhi.reddit.clone.spring.repository;

import com.abhi.reddit.clone.spring.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post,Long> {
}
