package com.israel.eventsapi.repositories

import com.israel.eventsapi.domain.Event.Event
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface EventRepository: JpaRepository<Event, UUID> {

}
