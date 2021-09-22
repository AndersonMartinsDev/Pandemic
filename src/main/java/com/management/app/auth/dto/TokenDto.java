package com.management.app.auth.dto;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class TokenDto {
    private String type;
    private String token;
    private String expiration;
}
