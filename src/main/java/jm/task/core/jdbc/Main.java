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
        System.out.println("User с именем — Anna добавлен в базу данных");
        userService.saveUser("Angelina", "Beregovaya", (byte) 21);
        System.out.println("User с именем — Angelina добавлен в базу данных");
        userService.saveUser("Egor", "Mezhin", (byte) 24);
        System.out.println("User с именем — Egor добавлен в базу данных");
        userService.saveUser("Yana", "Seledtsova", (byte) 21);
        System.out.println("User с именем — Yana добавлен в базу данных");

        List<User> usersList = userService.getAllUsers();
        for(User user: usersList){
            System.out.println(user);
        }

        userService.cleanUsersTable();
        userService.dropUsersTable();


    }
}
