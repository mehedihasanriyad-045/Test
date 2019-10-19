package com.example.rockpaperscissorgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Winner extends AppCompatActivity {

    Button  bv_menu,bv_resume;
    TextView tv_Score;


    int p1 = 0, p2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winner);

        bv_menu = (Button) findViewById(R.id.bv_menu);
        bv_resume = (Button) findViewById(R.id.bv_resume);



        tv_Score = (TextView) findViewById(R.id.tv_Score);

        bv_resume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Winner.this, PtoP.class);
                startActivity(intent1);
            }
        });

        bv_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Winner.this, MainActivity.class);
                startActivity(intent1);
            }
        });




        Intent intentx = getIntent();

        String computer_choice = intentx.getExtras().getString("Player");

        Intent intenty = getIntent();

        String player_choice = intenty.getExtras().getString("Player2");

        //Determine winner

        if(computer_choice == player_choice) {
            Toast.makeText(Winner.this, "Draw. Nobody Win.", Toast.LENGTH_SHORT).show();
        }

        else if(player_choice == "rock" && computer_choice == "scissors") {
            p1++;

            Toast.makeText(Winner.this, "Rock crushesh Scissors. Player 1 win!", Toast.LENGTH_SHORT).show();
        }
        else if(player_choice == "rock" && computer_choice == "paper") {
            p2++;

            Toast.makeText(Winner.this,"Paper covers Rock. Player 2 wins!", Toast.LENGTH_SHORT).show();
        }
        else if(player_choice == "scissors" && computer_choice == "rock") {
            p2++;

            Toast.makeText(Winner.this, "Rock crushesh scissor. Player 2 wins!", Toast.LENGTH_SHORT).show();
        }
        else if(player_choice == "scissors" && computer_choice == "paper") {
            p1++;

            Toast.makeText(Winner.this, "Scissor cuts paper. Player 1 win!", Toast.LENGTH_SHORT).show();
        }
        else if(player_choice == "paper" && computer_choice == "scissors") {
            p2++;

            Toast.makeText(Winner.this, "Scissor cuts paper. Player 2 win!", Toast.LENGTH_SHORT).show();
        }
        else if(player_choice == "paper" && computer_choice == "rock") {
            p1++;

            Toast.makeText(Winner.this, "Paper covers Rock. Player 1 win!", Toast.LENGTH_SHORT).show();
        }
        tv_Score.setText("Score Player 1: " + Integer.toString(p1) + " Player 2: " + Integer.toString(p2));


    }




}
