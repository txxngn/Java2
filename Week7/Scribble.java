package ReadManyObjects;

import java.io.*;

public class Scribble implements Serializable {
    private String name;
    private String note;

    public Scribble(String name, String note) {
        this.name = name;
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public String getNote() {
        return note;
    }

    public String toString(){
        return "Scribble name =" + name + ", note=" + note;
    }
}
