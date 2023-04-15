package com.frank.common.model.dto;

import lombok.Data;

@Data
public class UserDTO {
    private String username;
    private String password;
    private String email;
    private String phone;
    private String question;
    private String answer;

    public static UserDTO buildDummy() {
        UserDTO user = new UserDTO();
        user.setUsername("username");
        user.setPassword("password");
        user.setEmail("email");
        user.setPhone("phone");
        user.setQuestion("question");
        user.setAnswer("answer");
        return user;
    }
}
