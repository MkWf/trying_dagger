package com.gmail.markdevw.tryingdagger.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import com.gmail.markdevw.tryingdagger.Person;
import com.gmail.markdevw.tryingdagger.R;
import com.gmail.markdevw.tryingdagger.components.DaggerPersonComponent;
import com.gmail.markdevw.tryingdagger.components.PersonComponent;
import com.gmail.markdevw.tryingdagger.modules.PersonModule;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.tv_greeting)
    TextView greeting;

    Person person;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        PersonComponent component = DaggerPersonComponent.builder().personModule(new PersonModule()).build();
        person = component.person();

        person.sprint();
    }

    @OnClick(R.id.btn_toast)
    public void showPersonToast(){
        Toast.makeText(this, person.toString(), Toast.LENGTH_SHORT).show();
        greeting.setText(R.string.click_response);
    }


}
