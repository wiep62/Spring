package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class SimpleBean {
public SimpleBean() {
    System.out.println("SimpleBean created");
}

@PostConstruct
public void afterInit(){
    System.out.println("SimpleBean calling afterInit");
}

@PreDestroy
public void beforeDestroy(){
    System.out.println("Simple Bean calling beforeDestroy");
}
}
