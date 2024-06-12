package com.cct_site.cct_site.dto;


//We use Dto classes to transfer data between the controller layer and the view layer. We also use DTO classes for form binding.

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TeacherDTO {

    private Long id;

    @NotEmpty
    private String firstName;

    @NotEmpty
    private String lastName;

    @NotEmpty(message = "Please provide an email address")
    @Email
    private String email;

    @NotEmpty(message = "Password should not be empty")
    private String password;
}
