package com.company.Ex1;

public class Main {

    public static void main(String[] args) {
        UserService userService = new UserService();
//        userService.showUser();
//        userService.sortUserByName();
//        userService.showCountUserMaleAndFemal();

//        userService.showUserCollectByNameDuplicate();
//        System.out.println("---------");
//        userService.showUserCollectByNameDuplicateVer2();

        userService.showUserCollectByNameAndAgeDuplicate();
        System.out.println("---------");
        userService.showUserColletByNameAndAgeDuplicateVer2();
//        userService.showUserCollectByName();
//        userService.showUserCollectByAge();
    }

}
