package org.example;

import java.util.ArrayList;

public interface ManagerInterface {

    ArrayList<AbstractTask> gettingAllTasks();
    void deletingAllTasks();
    AbstractTask getById(int id);
    void deleteAnTaskId(int id);
    void addTask(AbstractTask task);
    void updatingTheTask(AbstractTask task);
    ArrayList<Subtask> getListAllSubtaskBelongingToEpic(Epic epic);
}
