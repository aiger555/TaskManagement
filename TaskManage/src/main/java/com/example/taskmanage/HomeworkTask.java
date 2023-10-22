package com.example.taskmanage;

import com.example.taskmanage.Priority;
import com.example.taskmanage.Task;

import java.util.Date;

public class HomeworkTask implements Task {

    private String taskDescription;
    private String taskName;

    @Override
    public void setTask(String taskName, String taskDescription) {

    }

    @Override
    public void setTaskName(String taskName) {

    }

    @Override
    public void setTaskDescription(String taskDescription) {

    }

    @Override
    public void markAsComplete() {

    }

    @Override
    public void setPriority(Priority priority) {

    }

    @Override
    public void setDeadline(Date date) {

    }
    @Override
    public String toString(){
        return "Homework: "+ this.taskName + " "+this.taskDescription;
    }
}

