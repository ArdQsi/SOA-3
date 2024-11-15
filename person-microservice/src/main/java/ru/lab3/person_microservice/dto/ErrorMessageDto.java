package ru.lab3.person_microservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorMessageDto {
    private Integer code;
    private String message;
}
