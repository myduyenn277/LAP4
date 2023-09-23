package Lap4.View;

import Lap4.Controller.Program;
import Lap4.Model.Element;

public class Main {

    public static void main(String[] args) {
        Element element = new Element();
        Program p = new Program(element);
        p.run();
    }
}

