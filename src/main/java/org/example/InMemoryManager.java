package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class InMemoryManager extends Manager {
    private final Map<Integer,Task> taskMap = new HashMap<>();
    private final Map<Integer,Epic> epicMap = new HashMap<>();
    private final Map<Integer,Subtask> subtaskMap = new HashMap<>();

    @Override
    public ArrayList<Task> getAllTasks(){
        return new ArrayList<>(taskMap.values());
    }

    @Override
    public ArrayList<Epic> getAllEpic(){
        return new ArrayList<>(epicMap.values());
    }

    @Override
    public ArrayList<Subtask> getAllSubtask(){
        return new ArrayList<>(subtaskMap.values());
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
    public Task getTaskById(int id) {
        return taskMap.get(id);
    }

    @Override
    public Epic getEpicById(int id) {
        return epicMap.get(id);
    }

    @Override
    public Subtask getSubtaskById(int id) {
        return subtaskMap.get(id);
    }
    @Override
    public void deleteTaskById(int id){
        taskMap.remove(id);
    }

    @Override
    public void deleteEpicById(int id) {
        epicMap.remove(id);
    }
    @Override
    public void deleteSubtaskById(int id) {
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
