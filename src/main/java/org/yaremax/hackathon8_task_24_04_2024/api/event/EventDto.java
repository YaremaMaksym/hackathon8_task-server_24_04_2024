package org.yaremax.hackathon8_task_24_04_2024.api.event;

public record EventDto(
        Long id,
        Long creator_id,
        String title,
        String description
) {
}
