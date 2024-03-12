package org.example;
import jdepend.xmlui.JDepend;
//import jdepend.swingui.JDepend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
public class Main {
    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        scheduler.scheduleAtFixedRate(() -> {
            JDepend depend;
            try {
                depend = new JDepend(new PrintWriter("report.xml"));
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            try {
                depend.addDirectory("C:\\An\\SA_lab04_20040301");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            depend.analyze();
            System.out.println("DONE");
            System.out.println("Thực thi mã tự động...");
        }, 0, 1, TimeUnit.MINUTES);
    }
}