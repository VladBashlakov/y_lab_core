package ru.y_lab.homework_2;

import java.util.*;

public class Task_1 {

       /*
        Task1
            Убрать дубликаты, отсортировать по идентификатору, сгруппировать по имени

            Что должно получиться Key: Amelia
                Value:4
                Key: Emily
                Value:1
                Key: Harry
                Value:3
                Key: Jack0
                Value:1
         */

    public static void main(String[] args) {

        printTask();

        getFilteredList(RAW_DATA);

    }

    public static void getFilteredList(Person[] arr) {

        HashMap<Integer, String> people = new HashMap<>();

        for (Person person : arr) {
            people.put(person.getId(), person.getName());
        }

        List<String> peopleStr = new ArrayList<>();

        for (Map.Entry<Integer, String> entry : people.entrySet()) {
            peopleStr.add(entry.getValue() + " (" + entry.getKey() + ")");
        }

        Collections.sort(peopleStr);

        int index;
        String tempStr;
        String nextStr = "test";
        int id = 0;

        for (String s : peopleStr) {
            index = s.indexOf(" ");
            tempStr = s.substring(0, index).trim();

            if (!s.startsWith(nextStr)) {
                nextStr = tempStr;
                id = 1;
                System.out.println(nextStr + ":");
            }

            System.out.println(id + " - " + s);
            id++;
        }
    }


    public static void printTask() {
        System.out.println("Raw data:");
        System.out.println();

        for (Person person : RAW_DATA) {
            System.out.println(person.id + " - " + person.name);
        }

        System.out.println();
        System.out.println("**************************************************");
        System.out.println();
        System.out.println("Duplicate filtered, grouped by name, sorted by name and id:");
        System.out.println();
    }

    static class Person {
        final int id;

        final String name;

        Person(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Person person)) return false;
            return getId() == person.getId() && getName().equals(person.getName());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getId(), getName());
        }

        @Override
        public String toString() {

            return name + " (" + id + ")";
        }
    }

    private static final Person[] RAW_DATA = new Person[]{
            new Person(0, "Harry"),
            new Person(0, "Harry"), // дубликат
            new Person(1, "Harry"), // тёзка
            new Person(2, "Harry"),
            new Person(3, "Emily"),
            new Person(4, "Jack"),
            new Person(4, "Jack"),
            new Person(5, "Amelia"),
            new Person(5, "Amelia"),
            new Person(6, "Amelia"),
            new Person(7, "Amelia"),
            new Person(8, "Amelia"),
    };



        /*  Raw data:

        0 - Harry
        0 - Harry
        1 - Harry
        2 - Harry
        3 - Emily
        4 - Jack
        4 - Jack
        5 - Amelia
        5 - Amelia
        6 - Amelia
        7 - Amelia
        8 - Amelia

        **************************************************

        Duplicate filtered, grouped by name, sorted by name and id:

        Amelia:
        1 - Amelia (5)
        2 - Amelia (6)
        3 - Amelia (7)
        4 - Amelia (8)
        Emily:
        1 - Emily (3)
        Harry:
        1 - Harry (0)
        2 - Harry (1)
        3 - Harry (2)
        Jack:
        1 - Jack (4)
     */

}







