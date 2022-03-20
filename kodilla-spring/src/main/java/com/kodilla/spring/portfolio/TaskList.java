package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private List<String> tasks;

    public TaskList() {
        tasks = new ArrayList<>();
    }

    public void addTask(String taskInfo){
        tasks.add(taskInfo);
    }

    @Override
    public String toString() {
        return "List of Tasks"+ tasks;
    }

    public List<String> getTasks() {
        return tasks;
    }
}