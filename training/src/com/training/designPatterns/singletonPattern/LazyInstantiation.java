package com.training.designPatterns.singletonPattern;

public class LazyInstantiation {
    private static volatile LazyInstantiation lazyInstantiation;
    private LazyInstantiation(){
        if(lazyInstantiation!=null){
            throw new RuntimeException("Please use getLazyInstantiation method");
        }
    }
    public static LazyInstantiation getLazyInstantiation(){
        if(lazyInstantiation==null){
            synchronized (LazyInstantiation.class){
                if(lazyInstantiation==null){
                    lazyInstantiation = new LazyInstantiation();
                }
            }
        }
        return lazyInstantiation;
    }
}
