package com.capgemini.lesson14.mock;

public interface UserDAO {
User loadByUserNameAndPassword(String username, String password);
}
