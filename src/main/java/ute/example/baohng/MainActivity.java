package ute.example.baohng;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnSignup;
    Button btnSignin;
    EditText edtEmail, edtPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Mapping
        edtEmail = (EditText) findViewById(R.id.editTextEmail);
        edtPass = (EditText) findViewById(R.id.editTextPassword);

        //Cast to string
        String username = edtEmail.getText().toString().trim();
        String password = edtPass.getText().toString().trim();

        btnSignup = (Button) findViewById(R.id.buttonSignUp);
        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,SignUp.class));
            }
        });

        btnSignin = (Button) findViewById(R.id.buttonSignIn);
        btnSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edtEmail.getText().toString().trim().equals("bao.hng221b@gmail.com") && edtPass.getText().toString().trim().equals("bao123")){
                    startActivity(new Intent(MainActivity.this,Profile.class));
                    Toast.makeText(MainActivity.this, "You are access", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "Wrong email or password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}