package test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
//        Service service = new Service();
//        service.showUsers();
//        service.showCountMaleUser();
//        service.listUserName();
////        service.listUserAge();
//        System.out.println("----------");
//        service.showSortUserByName();
////        service.listUserTest();
////        service.listUserTestName();
////        service.listUserTestNameAndAge();
//        service.listUserNameDuplicate();
//        System.out.println("------------");
////        service.listUserNameAndAgeDuplicate();


        System.out.println(EnumTest.Type.CUSTOM.ordinal());
        System.out.println(EnumTest.Type.LONGDK.ordinal());
        System.out.println(EnumTest.Type.DUC_ANH.ordinal());
        System.out.println(EnumTest.Type.FOAL_AT_FOOT.ordinal());
        System.out.println(EnumTest.Type.DAT.ordinal());

        Date d = null;
        System.out.println(d);
        Date f = new Date(1537729200000L);
        //printing value of Date
        System.out.println("current Date: " + d);

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        //formatted value of current Date
//        System.out.println("Milliseconds to Date: " + df.format(d));

        DateFormat a = new SimpleDateFormat("MM-dd");

        //formatted value of current Date
//        System.out.println("Milliseconds to : " + a.format(d));

//        String as = a.format(d);

        System.out.println(Math.subtractExact(1537383600000L,1537729200000L));

    }
}
