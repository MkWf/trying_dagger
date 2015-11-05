package com.gmail.markdevw.tryingdagger.components;

import com.gmail.markdevw.tryingdagger.Person;
import com.gmail.markdevw.tryingdagger.modules.PersonModule;

import dagger.Component;

/**
 * Created by Mark on 11/4/2015.
 */

@Component(modules = {PersonModule.class})
public interface PersonComponent {
    Person person();
}
