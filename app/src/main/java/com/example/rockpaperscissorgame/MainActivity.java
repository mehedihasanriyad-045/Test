package com.example.rockpaperscissorgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.rockpaperscissorgame.R;

import java.util.Random;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_openingpage);

        Button vscomputer = (Button) findViewById(R.id.vscomputer);
        vscomputer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Openingpage.class);
                startActivity(intent);
            }
        });

        Button p2p = (Button) findViewById(R.id.p2p);
        p2p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity.this, PtoP.class);
                startActivity(intent1);
            }
        });


    }


}
