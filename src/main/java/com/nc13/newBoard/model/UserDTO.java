package com.nc13.newBoard.model;

import lombok.Data;

@Data
public class UserDTO {
    private int id;
    private String username;
    private String password;
    private String nickname;
    private int grade;
}
