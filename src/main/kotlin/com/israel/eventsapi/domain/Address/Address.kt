package com.israel.eventsapi.domain.Address

import com.israel.eventsapi.domain.Event.Event
import lombok.AllArgsConstructor
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.Setter
import java.util.UUID
import javax.persistence.*


@Entity
@Table(name="address")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
class Address (

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, unique = true, nullable = false)
    private var id: UUID,

    private var city: String,

    private var uf: String,

    @ManyToOne
    @JoinColumn(name="event_id")
    private val  event: Event
)


