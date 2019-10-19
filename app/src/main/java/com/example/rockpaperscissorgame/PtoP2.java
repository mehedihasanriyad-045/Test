package com.example.rockpaperscissorgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class PtoP2 extends AppCompatActivity {

    Button bv_rock, bv_paper, bv_scissor, bv_menu,bv_resume;
    TextView tv_Score;
    ImageView iv_p2;

    int p1 = 0, p2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pto_p2);

        bv_paper = (Button) findViewById(R.id.bv_paper);
        bv_scissor = (Button) findViewById(R.id.bv_scissor);
        bv_rock = (Button) findViewById(R.id.bv_rock);
        bv_menu = (Button) findViewById(R.id.bv_menu);
        bv_resume = (Button) findViewById(R.id.bv_resume);

        iv_p2 = (ImageView) findViewById(R.id.iv_p2);

        tv_Score = (TextView) findViewById(R.id.tv_Score);

        bv_paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                iv_p2.setImageResource(R.drawable.paper);



                String msg = "paper";
                Intent intent = new Intent(PtoP2.this, Winner.class);
                intent.putExtra("Player2",msg);
                startActivity(intent);



            }
        });

        bv_scissor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                iv_p2.setImageResource(R.drawable.scissors);




                String msg = "scissors";
                Intent intent = new Intent(PtoP2.this, Winner.class);
                intent.putExtra("Player2",msg);
                startActivity(intent);



            }
        });

        bv_rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                iv_p2.setImageResource(R.drawable.rock);




                String msg = "rock";
                Intent intent = new Intent(PtoP2.this, Winner.class);
                intent.putExtra("Player2",msg);
                startActivity(intent);




            }
        });


    }


}
