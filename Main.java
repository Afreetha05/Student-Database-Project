import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();
        boolean isRunning = true;

        while(isRunning){
            System.out.println("----Student Database----");
            System.out.println("1.Add student");
            System.out.println("2.View All Students");
            System.out.println("3.Search student");
            System.out.println("4.Remove student");
            System.out.println("5.Exit");
            System.out.println("Choose an option:");
            int choice = scanner.nextInt();
            scanner.nextLine();
        switch (choice) {
            case 1 -> {
                System.out.println("Enter name:");
                String studName = scanner.nextLine();
                System.out.println("Enter Roll number:");
                String studRollno = scanner.nextLine();
                Student s = new Student(studName, studRollno);
                list.add(s);
                System.out.println("Added!");
                break;
            }
            case 2 ->{
                System.out.println(list);
            }
            case 3 ->{
                System.out.println("Enter student name: ");
                String searchStudent = scanner.nextLine();
                boolean isIn = false;
                for (Student s : list){
                    if(s.getName().equalsIgnoreCase(searchStudent)){
                        isIn = true;
                    }
                }
                System.out.println(isIn);
                break;
            }
            case 4 ->{
                System.out.println("Enter student name to remove: ");
                String removeStudName = scanner.nextLine();
                boolean removed = false;
                for(int i = 0; i<list.size(); i++){
                    if(list.get(i).getName().equalsIgnoreCase(removeStudName)){
                        list.remove(i);
                        removed = true;
                        break;
                    }
                }
                if(removed){
                    System.out.println("Student removed successfully!");
                }
                else {
                    System.out.println("Student not found");
                }
                break;
            }
            case 5 ->{
                isRunning = false;
            }
            default -> {
                System.out.println("Invalid choice");
            }
        }
    }
    }
}