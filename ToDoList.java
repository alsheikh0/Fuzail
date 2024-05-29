import java.util.List;
import java.util.ArrayList;;

public class ToDoList {
    
    private List<Task> tasks;

    public ToDoList(){
        tasks = new ArrayList<>();
    }

    public void addTask(String description){
        tasks.add(new Task(description));
    }

    public void removeTask(int index){
        if(index >= 0 && index < tasks.size()){
            tasks.remove(index);
            
        } else{
            System.out.println("Invalid Task number. ");
        }
    }

    public void markTaskAsCompleted(int index){
        if(index >= 0 && index < tasks.size()){
            tasks.get(index).markAsCompleted();;
        } else {
            System.out.println(" Invalid task number");
        }
    }

    public void showTasks(){
        if(tasks.isEmpty()){
            System.out.println("No tasks in your to-do list");
        } else {
            for(int i=0; i<tasks.size(); i++){
                
                System.out.println("Task "+i+" "+tasks.get(i).getDescription());
            }
        }
    }
}
