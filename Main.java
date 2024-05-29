import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        System.out.println("Assalam Alaikum wa Rahmatullah");
        ToDoList toDoList = new ToDoList();

        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("n1. To-Do List Manager");
            System.out.println("2. Add a task");
            System.out.println("3. view tasks");
            System.out.println("4. Mark task as completed");
            System.out.println("5. Remove a  task");
            System.out.println("6. exit");
            System.out.println("7. Choose an option");

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
                    System.out.println("Exiting...");
                    scan.close();
                    return;
                default:
                    System.out.println("Invalid option, Please try again.");
            }
        }

    }
}