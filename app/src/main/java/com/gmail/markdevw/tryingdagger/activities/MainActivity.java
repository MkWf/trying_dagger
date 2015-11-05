package com.gmail.markdevw.tryingdagger.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.gmail.markdevw.tryingdagger.Person;
import com.gmail.markdevw.tryingdagger.R;
import com.gmail.markdevw.tryingdagger.components.DaggerPersonComponent;
import com.gmail.markdevw.tryingdagger.components.PersonComponent;
import com.gmail.markdevw.tryingdagger.modules.PersonModule;

public class MainActivity extends AppCompatActivity {

    private Person person;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PersonComponent component = DaggerPersonComponent.builder().personModule(new PersonModule()).build();
        person = component.providePerson();

        person.sprint();
    }
}
