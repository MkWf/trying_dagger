package com.gmail.markdevw.tryingdagger;

import javax.inject.Inject;

/**
 * Created by Mark on 11/4/2015.
 */
public class Person {
    Heart heart;

    @Inject
    public Person(Heart heart){
        this.heart = heart;
    }

    public void walk(){
        heart.setBpm(80);
    }

    public void sprint(){
        heart.setBpm(160);
    }

    public void die(){
        heart.setBpm(0);
    }

    @Override
    public String toString() {
        return "Your heartrate is " + heart.getBpm();
    }
}
