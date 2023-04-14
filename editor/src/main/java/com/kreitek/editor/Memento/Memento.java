package com.kreitek.editor.Memento;

import java.util.ArrayList;
public class Memento {

    private final ArrayList<String> state = new ArrayList<>();

    public Memento(ArrayList<String> state) {
        this.state.addAll(state);
    }

    public ArrayList<String> getState() {
        return state;
    }
}
