package com.gmail.markdevw.tryingdagger.modules;

import com.gmail.markdevw.tryingdagger.Heart;
import com.gmail.markdevw.tryingdagger.Person;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Mark on 11/4/2015.
 */
@Module
public class PersonModule {

    @Provides
    Heart provideHeart(){
        return new Heart();
    }

    @Provides
    Person providePerson(){
        return new Person(new Heart());
    }
}
