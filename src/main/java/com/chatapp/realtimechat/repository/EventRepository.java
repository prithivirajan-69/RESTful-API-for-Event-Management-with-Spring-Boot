package com.chatapp.realtimechat.repository;

import com.chatapp.realtimechat.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}
