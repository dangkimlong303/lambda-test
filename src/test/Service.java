package test;

import com.sun.tools.javac.util.Pair;

import java.util.*;
import java.util.stream.Collectors;

public class Service {

    enum Gender {
        MALE(0, "Male"),
        FEMALE(1,"Female");

        private int code;
        private String name;

        Gender(int code, String name) {
            this.code = code;
            this.name = name;
        }

        public int getCode() {
            return code;
        }

        public String getName() {
            return name;
        }

    }


         List<User> users = new ArrayList<>();
         List<User> users2 = new ArrayList<>();

        public void showUsers() {

            for (int i = 1; i <= 100;i++) {
                users.add(new User(i,getRandomChar(),getRandomBoolean(),getRandomAgeBetween20to22()));
            }
            System.out.printf("%-10s %-20s %-15s %-20s \n","Id","Name","Sex","Age");
            users.forEach(user -> user.display());
        }

        public void showCountMaleUser() {
            long maleUser = users.stream().filter(user -> user.getSex().equalsIgnoreCase("male")).count();
            System.out.println("User male: " + maleUser);
            System.out.println("User female: " + (users.size() - maleUser));
        }

        public void listUserName() {
            Set<String> listName = users.stream().map(User::getName).collect(Collectors.toSet());
            listName.forEach(name -> {
                System.out.printf("%-10s %-10s \n","Name:",name);
            });
        }

        public void listUserAge() {
            List<Integer> listAge = users.stream().map(User::getAge).collect(Collectors.toList());
            listAge.forEach(System.out::println);
        }

        public void showSortUserByName() {
            users.sort(Comparator.comparing(User::getName).thenComparing(Comparator.comparing(User::getAge)));
            users.forEach(user -> user.display());
        }


        public void listUserNameDuplicate() {
            Map<String, List<User>> map = new HashMap<>();
            for (User user: users) {
                if (!map.containsKey(user.getName())) {
                    map.put(user.getName(), new ArrayList<>());
                }
                map.get(user.getName()).add(user);
            }
            List<String> list = new ArrayList<>(map.keySet());
            list.forEach(key -> {
                if (map.get(key).size() == 1) {
                    map.remove(key);
                }
            });
            System.out.println(map);
        }

        public void listUserNameAndAgeDuplicate() {
            Map<Pair<String,Integer>, List<User>> map = new HashMap();
            for (User user : users) {
                Pair<String,Integer> pair = Pair.of(user.getName(),user.getAge());
                if (!map.containsKey(pair)) {
                    map.put(pair, new ArrayList<>());
                }
                map.get(pair).add(user);
            }
            List<Pair<String,Integer>> list = new ArrayList<>(map.keySet());
            list.forEach(key -> {
                if (map.get(key).size() == 1) {
                    map.remove(key);
                }
            });
            System.out.println(map);
        }


    public static String getRandomChar() {
        List<String> list = Arrays.asList("f","r","u","i","t");
        Collections.shuffle(list);
        StringBuilder name = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            name.append(list.get(i));
        }
        return name.toString();
    }

    public static int getRandomAgeBetween20to22() {
        int age = (int) ((Math.random()*((22-20)+1))+20);
        return age;
    }

    public static String getRandomBoolean() {
        Random random = new Random();
        boolean sex = random.nextBoolean();
        return sex ? Gender.MALE.getName():Gender.FEMALE.getName();
    }
}
