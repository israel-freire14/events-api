package com.israel.eventsapi.domain.Event

import org.springframework.web.multipart.MultipartFile
import java.util.Date

data class EventRequestDTO(
    var title: String,
    var description: String,
    var date: Date,
    var city: String,
    var state: String,
    var remote:Boolean,
    var eventUrl: String,
    var image: MultipartFile
)
