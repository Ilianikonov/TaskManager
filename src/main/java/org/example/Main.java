package org.example;

public class Main {
    public static void main(String[] args) {
        FileManager fileManager = new FileManager();
        Task task = new Task(2,"gmepmg","eogk", Status.NEW);
        fileManager.addTask(task);
    }
}