package test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class DateLong {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("f","r","u","i","t",null);
        List<Integer> list1 = Arrays.asList(1,2,null,3,4,5,null);
        System.out.println(list1);

        List<Integer> test = list1.stream().filter(Objects::nonNull).collect(Collectors.toList());
        System.out.println(test);

    }
}
