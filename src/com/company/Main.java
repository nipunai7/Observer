package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Observer observer1 =  new Type1Observer();
        Observer observer2 =  new Type1Observer();
        Observer observer3 =  new Type2Observer();

        Subject subject = new Subject();
        subject.subscribe(observer1);
        subject.subscribe(observer2);
        subject.subscribe(observer3);

        subject.notifyObservers("You can buy pizza now!");

        Thread.sleep(1000);

        subject.notifyObservers("You can not buy pizza now!");

        Thread.sleep(2000);

        subject.unsubscribe(observer2);

        Thread.sleep(1000);

        subject.notifyObservers("Order now!");





    }
}
