package org.example;

import org.springframework.stereotype.Component;

@Component
public class ProfileWorker {
    private final EnvPrinter envPrinter;

    public ProfileWorker(EnvPrinter envPrinter) {
        this.envPrinter = envPrinter;
    }
    //этот метод будет использовать ЕНВПРИНТЕР и будет вызывать у него зринтЕНВ
    public void doWork(){
        envPrinter.EnvPrinter();
    }
}
