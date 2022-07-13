/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package main;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author bilan
 */
public class Main {

    public static void main(String[] args) {

        //Comperable example
        User user1 = new User();
        user1.age = 14;

        User user2 = new User();
        user2.age = 10;
        User user3 = new User();
        user3.age = 14;
        User user4 = new User();
        user4.age = 20;

        System.out.println(user1.compareTo(user2));
        System.out.println(user1.compareTo(user3));
        System.out.println(user1.compareTo(user4));

        //Comperator example
        Comparator<User> comperator = (User o1, User o2) -> {
            if (o1.age == o2.age) {
                return 0;
            } else if (o2.age > o1.age) {
                return 1;
            } else {
                return -1;
            }
        };

        System.out.println(comperator.compare(user1, user2));
        System.out.println(comperator.compare(user2, user3));
        System.out.println(comperator.compare(user1, user3));
        System.out.println(comperator.compare(user1, user1));

    }
}
