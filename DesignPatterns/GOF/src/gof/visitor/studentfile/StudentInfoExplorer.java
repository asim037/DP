/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gof.visitor.studentfile;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author LAPTOP HOUSE
 */
public class StudentInfoExplorer implements StudentVisitor {
    private FileWriter fileWriter;

    public StudentInfoExplorer(String fileName) throws IOException {
        fileWriter = new FileWriter(fileName);
    }

    public void visit(Undergraduate student) {
        try {
            fileWriter.write("Undergraduate Student: " + student.getName() + ", Age: " + student.getAge() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void visit(Graduate student) {
        try {
            fileWriter.write("Graduate Student: " + student.getName() + ", Age: " + student.getAge() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void close() throws IOException {
        fileWriter.close();
    }
}
