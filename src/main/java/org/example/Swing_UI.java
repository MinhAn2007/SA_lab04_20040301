package org.example;

import jdepend.swingui.JDepend;
public class Swing_UI {
    public static void main(String[] args) throws Exception{
        JDepend depend =new JDepend();
        depend.addDirectory("C:\\An\\SA_lab04_20040301");
        depend.analyze();
        System.out.println("DONE");
    }
}

