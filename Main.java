import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        System.out.println("Assalam Alaikum wa Rahmatullah");
        ToDoList toDoList = new ToDoList();

        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("\n To-Do List Manager");
            System.out.println("1. Add a task");
            System.out.println("2. view tasks");
            System.out.println("3. Mark task as completed");
            System.out.println("4. Remove a  task");
            System.out.println("5. exit");
            System.out.println("Choose an option");

            int choice = scan.nextInt();
            scan.nextLine();

            switch(choice)  {
                case 1: 
                    System.out.println("Enter task description");
                    String description = scan.nextLine();
                    toDoList.addTask(description);
                    break;
                case 2:
                    toDoList.showTasks();
                    break;
                case 3:
                    System.out.println("Enter task number to mark as completed");
                    int taskNumberToComplete = scan.nextInt();
                    toDoList.markTaskAsCompleted(taskNumberToComplete-1);
                    break;
                case 4:
                    toDoList.removeTask(choice);
                    System.out.println("Task "+choice+" Deleted");
                case 5:
                    System.out.println("Exiting...");
                    scan.close();
                    return;
                default:
                    System.out.println("Invalid option, Please try again.");
            }
        }

    }
}