/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SOLID.withprinciple;

/**
 *
 * @author FA20-BSE-037
 */
public class Main {
    public static void main(String[] args) {
        // Create instances of each module and perform their respective tasks
        Admission adm = new Admission();
        Tmetable time = new Tmetable();
        Assignments asgn = new Assignments();
        Quizzes quiz = new Quizzes();

        adm.performAdmission();
        time.generateTimetable();
        asgn.createAssignments();
        quiz.conductQuizzes();
    }
    
}
