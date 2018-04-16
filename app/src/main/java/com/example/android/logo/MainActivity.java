package com.example.android.logo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "LoginActivity";

    public static final String EXTRA_MESSAGE = "com.example.android.logo.MESSAGE";

    private EditText mEditTextUsername, mEditTextPassword;

    private Button mButtonSubmit;

    List<Utente> utenti;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditTextPassword = (EditText)findViewById(R.id.et_password);
        mEditTextUsername = (EditText)findViewById(R.id.et_username);

        mButtonSubmit = (Button) findViewById(R.id.btn_submit);

        setDati();

        mButtonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mEditTextPassword == null || mEditTextPassword.getText().toString().equals("") )
                    Log.d(TAG,"password null o vuota");
                else if (mEditTextUsername == null || mEditTextUsername.getText().toString().equals(""))
                    Log.d(TAG,"username null o vuoto");
                else {
                    String username, password;

                    username = mEditTextUsername.getText().toString();
                    password = mEditTextPassword.getText().toString();

                    if (!utenti.contains(new Utente(username, password)))
                        Toast.makeText(MainActivity.this, "username o password errati", Toast.LENGTH_LONG).show();
                    else {
                        Intent intent = new Intent(MainActivity.this, SuccessActivity.class);
                        intent.putExtra(EXTRA_MESSAGE,"PRAVOH");
                        startActivity(intent);
                    }

                }

            }
        });

    }

    private void setDati() {
        utenti = new ArrayList<>();

        utenti.add(new Utente("mario.rossi@gmail.com", "red"));
        utenti.add(new Utente("mario.verdi@gmail.com", "green"));
        utenti.add(new Utente("mario.blu@gmail.com", "blue"));
        utenti.add(new Utente("mario.neri@gmail.com", "black"));

    }
}
