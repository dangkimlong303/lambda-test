package com.company.Ex1;

public class Main {

    public static void main(String[] args) {
        UserService userService = new UserService();
        userService.showUser();
        userService.sortUserByName();
        userService.showCountUserMaleAndFemal();
        userService.showUserCollectByNameDuplicate();
        userService.showUserCollectByNameAndAgeDuplicate();
        userService.showUserCollectByName();
        userService.showUserCollectByAge();
    }

}