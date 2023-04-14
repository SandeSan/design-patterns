package com.kreitek.editor.Memento;

import com.kreitek.editor.Memento.Memento;

import java.util.ArrayList;
import java.util.List;
public class Caretaker {

    private static Caretaker instance;
    private final List<Memento> mementoList = new ArrayList<>();

    public static Caretaker getInstance() {
        if (instance == null) {
            instance = new Caretaker();
        }
        return instance;
    }

    public void add(Memento memento) {
        mementoList.add(memento);
    }

    public Memento get() {
        if (mementoList.size() > 0) {
            int index = mementoList.size() -1;
            Memento memento = mementoList.get(index);
            return memento;
        }
        return null;
    }
}