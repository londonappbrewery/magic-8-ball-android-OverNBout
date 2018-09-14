package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView ballDisplay = (ImageView) findViewById(R.id.eightBall)   ;
        Button ask;
        ask = (Button) findViewById(R.id.AskButton);
        final int[] ball =  {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };
        // Detetar se o botão é pressionado
        ask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Log.d gera uma mensagem de Log...neste caso só para testar que o botao funka
                Log.d("bolas", "the Button has Been SQUEEZED");
                //descrição do motor de random
                Random randomNumberGenerator = new Random();
                // associar uma variael (number) ao motor do random e definir de 0 a X num ele vai randomizar
                int bola = randomNumberGenerator.nextInt(5);

                // Log.d("Dicee", "The Number are:" {+LeftD,+RightD});

                //muda a imagem de cada dado no layout
                ballDisplay.setImageResource(ball[bola]);

            }
        });
    }
}
