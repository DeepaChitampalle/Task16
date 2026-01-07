package org.example.builderPattern;

public class User {


    private final String name;
    private final String email;
    private final String phone;
    private final String address;

    private User(Builder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.phone = builder.phone;
        this.address = builder.address;
    }


        public static class Builder {

            private final String name;   // mandatory
            private String email;
            private String phone;
            private String address;

            public Builder(String name) {
                this.name = name;
            }

            public Builder email(String email) {
                this.email = email;
                return this;
            }

            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            public Builder address(String address) {
                this.address = address;
                return this;
            }

            public User build() {
                return new User(this);
            }
        }

        @Override
        public String toString() {
            return "User [name=" + name + ", email=" + email +
                    ", phone=" + phone + ", address=" + address + "]";
        }
}


