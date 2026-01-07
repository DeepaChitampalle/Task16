package org.example.builderPattern;

public class Test {
        public static void main(String[] args) {

            User user1 = new User.Builder("Deepa")
                    .email("deepa@gmail.com")
                    .phone("9123456789")
                    .address("Bangalore")
                    .build();

            User user2 = new User.Builder("Nikita")
                    .email("nikita@gmail.com")
                    .build();

            System.out.println(user1);
            System.out.println(user2);
        }
}


