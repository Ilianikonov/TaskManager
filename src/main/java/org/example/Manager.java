package org.example;

import java.util.ArrayList;

public abstract class Manager {

    private final TaskFactory taskFactory;

    public Manager() {
        taskFactory = new TaskFactory(this);
    }

    public TaskFactory getTaskFactory() {
        return taskFactory;
    }

    public abstract ArrayList<Task> getAllTasks();
    public abstract ArrayList<Epic> getAllEpic();
    public abstract ArrayList<Subtask> getAllSubtask();
    public abstract void deleteAllTasks();
    public abstract void deleteAllEpic();
    public abstract void deleteAllSubtask();
    public abstract Task getByIdTask(int id);
    public abstract Epic getEpicById(int id);
    public abstract Subtask getByIdSubtask(int id);
    public abstract void deleteAnTaskId(int id);
    public abstract void deleteAnEpicId(int id);
    public abstract void deleteAnSubtaskId(int id);
    public abstract void addTask(Task task);
    public abstract void addEpic(Epic task);
    public abstract void addSubtask(Subtask task);
    public abstract void updateTheEpic(Epic task);
    public abstract void updateTheSubtask(Subtask task);
    public abstract void updateTheTask(Task task);
    public abstract ArrayList<Subtask> getListAllSubtaskBelongingToEpic(Epic epic);
}
