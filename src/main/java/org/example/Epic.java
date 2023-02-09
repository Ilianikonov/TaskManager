package org.example;

import java.util.ArrayList;

public class Epic extends AbstractTask {
    private final ArrayList<Subtask> subtasks = new ArrayList<>();

    public Epic(int id, String name, String descriptions, Status status) {
        super(id, name, descriptions, status);
    }
    public void addSubtaskEpic(Subtask subtask){
        subtasks.add(subtask);
    }
    public ArrayList<Subtask> getSubtasks() {
        return subtasks;
    }

}
