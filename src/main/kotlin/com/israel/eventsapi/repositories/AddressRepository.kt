package com.israel.eventsapi.repositories

import com.israel.eventsapi.domain.Address.Address
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface AddressRepository: JpaRepository<Address, UUID> {
}