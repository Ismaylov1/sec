package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDaoImpl;
import web.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    UserDaoImpl userDao;

    @Autowired
    public UserServiceImpl(UserDaoImpl userDao) {
        this.userDao = userDao;
    }


    @Override
    @Transactional
    public User getUserByName(String name) {
        return userDao.getUserByName(name);
    }

    @Override
    @Transactional
    public void add(User user) {
        userDao.add(user);
    }

    @Override
    @Transactional
    public void updateUsers(User user) {
        userDao.updateUsers(user);
    }

    @Override
    @Transactional
    public void remove(User user) {
        userDao.remove(user);
    }

    @Override
    public User getUserById(long id) {
      return userDao.getUserById(id);
    }

    @Override
    @Transactional
    public List<User> listUsers() {
        return userDao.listUsers();
    }
}
