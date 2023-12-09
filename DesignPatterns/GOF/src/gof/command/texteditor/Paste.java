/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gof.command.texteditor;

/**
 *
 * @author LAPTOP HOUSE
 */
public class Paste extends Command {

    public Paste(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        if (editor.clipboard == null || editor.clipboard.isEmpty()) {
            return false; // Disable paste when clipboard is empty
        }

        backup();
        editor.textField.insert(editor.clipboard, editor.textField.getCaretPosition());
        return true;
    }

    @Override
    public void undo() {
        // For undoing paste, cutting the pasted content
        Cut cutCommand = new Cut(editor);
        cutCommand.execute();
    }
}