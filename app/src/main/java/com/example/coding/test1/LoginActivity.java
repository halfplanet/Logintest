package com.example.coding.test1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private EditText mId;
    private EditText mPw;
    private Button mOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mId = findViewById(R.id.loginId);
        mPw = findViewById(R.id.loginPw);
        mOk = findViewById(R.id.loginOk);

        mOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mId.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "Please enter ID", Toast.LENGTH_LONG).show();
                }

                if (mPw.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "Please enter password", Toast.LENGTH_LONG).show();
                }

                if (mPw.getText().toString().equals("password")) {
                    Toast.makeText(getApplicationContext(), "Thankyou", Toast.LENGTH_LONG).show();

                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(), "Password is incorrect", Toast.LENGTH_LONG).show();
                }
            }

        });
    }
}
