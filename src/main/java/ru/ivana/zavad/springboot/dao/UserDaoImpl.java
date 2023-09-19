package ru.ivana.zavad.springboot.dao;

import org.springframework.stereotype.Repository;
import ru.ivana.zavad.springboot.models.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    public List<User> index() {
        return entityManager.createQuery("from User ", User.class).getResultList();
    }

    public User show(Integer id) {
        return entityManager.find(User.class, id);
    }

    public void save(User user) {
        entityManager.persist(user);
        entityManager.flush();
    }

    public void update(Integer id, User updatedUser) {
        User person = entityManager.find(User.class, id);

        person.setName(updatedUser.getName());
        person.setAge(updatedUser.getAge());
        person.setEmail(updatedUser.getEmail());
    }

    public void delete(Integer id) {
        entityManager.remove(entityManager.find(User.class, id));
        entityManager.flush();
    }
}

