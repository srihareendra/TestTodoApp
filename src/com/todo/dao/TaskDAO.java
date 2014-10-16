package com.todo.dao;

import java.util.List;

import com.todo.entity.Task;

public interface TaskDAO {

	public void saveOrUpdateTask(Task task);
	public List<Task> listTask();
	public Task listTaskById(Long taskId);
	public void deleteTask(Long taskId);
}
