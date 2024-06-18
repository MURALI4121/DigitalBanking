package com.DigitalBanking.UserManagement.DTO;

import lombok.Data;

@Data
public class UserUpdateDTO {
    private String email;
    private String role;
    private String password;
}
