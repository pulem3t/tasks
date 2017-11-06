package org.pulem3t.tasks.dao;

import java.util.List;

import org.pulem3t.tasks.entry.Task;

public interface TaskDAO {
	public List<Task> getTasks();
	public Task getTask(String id);
	public List<Task> getLastAddedTasks();
	public String addTask(Task task);
	public void deleteTask(String id);
	public void updateTask(Task task);
}
