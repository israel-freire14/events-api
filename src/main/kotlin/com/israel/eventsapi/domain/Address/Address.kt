package com.israel.eventsapi.domain.Address

import com.israel.eventsapi.domain.Event.Event
import lombok.AllArgsConstructor
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.Setter
import java.util.UUID
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.Table


@Entity
@Table(name="address")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
class Address (

    @Id
    @GeneratedValue
    private val id: UUID,

    private val city: String,

    private val uf: String,

    @ManyToOne
    @JoinColumn(name="event_id")
    private val  event: Event
)


