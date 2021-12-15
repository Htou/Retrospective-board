package com.htou.retroboard.comment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {

    @Query("SELECT c FROM Comment c WHERE c.createdDate = ?1 AND c.createdDate = ?2 AND c.createdDate = ?3")
    List<Comment> findByCreatedYearAndMonthAndDay(int year, int month, int day);

}