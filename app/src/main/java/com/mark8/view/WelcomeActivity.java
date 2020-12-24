package com.mark8.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.mark8.R;
import com.mark8.databinding.ActivityWelcomeBinding;

public class WelcomeActivity extends AppCompatActivity implements View.OnClickListener {

    private ActivityWelcomeBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_welcome);

        binding.loginBtn.setOnClickListener(this);
        binding.signUpTxt.setOnClickListener(this);
        binding.logo.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.login_btn:
                goToLoginActivity();
                break;
            case R.id.sign_up_txt:
                goToSignUpActivity();
                break;
            case R.id.logo:
                goToMainActivity();
                break;
        }
    }

    private void goToMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    private void goToSignUpActivity() {
        Intent intent = new Intent(this, SignUpActivity.class);
        startActivity(intent);
    }

    private void goToLoginActivity() {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }


}