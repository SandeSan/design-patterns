package com.kreitek.editor;

import com.kreitek.editor.Memento.Caretaker;
import com.kreitek.editor.commands.UndoCommand;
public class Application {

    public static void main(String[] args) {
        EditorFactory editorFactory = new EditorFactory();
        Editor editor = editorFactory.getEditor();
        editor.run();
    }

}
