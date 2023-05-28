package cse.foodtruck.order.system.dto.user;

import cse.foodtruck.order.system.entity.user.User;
import lombok.*;

import java.sql.Timestamp;
import java.util.Date;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class UserDto {
    private String id;
    private String pw;
    private String name;
    private String email;
    private Timestamp signUpDate;
    private String form;
    private int balance;

    public UserDto(String id, String pw, String name, String email, Timestamp signUpDate, String form) {
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.email = email;
        this.signUpDate = signUpDate;
        this.form = form;
    }

    public static class UserBuilder {
        private String id;
        private String pw;
        private String name;
        private String email;
        private Timestamp signUpDate;
        private String form;
        private int balance;

        public UserBuilder id(String id) {
            this.id = id;
            return this;
        }

        public UserBuilder pw(String pw) {
            this.pw = pw;
            return this;
        }

        public UserBuilder name(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder signUpDate(Timestamp signUpDate) {
            this.signUpDate = signUpDate;
            return this;
        }

        public UserBuilder form(String form) {
            this.form = form;
            return this;
        }

        public UserBuilder balance(int balance) {
            this.balance = balance;
            return this;
        }

        public UserDto build() {
            return new UserDto(this);
        }
    }

    private UserDto(UserBuilder builder) {
        this.id = builder.id;
        this.pw = builder.pw;
        this.name = builder.name;
        this.email = builder.email;
        this.signUpDate = builder.signUpDate;
        this.form = builder.form;
        this.balance = builder.balance;
    }


    public static UserDto createDto(User entity) {
        return new UserBuilder()
                .id(entity.getId())
                .pw(entity.getPw())
                .name(entity.getName())
                .email(entity.getEmail())
                .signUpDate(entity.getSignUpDate())
                .form(entity.getForm())
                .balance(entity.getBalance())
                .build();
    }
}