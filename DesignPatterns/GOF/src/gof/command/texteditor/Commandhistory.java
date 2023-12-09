/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gof.command.texteditor;

import java.util.Stack;

/**
 *
 * @author LAPTOP HOUSE
 */
public class Commandhistory {
    private Stack<Command> history = new Stack<>();
    private Stack<Command> redoStack = new Stack<>();

    public void push(Command c) {
        history.push(c);
        redoStack.clear(); // Clear redoStack when a new command is executed
    }

    public Command pop() {
        Command command = history.pop();
        redoStack.push(command); // Push popped command to redoStack for redoing
        return command;
    }

    public Command redo() {
        if (!redoStack.isEmpty()) {
            Command command = redoStack.pop();
            history.push(command);
            return command;
        }
        return null;
    }

    public boolean isEmpty() {
        return history.isEmpty();
    }

    public boolean canRedo() {
        return !redoStack.isEmpty();
    }
}