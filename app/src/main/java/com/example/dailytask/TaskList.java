package com.example.dailytask;

public class TaskList {

    private static String task;

    public TaskList(String task) {
        this.task = task;
    }

    public static String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }
}
