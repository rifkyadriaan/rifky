package com.example.rifkyadriaan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pindah(View view) {
        Intent intent = new Intent (MainActivity.this,MainActivity2.class);
        startActivity(intent);
    }


    public void exit(View view) {

        finish();
    }
}
