package com.example.popie.eventhandling_lab3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button signIn;
    EditText username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        signIn = (Button) findViewById(R.id.signin);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);


        signIn.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View view) {

                        String name = username.getText().toString();
                        String pass = password.getText().toString();
                        if (name.equals("") && pass.equals("")) {
                            Toast.makeText(getApplicationContext(), "username and password are empty", Toast.LENGTH_LONG).show();
                        } else if (name.equals(pass)) {
                            Intent intent = new Intent(getApplicationContext(), ActivityB.class);
                            startActivity(intent);
                        } else {
                            Toast.makeText(getApplicationContext(), "Both fields are not same", Toast.LENGTH_LONG).show();
                        }
                    }
                }
        );
    }
}
