/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gof.command.texteditor;

/**
 *
 * @author LAPTOP HOUSE
 */
public class Cut extends Command {

    public Cut(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        if (editor.textField.getSelectedText() == null || editor.textField.getSelectedText().isEmpty()) {
            return false; // Disable cut when no text is selected
        }

        backup();
        String source = editor.textField.getText();
        editor.clipboard = editor.textField.getSelectedText();
        editor.textField.setText(cutString(source));
        return true;
    }

    @Override
    public void undo() {
        // For undoing cut, pasting the content from clipboard
        if (editor.clipboard != null) {
            editor.textField.insert(editor.clipboard, editor.textField.getCaretPosition());
        }
    }

    private String cutString(String source) {
        String start = source.substring(0, editor.textField.getSelectionStart());
        String end = source.substring(editor.textField.getSelectionEnd());
        return start + end;
    }
}