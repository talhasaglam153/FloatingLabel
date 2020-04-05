package com.example.floatinglabel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {
    private TextInputLayout email,password,username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        username = findViewById(R.id.username);
    }

    private boolean emailControl(){
        String emailInput = email.getEditText().getText().toString().trim();
        if(emailInput.isEmpty()){
            email.setError("Email Boş Bırakılamaz...");
            return false;
        }else{
            email.setError(null);
            return true;
        }
    }

    private boolean usernameControl(){
        String usernameInput = username.getEditText().getText().toString().trim();
        if(usernameInput.isEmpty()){
            username.setError("Kullanıcı Adı Boş bırakılamaz...");
            return false;
        }else if(usernameInput.length()>15){
            username.setError("Belirlenen sınır aşıldı");
            return false;
        }else{
            username.setError(null);
            return true;
        }
    }

    private boolean passwordControl(){
        String passwordInput = password.getEditText().getText().toString().trim();
        if(passwordInput.isEmpty()){
            password.setError("Email Boş Bırakılamaz...");
            return false;
        }else{
            password.setError(null);
            return true;
        }
    }


    public void giris(View v){
            if(!emailControl() | !usernameControl() | !passwordControl()){
                return;
            }

            String input = "Email:"+email.getEditText().getText().toString();
            input +="\n";
            input += "Username:"+username.getEditText().getText().toString();
            input+="\n";
            input += "Password:"+ password.getEditText().getText().toString();

        Toast.makeText(this, input, Toast.LENGTH_SHORT).show();



    }


}
