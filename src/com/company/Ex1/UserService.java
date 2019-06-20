package com.company.Ex1;

import java.util.*;
import java.util.stream.Collectors;

public class UserService {
    List<User> users = new ArrayList<>();

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

    public UserService() {
        for (int i = 1; i <= 50; i++) {
            users.add(new User(i,getRandomName(),getRandomGender(), getRandomAgeFrom20To22()));
        }
    }

    public void showUser() {
        users.forEach(User::display);
    }

    public void sortUserByName() {
        users.sort(Comparator.comparing(User::getName));
        users.forEach(User::display);
    }

    public void showUserCollectByNameDuplicate() {
        Map<String,List<User>> mapUser = new HashMap<>();
        users.forEach(user -> {
            if (!mapUser.containsKey(user.getName())) {
                mapUser.put(user.getName(), new ArrayList<>());
            }
            mapUser.get(user.getName()).add(user);
        });
        List<String> listNameUser = new ArrayList<>(mapUser.keySet());
        listNameUser.forEach(key -> {
            if (mapUser.get(key).size() == 1) {
                mapUser.remove(key);
            }
        });
        System.out.println(mapUser);
        System.out.println(mapUser.size());
    }

    public void showUserCollectByNameAndAgeDuplicate() {
        Map<String, List<User>> mapUser = new HashMap<>();
        users.forEach(user -> {
            if (!mapUser.containsKey(user.getName() + user.getAge())) {
                mapUser.put(user.getName() + user.getAge(),new ArrayList<>());
            }
            mapUser.get(user.getName() + user.getAge()).add(user);
        });
        List<String> listNameUser = new ArrayList<>(mapUser.keySet());
        listNameUser.forEach(key ->{
            if (mapUser.get(key).size() == 1) {
                mapUser.remove(key);
            }
        });
        System.out.println(mapUser);
        System.out.println(mapUser.size());
        //sort map
        Map<String,List<User>> result = mapUser.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue,newValue) -> oldValue, LinkedHashMap::new));
    }

    public void showUserCollectByName() {
        List<String> listName = users.stream().map(User::getName).collect(Collectors.toList());
        listName.forEach(name -> System.out.printf("%-10s %-10s \n","Name:",name));
    }

    public void showUserCollectByAge() {
        List<Integer> listAge = users.stream().map(User::getAge).collect(Collectors.toList());
        listAge.forEach(age -> System.out.printf("%-10s %-10d \n","Age:",age));
    }

    public void showCountUserMaleAndFemal() {
        long count = users.stream().filter(user -> user.getGender().equals(Gender.MALE.getName())).count();
        System.out.println("User male: " + count);
        System.out.println("User female: " + (users.size() - count));
    }

    public String getRandomName() {
        List<String> listName = Arrays.asList("f","r","u","i","t");
        Collections.shuffle(listName);
        StringBuilder name = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            name.append(listName.get(i));
        }
        return name.toString();
    }

    public String getRandomGender() {
        Random random = new Random();
        return random.nextBoolean() ? Gender.MALE.getName() : Gender.FEMALE.getName();
    }

    public Integer getRandomAgeFrom20To22() {
        return (int) ((Math.random() * 3) + 20);
    }
}
