package test;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        service.showUsers();
        service.showCountMaleUser();
        service.listUserName();
//        service.listUserAge();
        System.out.println("----------");
        service.showSortUserByName();
//        service.listUserTest();
//        service.listUserTestName();
//        service.listUserTestNameAndAge();
        service.listUserNameDuplicate();
        System.out.println("------------");
//        service.listUserNameAndAgeDuplicate();

    }
}
