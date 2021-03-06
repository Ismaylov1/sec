package web.dao;

import web.model.Role;
import web.model.User;

import java.util.List;

public interface UserDao {
    User getUserByName(String name);

    void add(User user);

    void updateUsers(User user);

    void remove(User user);

    User getUserById(long id);

    List<User> listUsers();

    Role getRoleByName(String name);

    List<Role> listRoles();


}
