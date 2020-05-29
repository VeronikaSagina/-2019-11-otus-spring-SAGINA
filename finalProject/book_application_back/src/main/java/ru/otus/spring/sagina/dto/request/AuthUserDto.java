package ru.otus.spring.sagina.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Getter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class AuthUserDto {
    @NotBlank
    @JsonProperty("login")
    private String login;
    @NotBlank
    @JsonProperty("password")
    private String password;
}