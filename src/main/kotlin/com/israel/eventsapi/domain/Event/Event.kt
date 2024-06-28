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
    private val id: UUID,


    private val title: String,

    private val description: String,

    private val imgUrl: String,

    private val eventUrl: String,

    private val remote: Boolean,

    private val date: Date
)
