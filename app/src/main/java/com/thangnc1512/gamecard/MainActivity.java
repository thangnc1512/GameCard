package com.thangnc1512.gamecard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView imgCard;
    Button btnRutCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgCard = findViewById(R.id.imgLaBai);
        btnRutCard = findViewById(R.id.btnRutCard);
        btnRutCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayList<Integer> arrayCard = new ArrayList<>();
                arrayCard.add(R.drawable.c1);
                arrayCard.add(R.drawable.c2);
                arrayCard.add(R.drawable.c3);
                arrayCard.add(R.drawable.c4);
                arrayCard.add(R.drawable.c5);
                arrayCard.add(R.drawable.c6);
                arrayCard.add(R.drawable.c7);
                arrayCard.add(R.drawable.c8);
                arrayCard.add(R.drawable.c9);
                arrayCard.add(R.drawable.c10);
                arrayCard.add(R.drawable.cj);
                arrayCard.add(R.drawable.cq);
                arrayCard.add(R.drawable.ck);

                arrayCard.add(R.drawable.d1);
                arrayCard.add(R.drawable.d2);
                arrayCard.add(R.drawable.d3);
                arrayCard.add(R.drawable.d4);
                arrayCard.add(R.drawable.d5);
                arrayCard.add(R.drawable.d6);
                arrayCard.add(R.drawable.d7);
                arrayCard.add(R.drawable.d8);
                arrayCard.add(R.drawable.d9);
                arrayCard.add(R.drawable.d10);
                arrayCard.add(R.drawable.dj);
                arrayCard.add(R.drawable.dq);
                arrayCard.add(R.drawable.dk);

                arrayCard.add(R.drawable.h1);
                arrayCard.add(R.drawable.h2);
                arrayCard.add(R.drawable.h3);
                arrayCard.add(R.drawable.h4);
                arrayCard.add(R.drawable.h5);
                arrayCard.add(R.drawable.h6);
                arrayCard.add(R.drawable.h7);
                arrayCard.add(R.drawable.h8);
                arrayCard.add(R.drawable.h9);
                arrayCard.add(R.drawable.h10);
                arrayCard.add(R.drawable.hj);
                arrayCard.add(R.drawable.hq);
                arrayCard.add(R.drawable.hk);

                arrayCard.add(R.drawable.s1);
                arrayCard.add(R.drawable.s2);
                arrayCard.add(R.drawable.s3);
                arrayCard.add(R.drawable.s4);
                arrayCard.add(R.drawable.s5);
                arrayCard.add(R.drawable.s6);
                arrayCard.add(R.drawable.s7);
                arrayCard.add(R.drawable.s8);
                arrayCard.add(R.drawable.s9);
                arrayCard.add(R.drawable.s10);
                arrayCard.add(R.drawable.sj);
                arrayCard.add(R.drawable.sq);
                arrayCard.add(R.drawable.sk);

                Random random = new Random();
                int randomCard = random.nextInt(arrayCard.size());

                imgCard.setImageResource(arrayCard.get(randomCard));
            }
        });
    }

}
