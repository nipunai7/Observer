package com.company;

public class Type2Observer implements Observer {

    @Override
    public void notifyObserver(String news) {
        System.out.println("Watching the TV: "+ news);
    }
}
