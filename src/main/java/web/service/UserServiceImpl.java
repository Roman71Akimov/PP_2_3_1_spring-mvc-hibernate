package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.UserDAO;
import web.entity.User;
import javax.transaction.Transactional;
import java.util.List;
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDAO userDAO;
    @Override
    public List<User> showAllUsers() {
        return userDAO.showAllUsers();
    }

    @Override
    public User getUser(Long id) {
        return userDAO.getUser(id);
    }

    @Override
    @Transactional
    public void save(User user) {
    userDAO.save(user);
    }

    @Override
    @Transactional
    public void delete(Long id) {
    userDAO.delete(id);
    }

    @Override
    @Transactional
    public void update(User user) {
    userDAO.update(user);
    }
}
