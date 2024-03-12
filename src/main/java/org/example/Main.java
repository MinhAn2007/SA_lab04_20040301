package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import jdepend.xmlui.JDepend;
//import jdepend.swingui.JDepend;

import java.io.PrintWriter;
public class Main {
    public static void main(String[] args) throws Exception{
        JDepend depend =new JDepend(new PrintWriter("report2.xml"));
        //JDepend depend =new JDepend();
        depend.addDirectory("C:\\An\\SA_lab04_20040301");
        depend.analyze();
        System.out.println("DONE");
        System.out.println("x");
    }
}