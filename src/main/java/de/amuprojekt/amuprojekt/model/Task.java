package de.amuprojekt.amuprojekt.model;

public class Task {
    private String taskName;
    private String taskStatus;
    private Long taskId;

    public Task(){          // Default Konstruktor
    }

    public Task(String taskName, String taskStatus){
        this.taskName = taskName;
        this.taskStatus=taskStatus;
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public String getTaskName(){
        return taskName;
    }
    public void setTaskName(String taskName)
    {
        this.taskName= taskName;
    }


    public String getTaskStatus(){
        return taskStatus;
    }
    public void setTaskStatus(String taskStatus){
        this.taskStatus=taskStatus;
    }
}