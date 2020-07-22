package de.amuprojekt.amuprojekt.controller;

import java.util.ArrayList;
import java.util.List;

import de.amuprojekt.amuprojekt.form.TaskForm;
import de.amuprojekt.amuprojekt.model.Task;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MyController {
    private static List<Task> tasks = new ArrayList<Task>();

    static {
        tasks.add(new Task("Task 1", "actuell"));
        tasks.add(new Task("Task 2",  "erledigt"));

    }
    //Injektieren (inject) aus applicatiomn.properties     //Использование аннотации @Value
    //Аннотация @Value используется для чтения значения свойства среды или приложения в коде Java. Синтаксис для чтения значения свойства показан ниже
    //@Value("${property_key_name}")

    @Value("${welcome.message}")
    private String message;

    @Value("${error.message}")
    private String errorMessage;

    //Запрос картирования
    //Аннотация @RequestMapping используется для определения URI запроса для доступа к конечным точкам REST.
    // Мы можем определить метод запроса, чтобы потреблять и производить объект. Метод запроса по умолчанию — GET.
    // @RequestMapping(value = "/products")
    // public ResponseEntity<Object> getProducts() { }

    @RequestMapping(value={"/", "/index"}, method = RequestMethod.GET)
    public String index(Model model) {

        model.addAttribute("message","AFC" + message);
        return "index";
    }
    @RequestMapping(value={"/taskList"}, method= RequestMethod.GET)
    public String taskList(Model model) {

        TaskForm taskForm = new TaskForm();
        model.addAttribute("taskForm", taskForm);

        for(int i = 0; i<tasks.size(); i++){
            tasks.get(i).setTaskId(Integer.toUnsignedLong(i+1));
        }
        model.addAttribute("tasks", tasks);
        return "taskList";
    }
    //@ModelAttribute is for Data Binding
    //@ModelAttribute - это аннотация, предназначенная для привязки данных, которая в основном используется для связывания полей формы для построения объекта модели
    @GetMapping("/calculator")
    public String calculator(@RequestParam("a") int a, @RequestParam("b") int b,
                             @RequestParam("action") String action, Model model) {

        double result;
        switch (action) {
            case "multiplication":
                result = a * b;
                break;
            case "division":
                result = a / (double) b;
                break;
            case "subtraction":
                result = a - b;
                break;
            case "addition":
                result = a + b;
                break;
            default:
                result = 0;
                break;
        }

        model.addAttribute("result", result);

        return "first/calculator";
    }
    @RequestMapping(value={"/taskList"}, method=RequestMethod.POST)
    public String addTaskSave(Model model, @ModelAttribute("taskForm")TaskForm taskForm) {

        String taskName = taskForm.getTaskName();
        long taskId = taskForm.getTaskId();
        String taskStatus = taskForm.getTaskStatus();

        if(taskName != null && taskName.length() > 0
                && taskStatus != null && taskStatus.length()>0)
        {
            Task newTask = new Task(taskName, taskStatus);
            newTask.setTaskId(Integer.toUnsignedLong(tasks.size() + 1));
            tasks.add(newTask);
            model.addAttribute("tasks", tasks);
            model.addAttribute("taskForm", new TaskForm());
            return "taskList";
        }
        String error = "First Task & Last Task is required";
        model.addAttribute("errorMessage", error);
        return "taskList";
    }
}