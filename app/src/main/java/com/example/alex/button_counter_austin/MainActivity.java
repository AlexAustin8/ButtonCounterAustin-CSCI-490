package com.example.alex.button_counter_austin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static java.lang.String.*;

public class MainActivity extends AppCompatActivity {
    private Button incrementButton;
    private Button decrementButton;
    private Button resetButton;
    private TextView text;
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = this.findViewById(R.id.count_text);
        text.setText(text.getText() + valueOf(counter));


        incrementButton = this.findViewById(R.id.incrementButton);
        incrementButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                counter++;
                text.setText(getResources().getString(R.string.counter_text) + valueOf(counter));
            }
        });

        decrementButton = this.findViewById(R.id.decrementButton);
        decrementButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                counter--;
                text.setText(getResources().getString(R.string.counter_text) + valueOf(counter));
            }
        });

        resetButton = this.findViewById(R.id.resetButton);
        resetButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                counter = 0;
                text.setText(getResources().getString(R.string.counter_text) + valueOf(counter));
            }
        });

    }
}
