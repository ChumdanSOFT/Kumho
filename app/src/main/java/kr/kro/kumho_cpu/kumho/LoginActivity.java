package kr.kro.kumho_cpu.kumho;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    EditText emailEditText, passwordEditText;
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        emailEditText =  (EditText) findViewById(R.id.email_email_EditText);
        passwordEditText = (EditText) findViewById(R.id.email_password_EditText);
        TextView signup = (TextView) findViewById(R.id.email_signup_Button);
        loginButton = (Button) findViewById(R.id.emjail_login_Button);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Email_SignUp();
            }
        });

    }

    private void Email_SignUp() {
        startActivity(new Intent(LoginActivity.this, Email_SignUpActivity.class));
    }
}
