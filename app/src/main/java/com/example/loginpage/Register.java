package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        EditText username=(EditText) findViewById(R.id.username);
                MaterialButton registerbtn=(MaterialButton) findViewById(R.id.signbtn);
                        registerbtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                String username1 = username.getText().toString();
                                Toast.makeText(Register.this,"Username is "+username1,Toast.LENGTH_SHORT).show();
                            }
                        });
    }
}