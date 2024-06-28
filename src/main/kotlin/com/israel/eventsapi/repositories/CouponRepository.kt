package com.israel.eventsapi.repositories

import com.israel.eventsapi.domain.Coupon.Coupon
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface CouponRepository: JpaRepository<Coupon, UUID> {
}