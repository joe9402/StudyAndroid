package com.example.daggertest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.daggertest.Dagger.CafeComponent;
import com.example.daggertest.Dagger.CoffeeComponent;
import com.example.daggertest.Dagger.DaggerCafeComponent;
import com.example.daggertest.Dagger.HumanComponent;

import dagger.BindsInstance;

public class MainActivity extends AppCompatActivity {

    TextView textView1;
    TextView textView2;
    Button button;
    int flag = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView1 = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        button = findViewById(R.id.button);

        CafeComponent cafeComponent = DaggerCafeComponent.builder().cafeName("Samsoog").build();
        CoffeeComponent coffeeComponent = cafeComponent.createCoffeeComponent().build();
        HumanComponent humanComponent = cafeComponent.createHumanComponent().build();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag == 0){
                    textView1.setText(coffeeComponent.createCoffeemaker().brew());
                    textView2.setText(humanComponent.createPartTimeJob().whereWorks());
                    flag = 1;
                }
                else {
                    textView1.setText("Stay");
                    textView2.setText("Stay");
                    flag = 0;
                }
            }
        });
    }
}