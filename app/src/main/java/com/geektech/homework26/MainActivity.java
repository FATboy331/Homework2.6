package com.geektech.homework26;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textInput;
    TextView textWelcome;
    TextView textRegistration;
    TextView textForgotYourPassword;
    EditText editMail;
    EditText editPassword;
    Button buttonInput;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textInput = findViewById(R.id.textInput);
        textWelcome = findViewById(R.id.textWelcome);
        textRegistration = findViewById(R.id.textRegistration);
        textForgotYourPassword = findViewById(R.id.textForgotYourPassword);
       editMail = findViewById(R.id.editMail);
       editPassword = findViewById(R.id.editPassword);
        buttonInput = findViewById(R.id.buttonInput);
editMail.addTextChangedListener(new TextWatcher() {
    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void afterTextChanged(Editable editable) {
        if(editMail.toString().isEmpty()){
            buttonInput.setBackgroundColor(Color.GRAY);
            buttonInput.isEnabled();
        }else{
            buttonInput.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.orange));
        }
    }
});
editPassword.addTextChangedListener(new TextWatcher() {
    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void afterTextChanged(Editable editable) {
        if(editPassword.toString().isEmpty()){
            buttonInput.setBackgroundColor(Color.GRAY);
            buttonInput.isEnabled();
        }else{
            buttonInput.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.orange));
        }
    }
});

        buttonInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editMail.getText().toString().equals("1") && editPassword.getText().toString().equals("1")){
                    textInput.setVisibility(View.GONE);
                    textRegistration.setVisibility(View.GONE);
                    textForgotYourPassword.setVisibility(View.GONE);
                    editMail.setVisibility(View.GONE);
                    editPassword.setVisibility(View.GONE);
                    buttonInput.setVisibility(View.GONE);
                    Toast.makeText(MainActivity.this,"Вы успешно зарегистрировались",Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(MainActivity.this,"Неправильный логин и пароль",Toast.LENGTH_LONG).show();
                }
            }
        });

}
}