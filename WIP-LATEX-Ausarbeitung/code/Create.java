package com.example.robin.angrynerds_wip.data.services;

import android.graphics.Color;

import com.example.robin.angrynerds_wip.data.models.tens.Event;
import com.example.robin.angrynerds_wip.data.models.tens.Note;
import com.example.robin.angrynerds_wip.data.models.tens.Todo;

public class Create {
    //Diese Klasse ruft die Konstruktoren der TENs auf.

    //Colors
    private static int[] colors = new int[]{
            Color.parseColor("#DD2C00"),
            Color.parseColor("#087f23"),
            Color.parseColor("#00766c"),
            Color.parseColor("#3d5afe"),
            Color.parseColor("#1a237e"),
            Color.parseColor("#b7008a"),
            Color.parseColor("#ffab00"),
            Color.parseColor("#f57f17"),
            Color.parseColor("#60e10f"),
            Color.parseColor("#8c234d")
    };

    public static int randomColor(){
        return colors[1];
    }

    //Todo Ruthild: Methoden überladen
    public static Todo createTodo(String title) {
        int color = randomColor();
        Todo todo = new Todo(title, color);
        return todo;
    }

    public static Event createEvent(String title){
        int color = randomColor();
        Event event = new Event(title, color);
        return event;
    }

    public static Note createNote(String title){
        int color = randomColor();
        Note note = new Note(title, color);
        return note;
    }
}
