/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gof.visitor.computerparts;

/**
 *
 * @author LAPTOP HOUSE
 */
public class ComputerPartMaintainer implements ComputerPartVisitor {
    private final String partToMaintain;

    public ComputerPartMaintainer(String partToMaintain) {
        this.partToMaintain = partToMaintain;
    }

    @Override
    public void visit(Computer computer) {
        // You can add specific logic here for computer maintenance.
        // For this example, we'll just print a message.
        System.out.println("Maintenance for Computer");
    }

    @Override
    public void visit(Mouse mouse) {
        if ("Mouse".equalsIgnoreCase(partToMaintain)) {
            System.out.println("Maintenance for Mouse");
        }
    }

    @Override
    public void visit(Keyboard keyboard) {
        if ("Keyboard".equalsIgnoreCase(partToMaintain)) {
            System.out.println("Maintenance for Keyboard");
        }
    }

    @Override
    public void visit(Monitor monitor) {
        if ("Monitor".equalsIgnoreCase(partToMaintain)) {
            System.out.println("Maintenance for Monitor");
        }
    }

    @Override
    public void visit(Multimedia multimedia) {
        if ("Multimedia".equalsIgnoreCase(partToMaintain)) {
            System.out.println("Maintenance for Multimedia");
        }
    }
}
