/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.iterator.sequencenames;

/**
 *
 * @author FA20-BSE-037
 */
public class Main {
    public static void main(String[] args) {
      //NameRepository [][] namesRepository = new NameRepository[students.length][];
      Student[] students = {
            new Student("Ali", 19, "Fa20-bse-001", 3.3),
            new Student("Wali", 18, "Fa20-bse-010", 3.2),
            new Student("Khalid", 21, "Fa20-bse-011", 2.3),
            new Student("Wajid", 17, "Fa20-bse-018", 3.0)
        };
//     
      NameRepository namesRepository = new NameRepository(students);
      Iterator iterator = namesRepository.getIterator();

        while (iterator.hasNext()) {
            Student student = (Student) iterator.next();
            System.out.println("Name: " + student.getName());
            System.out.println("Age: " + student.getAge());
            System.out.println("Registration No: " + student.getRegNo());
            System.out.println("CGPA: " + student.getCGPA());
            System.out.println();
        }

   }
    
}





//public class StudentDetailsDemo {
//    public static void main(String[] args) {
//        Student[][] students = new Student[studentsData.length][];
//        
//        for (int i = 0; i < studentsData.length; i++) {
//            students[i] = new Student[studentsData[i].length];
//            for (int j = 0; j < studentsData[i].length; j++) {
//                Object[] studentInfo = (Object[]) studentsData[i];
//                students[i][j] = new Student(
//                    (String) studentInfo[0],
//                    (int) studentInfo[1],
//                    (String) studentInfo[2],
//                    (double) studentInfo[3]
//                );
//            }
//        }
//
//        for (int i = 0; i < students.length; i++) {
//            for (int j = 0; j < students[i].length; j++) {
//                Student student = students[i][j];
//                System.out.println("Name: " + student.getName());
//                System.out.println("Age: " + student.getAge());
//                System.out.println("Registration No: " + student.getRegNo());
//                System.out.println("CGPA: " + student.getCGPA());
//                System.out.println();
//            }
//        }
//    }
//}
