package org.example;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public interface ManagerInterface {

    ArrayList<AbstractTask> getAllTasks();
    void deleteAllTasks();
    void deleteAllEpic();
    void deleteAllSubtask();
    Task getByIdTask(int id);
    Epic getByIdEpic(int id);
    Subtask getByIdSubtask(int id);
    void deleteAnTaskId(int id);
    void deleteAnEpicId(int id);
    void deleteAnSubtaskId(int id);
    void addTask(Task task);
    void addEpic(Epic task);
    void addSubtask(Subtask task);
    void updateTheEpic(Epic task);
    void updateTheSubtask(Subtask task);
    void updateTheTask(Task task);
    ArrayList<Subtask> getListAllSubtaskBelongingToEpic(Epic epic);
}
