package com.example.graduationprojectjavamain;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class LoginActivity extends AppCompatActivity {


    private EditText loginEmail, loginPassword;
    private TextView signupRedirectText;
    private Button loginButton;
    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginEmail = findViewById(R.id.etemailLogin);
        loginPassword = findViewById(R.id.etPassLogin);
        loginButton = findViewById(R.id.login_button);
        auth = FirebaseAuth.getInstance();


        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = loginEmail.getText().toString();
                String pass = loginPassword.getText().toString();
                startActivity(new Intent(LoginActivity.this, About_app_activity.class));

//                if (!email.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
//                    if (!pass.isEmpty()) {
//                        auth.signInWithEmailAndPassword(email, pass)
//                                .addOnSuccessListener(new OnSuccessListener<AuthResult>() {
//                                    @Override
//                                    public void onSuccess(AuthResult authResult) {
//                                        Toast.makeText(LoginActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
//                                        startActivity(new Intent(LoginActivity.this, About_app_activity.class));
//                                        finish();
//                                    }
//                                }).addOnFailureListener(new OnFailureListener() {
//                                    @Override
//                                    public void onFailure(Exception e) {
//                                        Toast.makeText(LoginActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();
//                                    }
//                                });
//                    } else {
//                        loginPassword.setError("Empty fields are not allowed");
//                    }
//                } else if (email.isEmpty()) {
//                    loginEmail.setError("Empty fields are not allowed");
//                } else {
//                    loginEmail.setError("Please enter correct email");
//                }
            }
        });
    }


}

