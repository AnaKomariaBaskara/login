package com.bapak3.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.bapak3.R;

public class LoginActivity extends AppCompatActivity {

    Button login;
    EditText username,password;

    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);

        login = (Button) findViewById(R.id.btnLogin);
        username = (EditText) findViewById(R.id.etUsername);
        password = (EditText) findViewById(R.id.et_password);

        login.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View view){

               if (password.getText().toString().toUpperCase().equals("TEST1"))
               {
                   login_sukses();
               }else
               {
                   Toast.makeText(getApplicationContext(), "Salah Password", Toast.LENGTH_SHORT).show();
               }
               setContentView(R.layout.login_relative);
           }
        });
    }

    private void login_sukses() {
        String user_login = username.getText().toString();
        Intent i = new Intent(this,MainActivity.class);
        //kirimkan usernamenya ke tampilan utama
        i.putExtra("Username",user_login);
        startActivity(i);
    }
}
