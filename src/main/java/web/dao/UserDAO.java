package web.dao;

import web.entity.User;

import java.util.List;

public interface UserDAO {
    public List <User> showAllUsers();
    public User getUser(Long id);

    public void save(User user);

    public void delete(Long id);

    public void update(User user);



}
