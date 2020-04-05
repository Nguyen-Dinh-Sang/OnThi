package com.example.hellouser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button buttonOk;
    EditText editTextContent;
    TextView textViewContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initEvent();
        initData();
    }
    private void initView() {
        buttonOk = findViewById(R.id.bt_ok);
        editTextContent = findViewById(R.id.et_name);
        textViewContent = findViewById(R.id.tv_content);
    }

    private void initEvent() {
        buttonOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewContent.setText("Hello " + editTextContent.getText().toString().trim() + "\nWelcome to JavaTutorial");
            }
        });
    }

    private void initData() {
    }
}
