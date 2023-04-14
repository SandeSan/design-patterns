package com.kreitek.editor.commands;

import com.kreitek.editor.Command;
import com.kreitek.editor.Memento.Memento;
import com.kreitek.editor.Memento.Caretaker;

import java.util.ArrayList;
public class UndoCommand implements Command {

    private final Caretaker commandCaretaker = Caretaker.getInstance();

    @Override
    public void execute(ArrayList<String> documentLines) {
        documentLines.clear();
        Memento memento = commandCaretaker.get();
        if (memento != null) {
            documentLines.addAll(memento.getState());
        }
        else {
            documentLines = new ArrayList<>();
        }
    }

    public Memento setState(ArrayList<String> state) {
        return new Memento(state);
    }
}
