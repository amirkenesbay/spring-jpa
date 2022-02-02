package com.amir.jpalesson;

import com.amir.jpalesson.entity.Role;
import com.amir.jpalesson.entity.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("main");
        EntityManager manager = factory.createEntityManager();

//        TypedQuery<User> query = manager.createQuery(
//                "select u from User u" , User.class);
//        List<User> users = query.getResultList();
//        for (User user : users) {
//            System.out.println(user.getFirstName() + " " + user.getLastName());
//        }
//        query
//                .getResultStream()
//                .map(user -> user.getFirstName() + " " + user.getLastName())
//                .forEach(System.out::println);

//        try {
//            manager.getTransaction().begin();
//            User user = new User();
//            user.setFirstName("Leon");
//            user.setLastName("Morales");
//            user.setBirthDate(LocalDate.of(1995, Month.DECEMBER, 12));
//            manager.persist(user);
//            manager.getTransaction().commit();
//        } catch (Exception e){
//            manager.getTransaction().rollback();
//            e.printStackTrace();
//        }

//        User user = manager.find(User.class, 2L);
//        System.out.println(user.getFirstName() + " " + user.getLastName());


//        try {
//            manager.getTransaction().begin();
//            User user = manager.find(User.class, 2L);
//            user.setFirstName("Ali");
//            manager.getTransaction().commit();
//        } catch (Exception e){
//            manager.getTransaction().rollback();
//            e.printStackTrace();
//        }

//        try {
//            manager.getTransaction().begin();
//            User user = manager.find(User.class, 4L);
//            manager.remove(user);
//            manager.getTransaction().commit();
//        } catch (Exception e){
//            manager.getTransaction().rollback();
//            e.printStackTrace();
//        }

//        User user = manager.find(User.class, 2L);
//        System.out.println(
//                "Full name: " + user.getFirstName() + " " + user.getLastName()
//        );
//        System.out.println("Role: " + user.getRole().getName());

        Role role = manager.find(Role.class, 3L);
        System.out.println("Role: " + role.getName());
        //        System.out.println("Users " + role.getUsers());
        System.out.println("Users:");
        List<User> userList = role.getUsers();
        for (User users : userList) {
            System.out.println(users);
        }

    }
}
