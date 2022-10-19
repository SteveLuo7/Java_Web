package cn.itcast.dao;

import cn.itcast.domain.User;

import java.util.List;
import java.util.Map;

public interface UserDao {

    public List<User> findAll();

    User findUserByUsernameAndPassword(String username, String password);

    void add(User user);

    void delete(int parseInt);

    User findById(int parseInt);

    void update(User user);

    int findTotalCount(Map<String, String[]> condition);

    List<User> findByPage(int start, int rows, Map<String, String[]> condition);
}
