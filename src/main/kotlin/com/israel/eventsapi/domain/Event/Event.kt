package com.israel.eventsapi.domain.Event

import lombok.AllArgsConstructor
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.Setter
import javax.persistence.Table
import java.util.Date
import java.util.UUID
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id



@Table(name = "event")
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
data class Event(

    @Id
    @GeneratedValue
    private var id: UUID,

    private var title: String,

    private var description: String,

    private var imgUrl: String,

    private var eventUrl: String,

    private var remote: Boolean,

    private var date: Date
)
