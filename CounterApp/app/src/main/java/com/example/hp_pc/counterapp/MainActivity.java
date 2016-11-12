package com.example.hp_pc.counterapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int k=2 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main) ; }

    public void increment(View view) {
        k++ ;
        display(k);
    }
    public void decrement(View view)
    {
        k-- ;
        display(k);


    }

    public void submitOrder(View view) {
        int numberofcoffee=k;
        display(numberofcoffee);
        displayPrice(numberofcoffee*5);
    }
    public void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.text1);
        quantityTextView.setText("" + number); }

        public void displayPrice(int number)
    { TextView Price =(TextView) findViewById(R.id.text2) ;
        Price.setText("$"+number) ;
    }


}
