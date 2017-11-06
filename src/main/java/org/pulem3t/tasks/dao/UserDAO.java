package org.pulem3t.tasks.dao;

import java.util.List;

import org.pulem3t.tasks.entry.User;

public interface UserDAO {

	public List<User> getUsers();
	public User getUser(String id);
	public String addUser(User user);
	public void deleteUser(String id);
	public void updateUser(User user);
}
