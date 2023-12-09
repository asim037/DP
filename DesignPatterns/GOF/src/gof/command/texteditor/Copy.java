/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gof.command.texteditor;

/**
 *
 * @author LAPTOP HOUSE
 */
public class Copy extends Command {

    public Copy(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        if (editor.textField.getSelectedText() == null || editor.textField.getSelectedText().isEmpty()) {
            return false; // Disable copy when no text is selected
        }

        editor.clipboard = editor.textField.getSelectedText();
        return true;
    }
    
    @Override
    public void undo() {
        // For undoing copy, clearing clipboard
        editor.clipboard = null;
    }
}