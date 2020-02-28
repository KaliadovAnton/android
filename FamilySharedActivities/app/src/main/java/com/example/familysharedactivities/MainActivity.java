package com.example.familysharedactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText login = findViewById(R.id.login);
        final EditText password = findViewById(R.id.password);
        Button loginBtn = findViewById(R.id.LoginBtn);
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String error = "";
                if (login.getText().toString() == ""){
                    error = "Заполните Логин";
                }
                if (password.getText().toString() == ""){
                    error.concat("Заполните Пароль");

                }
            }
        });
    }
}