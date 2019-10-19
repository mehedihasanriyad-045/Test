package com.example.rockpaperscissorgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Openingpage extends AppCompatActivity {

    Button bv_rock, bv_paper, bv_scissor;
    TextView tv_Score;
    ImageView iv_ComputerChoice, iv_HumanChoice;

    int HumanScore = 0, ComputerScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bv_paper = (Button) findViewById(R.id.bv_paper);
        bv_scissor = (Button) findViewById(R.id.bv_scissor);
        bv_rock = (Button) findViewById(R.id.bv_rock);

        iv_ComputerChoice = (ImageView) findViewById(R.id.iv_ComputerChoice);
        iv_HumanChoice = (ImageView) findViewById(R.id.iv_HumanChoice);

        tv_Score = (TextView) findViewById(R.id.tv_Score);

        bv_paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                iv_HumanChoice.setImageResource(R.drawable.paper);
                String message =  play_turn("paper");
                Toast.makeText(Openingpage.this, message, Toast.LENGTH_SHORT).show();
                tv_Score.setText("Score Human: " + Integer.toString(HumanScore) + " Computer: " + Integer.toString(ComputerScore));

            }
        });

        bv_scissor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                iv_HumanChoice.setImageResource(R.drawable.scissors);
                String message =  play_turn("scissors");
                Toast.makeText(Openingpage.this, message, Toast.LENGTH_SHORT).show();
                tv_Score.setText("Score Human: " + Integer.toString(HumanScore) + " Computer: " + Integer.toString(ComputerScore));

            }
        });

        bv_rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                iv_HumanChoice.setImageResource(R.drawable.rock);
                String message =  play_turn("rock");
                Toast.makeText(Openingpage.this, message, Toast.LENGTH_SHORT).show();
                tv_Score.setText("Score Human: " + Integer.toString(HumanScore) + " Computer: " + Integer.toString(ComputerScore));


            }
        });
    }

    public String play_turn( String player_choice) {

        String computer_choice = "";
        Random r = new Random();

        //choose 1 2 or 3
        int computer_choice_number = r.nextInt(3) + 1;

        if(computer_choice_number == 1) {
            computer_choice = "rock";
        }
        else if(computer_choice_number == 2) {
            computer_choice = "scissors";
        }
        else if(computer_choice_number == 3) {
            computer_choice = "paper";
        }

        //set the computer image based on his choice

        if(computer_choice == "rock") {
            iv_ComputerChoice.setImageResource(R.drawable.rock);
        }
        else if(computer_choice == "paper") {
            iv_ComputerChoice.setImageResource(R.drawable.paper);
        }
        else if(computer_choice == "scissors") {
            iv_ComputerChoice.setImageResource(R.drawable.scissors);
        }


        //Determine winner

        if(computer_choice == player_choice) {
            return "Draw. Nobody Win.";
        }

        else if(player_choice == "rock" && computer_choice == "scissors") {
            HumanScore++;
            return "Rock crushesh Scissors. You win!";
        }
        else if(player_choice == "rock" && computer_choice == "paper") {
            ComputerScore++;
            return "Paper covers Rock. Computer wins!";
        }
        else if(player_choice == "scissors" && computer_choice == "rock") {
            ComputerScore++;
            return "Rock crushesh scissor. Computer wins!";
        }
        else if(player_choice == "scissors" && computer_choice == "paper") {
            HumanScore++;
            return "Scissor cuts paper. You win!";
        }
        else if(player_choice == "paper" && computer_choice == "scissors") {
            ComputerScore++;
            return "Scissor cuts paper. Computer win!";
        }
        else if(player_choice == "paper" && computer_choice == "rock") {
            HumanScore++;
            return "Paper covers Rock. You win!";
        }
        else return "Not Sure";

    }
}
