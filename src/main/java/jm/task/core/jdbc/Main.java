package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();


        userService.saveUser("Anna", "Vorobeva", (byte) 23);

        userService.saveUser("Angelina", "Beregovaya", (byte) 21);

        userService.saveUser("Egor", "Mezhin", (byte) 24);

        userService.saveUser("Yana", "Seledtsova", (byte) 21);


        List<User> usersList = userService.getAllUsers();
        for(User user: usersList){
            System.out.println(user);
        }

        userService.cleanUsersTable();
        userService.dropUsersTable();


    }
}
