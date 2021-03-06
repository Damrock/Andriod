package com.example.badar.application001;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    int pointsTeamA=0;

    int pointsTeamB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    private void displayAPoints(int number){
        TextView pointsTextView = (TextView) findViewById(R.id.valueA_text_view);
        pointsTextView.setText(String.valueOf(number));
    }

    public void incrementA_3Points(View view){
        pointsTeamA=pointsTeamA+3;
        displayAPoints(pointsTeamA);

    }

    public void incrementA_2Points(View view){
        pointsTeamA=pointsTeamA+2;
        displayAPoints(pointsTeamA);
    }

    public void incrementA_1Points(View view){
        pointsTeamA=pointsTeamA+1;
        displayAPoints(pointsTeamA);
    }

    //B side
    private void displayBPoints(int number){
        TextView pointsTextView = (TextView) findViewById(R.id.valueB_text_view);
        pointsTextView.setText(String.valueOf(number));
    }

    public void incrementB_3Points(View view){
        pointsTeamB=pointsTeamB+3;
        displayBPoints(pointsTeamB);

    }

    public void incrementB_2Points(View view){
        pointsTeamB=pointsTeamB+2;
        displayBPoints(pointsTeamB);
    }

    public void incrementB_1Points(View view){
        pointsTeamB=pointsTeamB+1;
        displayBPoints(pointsTeamB);
    }

    public void resetValues(View view){

     displayBPoints(pointsTeamB=0);
        displayAPoints(pointsTeamA=0);
    }
}
