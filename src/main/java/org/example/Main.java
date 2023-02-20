package org.example;

public class Main {
    public static void main(String[] args) {
        FileManager fileManager = new FileManager();
        Task task = new Task(2, "gmepmg", "eogk", Status.NEW);
        Task task1 = new Task(4, "gmepmg", "eogk", Status.NEW);
        fileManager.addTask(task);
        fileManager.addTask(task1);
        task.setName("fafsbs");
        fileManager.updateTheTask(task);
        fileManager.deleteAllTasks();
    }
}