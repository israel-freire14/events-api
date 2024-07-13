package com.israel.eventsapi.domain.Event

import lombok.AllArgsConstructor
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.Setter
import org.hibernate.annotations.GenericGenerator
import java.util.Date
import java.util.UUID
import javax.persistence.*


@Table(name = "event")
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
 class Event(

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private val id: UUID,

    private var title: String,

    private var description: String,

    private var imgUrl: String,

    private var eventUrl: String,

    private var remote: Boolean,

    private var date: Date
)
