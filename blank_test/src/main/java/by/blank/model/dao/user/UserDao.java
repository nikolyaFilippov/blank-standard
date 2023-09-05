package by.blank.model.dao.user;

import by.blank.model.db.ConnectionManager;

public class UserDao {
    private static UserDao dao;

    public UserDao() {
        ConnectionManager.init();
    }
}
