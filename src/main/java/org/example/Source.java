package org.example;

public class Source {

    @Inject  //аннотация ИНЖЕКТ
    private Injectable injectable;   //поле

    public void call() {
        System.out.println("Source calling call");
    }
}
