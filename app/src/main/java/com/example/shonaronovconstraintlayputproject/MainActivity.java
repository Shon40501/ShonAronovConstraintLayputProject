package com.example.shonaronovconstraintlayputproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView Tv1;
    private TextView Tv2;
    private TextView Tv3;
    private TextView Tv4;
    private TextView Tv5;
    private TextView Tv6;
    private TextView Tv7;
    private TextView Tv8;
    private TextView Tv9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Tv1 = findViewById(R.id.Tv1);
        Tv2 = findViewById(R.id.Tv2);
        Tv3 = findViewById(R.id.Tv4);
        Tv4 = findViewById(R.id.Tv5);
        Tv5 = findViewById(R.id.Tv6);
        Tv6 = findViewById(R.id.Tv7);
        Tv7 = findViewById(R.id.Tv8);
        Tv8 = findViewById(R.id.Tv9);
        Tv9 = findViewById(R.id.Tv10);
        Tv1.setText("Cars (2006)");
        Tv2.setText("On the way to the biggest race of his life, a hotshot rookie race car gets stranded in a rundown town and learns that winning isn't everything in life");
        Tv9.setText("10/10");
        Tv3.setText("More like this : ");
        Tv4.setText("Cars 2 ");
        Tv5.setText("Cars 3");
        Tv6.setText("Mater and the Ghostlight");
        Tv7.setText("Storyline :");
        Tv8.setText("While traveling to California for the dispute of the final race of the Piston Cup against The King and Chick Hicks, the famous Lightning McQueen accidentally damages the road of the small town Radiator Springs and is sentenced to repair it. Lightning McQueen has to work hard and finds friendship and love in the simple locals,  and becoming a true winner");

    }
}