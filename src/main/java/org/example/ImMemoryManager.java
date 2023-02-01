package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ImMemoryManager implements ManagerInterface {
    private final Map<Integer,AbstractTask> taskMap = new HashMap<>();

    public ArrayList<AbstractTask> gettingAllTasks(){
        ArrayList<AbstractTask> tasksList = new ArrayList<>();
        tasksList.addAll(taskMap.values());
        return tasksList;
    }
    public void deletingAllTasks(){
        for (int key : taskMap.keySet()) {
            taskMap.remove(key);
        }
    }
    public AbstractTask getById(int id){
       return taskMap.get(id);
    }
    public void deleteAnTaskId(int id){
        taskMap.remove(id);
    }
    public void addTask(AbstractTask task){
        taskMap.put(task.getId(),task);
    }
    public void updatingTheTask(AbstractTask task){
        taskMap.put(task.getId(), task);
    }
    public ArrayList<Subtask> getListAllSubtaskBelongingToEpic(Epic epic){
        return epic.getSubtasks();
    }
}
