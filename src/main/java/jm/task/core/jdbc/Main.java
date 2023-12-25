package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        final UserService userService = new UserServiceImpl();
        //userService.createUsersTable();
        //userService.saveUser("Lous","Black", (byte) 31);
        userService.saveUser("Mini","Mouse", (byte) 7);
        //userService.getAllUsers();
        //userService.removeUserById(1);
        //userService.getAllUsers();
        userService.cleanUsersTable();
        //userService.dropUsersTable();

    }
}
