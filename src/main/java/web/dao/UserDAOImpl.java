package web.dao;



import org.springframework.stereotype.Repository;
import web.entity.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO{
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> showAllUsers() {
        return entityManager.createQuery("from User ", User.class).getResultList();
    }
    @Override
    public User getUser(Long id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void save(User user) {
        entityManager.merge(user);
    }

    @Override
    public void delete(Long id) {
        User user = getUser(id);
        entityManager.remove(user);
    }

    @Override
    public void update(User user) {
        entityManager.merge(user);
    }
}
