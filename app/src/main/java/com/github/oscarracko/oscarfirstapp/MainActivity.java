package com.github.oscarracko.oscarfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnButton;
    private TextView tvHelloWorld;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        printToTextView();
        pressButtonChangeText();
    }

    private void printToTextView(){
        tvHelloWorld = findViewById(R.id.tv_hello_world);
        String message = "tekstas";
        Log.d("FirstOscarApp", message);
        tvHelloWorld.setText(message);
    }

    private void pressButtonChangeText(){
        btnButton = findViewById(R.id.btn_button);
        btnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvHelloWorld.getText() == "tekstas"){
                    tvHelloWorld.setText("labas");
                } else {
                    tvHelloWorld.setText("tekstas");
                }
            }
        });
    }
}
