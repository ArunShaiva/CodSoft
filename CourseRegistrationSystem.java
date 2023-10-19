package task5;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CourseRegistrationSystem {
    public static void main(String[] args) {
        List<Course> courses = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Course Registration System");
            System.out.println("1. Add Course");
            System.out.println("2. List Courses");
            System.out.println("3. Register Student");
            System.out.println("4. Remove Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Course Code: ");
                    String code = scanner.nextLine();
                    System.out.print("Enter Course Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Course Description: ");
                    String description = scanner.nextLine();
                    System.out.print("Enter Capacity: ");
                    int capacity = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Schedule: ");
                    String schedule = scanner.nextLine();

                    Course newCourse = new Course(code, title, description, capacity, schedule);
                    courses.add(newCourse);
                    break;

                case 2:
                    System.out.println("Available Courses:");
                    for (Course course : courses) {
                        System.out.println(course);
                    }
                    break;

                case 3:
                    System.out.print("Enter Student Name: ");
                    String studentName = scanner.nextLine();
                    System.out.print("Enter Course Code to Register: ");
                    String courseCodeToRegister = scanner.nextLine();

                    for (Course course : courses) {
                        if (course.getCode().equals(courseCodeToRegister)) {
                            if (course.enrollStudent(studentName)) {
                                System.out.println(studentName + " registered for " + course.getTitle());
                            } else {
                                System.out.println("Course is full. " + studentName + " cannot be registered.");
                            }
                        }
                    }
                    break;

                case 4:
                    System.out.print("Enter Student Name: ");
                    String studentToRemove = scanner.nextLine();
                    System.out.print("Enter Course Code to Remove from: ");
                    String courseCodeToRemove = scanner.nextLine();

                    for (Course course : courses) {
                        if (course.getCode().equals(courseCodeToRemove)) {
                            course.removeStudent(studentToRemove);
                            System.out.println(studentToRemove + " removed from " + course.getTitle());
                        }
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
