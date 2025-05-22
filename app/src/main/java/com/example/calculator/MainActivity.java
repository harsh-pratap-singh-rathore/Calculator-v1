package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private Button b5;
    private Button b6;
    private Button b7;
    private Button b8;
    private Button b9;
    private Button b0;
    private Button bminus;
    private Button bmulti;
    private Button bdiv;
    private Button bplus;
    private Button bequal;
    private Button bC;
    private Button bperc;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        b0 = findViewById(R.id.b0);
        bplus = findViewById(R.id.bplus);
        bminus = findViewById(R.id.bminus);
        bequal = findViewById(R.id.bequal);
        bmulti = findViewById(R.id.bmulti);
        bdiv = findViewById(R.id.bdiv);
        bC = findViewById(R.id.bC);
        bperc = findViewById(R.id.bperc);
        editText = findViewById(R.id.editTextNumber);

        b1.setOnClickListener(v -> editText.append("1"));

        b2.setOnClickListener(v -> editText.append("2"));

        b3.setOnClickListener(v -> editText.append("3"));

        b4.setOnClickListener(v -> editText.append("4"));

        b5.setOnClickListener(v -> editText.append("5"));

        b6.setOnClickListener(v -> editText.append("6"));

        b7.setOnClickListener(v -> editText.append("7"));

        b8.setOnClickListener(v -> editText.append("8"));

        b9.setOnClickListener(v -> editText.append("9"));

        b0.setOnClickListener(v -> editText.append("0"));


        bplus.setOnClickListener(v -> editText.append("+"));
        bmulti.setOnClickListener(v -> editText.append("*"));
        bminus.setOnClickListener(v -> editText.append("-"));
        bdiv.setOnClickListener(v -> editText.append("/"));
        bperc.setOnClickListener(v -> editText.append("%"));


        bequal.setOnClickListener(v ->{
            String input = editText.getText().toString();
            if(input.contains("+")){
                String[] parts = input.split("\\+");
                if(parts.length == 2){
                    try{
                        int num1 = Integer.parseInt(parts[0]);
                        int num2 = Integer.parseInt(parts[1]);
                        int result = num1 + num2;
                        editText.setText(String.valueOf(result));

                    } catch (NumberFormatException e){
                        editText.setText("ERROR");
                    }
                }
            }
            if(input.contains("-")){
                String[] parts = input.split("-");
                if(parts.length == 2){
                    try{
                        int num1 = Integer.parseInt(parts[0]);
                        int num2 = Integer.parseInt(parts[1]);
                        int result = num1 - num2;
                        editText.setText(String.valueOf(result));

                    } catch (NumberFormatException e){
                        editText.setText("ERROR");
                    }
                }
            }
            if(input.contains("*")){
                String[] parts = input.split("\\*");
                if(parts.length == 2){
                    try{
                        int num1 = Integer.parseInt(parts[0]);
                        int num2 = Integer.parseInt(parts[1]);
                        int result = num1 * num2;
                        editText.setText(String.valueOf(result));

                    } catch (NumberFormatException e){
                        editText.setText("ERROR");
                    }
                }
            }
            if(input.contains("/")){
                String[] parts = input.split("/");
                if(parts.length == 2){
                    try{
                        int num1 = Integer.parseInt(parts[0]);
                        int num2 = Integer.parseInt(parts[1]);
                        int result = num1 / num2;
                        editText.setText(String.valueOf(result));

                    } catch (NumberFormatException e){
                        editText.setText("ERROR");
                    }
                }
            }
            if(input.contains("%")){
                String[] parts = input.split("%");
                if(parts.length == 2){
                    try{
                        int num1 = Integer.parseInt(parts[0]);
                        int num2 = Integer.parseInt(parts[1]);
                        int result = num1 % num2;
                        editText.setText(String.valueOf(result));

                    } catch (NumberFormatException e){
                        editText.setText("ERROR");
                    }
                }
            }
        });


        bC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("");
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}