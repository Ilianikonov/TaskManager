package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ImMemoryManager implements ManagerInterface {
    private final Map<Integer,Task> taskMap = new HashMap<>();
    private final Map<Integer,Epic> epicMap = new HashMap<>();
    private final Map<Integer,Subtask> subtaskMap = new HashMap<>();
    @Override
    public ArrayList<AbstractTask> getAllTasks(){
        return new ArrayList<>(taskMap.values());
    }
    @Override
    public void deleteAllTasks(){
        taskMap.clear();
    }

    @Override
    public void deleteAllEpic() {
        epicMap.clear();
    }

    @Override
    public void deleteAllSubtask() {
        subtaskMap.clear();
    }

    @Override
    public Task getByIdTask(int id) {
        return taskMap.get(id);
    }

    @Override
    public Epic getByIdEpic(int id) {
        return epicMap.get(id);
    }

    @Override
    public Subtask getByIdSubtask(int id) {
        return subtaskMap.get(id);
    }
    @Override
    public void deleteAnTaskId(int id){
        taskMap.remove(id);
    }

    @Override
    public void deleteAnEpicId(int id) {
        epicMap.remove(id);
    }
    @Override
    public void deleteAnSubtaskId(int id) {
        subtaskMap.remove(id);
    }
    @Override
    public void addEpic(Epic task){
        epicMap.put(task.getId(),task);
    }
    @Override
    public void updateTheEpic(Epic task){
        epicMap.put(task.getId(), task);
    }
    @Override
    public ArrayList<Subtask> getListAllSubtaskBelongingToEpic(Epic epic){
        return epic.getSubtasks();
    }
    @Override
    public void addTask(Task task){
        taskMap.put(task.getId(),task);
    }
    @Override
    public void updateTheTask(Task task){
        taskMap.put(task.getId(), task);
    }
    @Override
    public void addSubtask(Subtask task){
        subtaskMap.put(task.getId(),task);
    }
    @Override
    public void updateTheSubtask(Subtask task){
        subtaskMap.put(task.getId(), task);
    }
}
