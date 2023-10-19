package task5;
import java.util.ArrayList;
import java.util.List;

class Course {
    private String code;
    private String title;
    private String description;
    private int capacity;
    private String schedule;
    private List<String> enrolledStudents;

    public Course(String code, String title, String description, int capacity, String schedule) {
        this.code = code;
        this.title = title;
        this.description = description;
        this.capacity = capacity;
        this.schedule = schedule;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getSchedule() {
        return schedule;
    }

    @Override
	public String toString() {
        return "Course Code: " + code + "\nTitle: " + title + "\nDescription: " + description +
               "\nCapacity: " + capacity + "\nSchedule: " + schedule + "\n";
    }

    public boolean enrollStudent(String studentName) {
        if (enrolledStudents.size() < capacity) {
            enrolledStudents.add(studentName);
            return true;
        } else {
            return false;
        }
    }

    public void removeStudent(String studentName) {
        enrolledStudents.remove(studentName);
    }
}

