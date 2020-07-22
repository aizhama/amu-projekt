package de.amuprojekt.amuprojekt.form;

public class TaskForm {
    private String taskName;
    private long taskId;
    private String taskStatus;

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }




    public long getTaskId(){
        return taskId;
    }
    public void setTaskId(long taskId){
        this.taskId = taskId;
    }



    public String getTaskStatus(){
        return taskStatus;
    }
    public void setTaskStatus(String taskStatus){
        this.taskStatus=taskStatus;
    }
}
