package com.example.rockpaperscissorgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class PtoP extends AppCompatActivity {

    Button bv_rock, bv_paper, bv_scissor;
    TextView tv_Score;
    ImageView iv_p2, iv_p1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pto_p);

        bv_paper = (Button) findViewById(R.id.bv_paper);
        bv_scissor = (Button) findViewById(R.id.bv_scissor);
        bv_rock = (Button) findViewById(R.id.bv_rock);


        iv_p1 = (ImageView) findViewById(R.id.iv_p1);




        bv_paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                iv_p1.setImageResource(R.drawable.paper);



                String msg = "paper";
                Intent intent = new Intent(PtoP.this, PtoP2.class);
                intent.putExtra("Player",msg);
                startActivity(intent);



            }
        });

        bv_scissor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                iv_p1.setImageResource(R.drawable.scissors);




                String msg = "scissors";
                Intent intent = new Intent(PtoP.this, PtoP2.class);
                intent.putExtra("Player",msg);
                startActivity(intent);



            }
        });

        bv_rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                iv_p1.setImageResource(R.drawable.rock);




                String msg = "rock";
                Intent intent = new Intent(PtoP.this, PtoP2.class);
                intent.putExtra("Player",msg);
                startActivity(intent);




            }
        });


    }
}
