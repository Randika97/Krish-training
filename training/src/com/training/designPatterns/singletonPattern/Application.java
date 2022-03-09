package com.training.designPatterns.singletonPattern;

public class Application {
    public static void main(String[] args) {

        //illegal construct.Compile Time Error: The constructor SingleObject() is not visible
       /* SingleObject object = new SingleObject();*/
        //Get the only object available with Early Instantiation
        EarlyInstantiation object = EarlyInstantiation.getInstance();
        System.out.println(object.hashCode());
        //show the message
        object.showMessage();

        // Instantiating Singleton class with variable lazyInstantiation
        LazyInstantiation lazyInstantiation = LazyInstantiation.getLazyInstantiation();
        System.out.println(lazyInstantiation);

        // Instantiating Singleton class with variable lazyInstantiation1
        LazyInstantiation lazyInstantiation1 = LazyInstantiation.getLazyInstantiation();
        System.out.println(lazyInstantiation1);

        System.out.println("Hashcode of lazyInstantiation is "+ lazyInstantiation.hashCode());
        System.out.println("Hashcode of lazyInstantiation1 is "+ lazyInstantiation1.hashCode());

    }
}
