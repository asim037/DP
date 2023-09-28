
package SOLID.withoutprinciple;

/**
 *
 * @author FA20-BSE-037
 */
public class UniversityManagementSystem {
    public void performAdmission() {
        System.out.println("Performing admission...");
    }
    public void generateTimetable() {
        System.out.println("Generating timetable...");
    }
    public void createAssignments() {
        System.out.println("Creating assignments...");
    }
    public void conductQuizzes() {
        System.out.println("Conducting quizzes...");
    }
    public static void main(String[] args) {
        UniversityManagementSystem system = new UniversityManagementSystem();
        system.performAdmission();
        system.generateTimetable();
        system.createAssignments();
        system.conductQuizzes();
    }
    
}
