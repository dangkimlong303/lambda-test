package test;

import java.util.*;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {


        //count empty
//        List<String> stringList = Arrays.asList("long","","dat","dog","","cat");
//        int count = (int) stringList.stream().filter(string -> string.isEmpty()).count();
//        System.out.println(count);

        //print random
//        Random random = new Random();
//        random.ints().limit(5).forEach(System.out::println);

        //map list
//        List<Integer> numbers = Arrays.asList(1,5,3,9,7);
//        List<Integer> squareList = numbers.stream().map(i -> i*i).distinct().collect(Collectors.toList());
//        System.out.println(squareList);

//        System.out.println(getRandomChar());
//        System.out.println(getRandomAgeBetween20to22());
//        System.out.println(getRandomBoolean());

        //print list users
        List<User> users = new ArrayList<>();
        for (int i = 1; i <= 100;i++) {
            users.add(new User(i,getRandomChar(),getRandomBoolean(),getRandomAgeBetween20to22()));
        }
//        users.forEach(user -> user.display());
//        List<User> userList = users.stream().anyMatch()
        //list to map -> can duplicate key is getName
        Map<String,User> mapTest = users.stream().collect(Collectors.toMap(User::getName, user -> user, (o,n) -> n));
        System.out.println(mapTest);

        //count male and female
//        long countSex = users.stream().filter(user -> user.getSex().equals("male")).count();
//        System.out.println(countSex);
//        System.out.println(users.size() - countSex);

        //collect by name
//        List<String> listName = users.stream().map(user -> user.getName()).collect(Collectors.toList());
//        listName.forEach(System.out::println);

        //collect by age
//        List<Integer> listAge = users.stream().map(User::getAge).collect(Collectors.toList());
//        listAge.forEach(System.out::println);


        //collect users same name
//        Map<String,User> listNameDuplicate = new HashMap<>();
//        users.forEach(user -> listNameDuplicate.put(user.getName(),user));
//        System.out.println(listNameDuplicate);

        //collect users same name and age
        List<User> testa = new ArrayList<>();
        for (int i = 0; i< users.size(); i++){
            for (int j = 0; j< users.size();j++){
                if (users.get(i).getName().equals(users.get(j).getName())){
                    testa.add(users.get(i));
                    users.remove(j);
                }
            }
        }
//        System.out.println(testa);
        System.out.println(testa.size());


        //sort users by name
//        users.sort(Comparator.comparing(User::getName));
//        users.forEach(System.out::println);

    }

//    public static String getRandomChar() {
//        List<String> list = Arrays.asList("f","r","u","i","t");
//        StringBuilder name = new StringBuilder();
//        Random rand = new Random();
//
//        for (int i = 0; i < 3; i++) {
//            int randomIndex = rand.nextInt(list.size());
//            name.append(list.get(randomIndex));
//        }
//
//        return name.toString();
//    }

    public static String getRandomChar() {
        List<String> list = Arrays.asList("f","r","u","i","t");
        StringBuilder name = new StringBuilder();
//        List<Integer> rand = randomNumber();
        for (int i = 0; i < 3; i++) {
            Collections.shuffle(list);
//            int randomIndex = rand.get(i);
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
        return sex?"male":"female";
    }

    public static List<Integer> randomNumber() {
        List<Integer> numbers = Arrays.asList(0,1,2,3,4);
        Collections.shuffle(numbers);
        return numbers;
    }



}
