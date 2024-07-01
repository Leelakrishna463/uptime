package com.decathlon.uptime.dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
@Setter
public class StatusDTO {
    private LocalDateTime localDateTime;
    private String status;
}
