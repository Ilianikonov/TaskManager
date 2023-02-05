package org.example;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public interface ManagerInterface {

    ArrayList<AbstractTask> gettingAllTasks();
    void deletingAllTasks();
    AbstractTask getById(int id);
    void deleteAnTaskId(int id);
    void addTask(AbstractTask task);
    void updatingTheTask(AbstractTask task);
    ArrayList<Subtask> getListAllSubtaskBelongingToEpic(Epic epic);
}
