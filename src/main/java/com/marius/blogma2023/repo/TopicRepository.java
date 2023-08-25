package com.marius.blogma2023.repo;

import com.marius.blogma2023.entity.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TopicRepository extends JpaRepository<Topic, Long> {
//List<Topic> findByTitle(String topicTitle);
}
