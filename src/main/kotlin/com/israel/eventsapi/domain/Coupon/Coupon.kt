package com.israel.eventsapi.domain.Coupon

import com.israel.eventsapi.domain.Event.Event
import lombok.AllArgsConstructor
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.Setter
import java.util.Date
import java.util.UUID
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.Table


@Entity
@Table(name = "coupon")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
data class Coupon(

    @Id
    @GeneratedValue
    private val id: UUID,
    private val discount: Int,
    private val valid: Date,

    @ManyToOne
    @JoinColumn(name = "event_id")
    private val event:Event
)