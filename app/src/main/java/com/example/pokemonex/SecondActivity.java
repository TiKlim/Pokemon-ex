package com.example.pokemonex;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ImageButton btn1 = (ImageButton)findViewById(R.id.bulbasaur);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this, BulbasaurActivity.class);
                startActivity(intent);
            }
        });
        ImageButton btn2 = (ImageButton)findViewById(R.id.charmander);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this, CharmanderActivity.class);
                startActivity(intent);
            }
        });
        ImageButton btn3 = (ImageButton)findViewById(R.id.squirtle);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this, Squirtle.class);
                startActivity(intent);
            }
        });
        ImageButton btn4 = (ImageButton)findViewById(R.id.butterfree);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this, Butterfree.class);
                startActivity(intent);
            }
        });
        ImageButton btn5 = (ImageButton)findViewById(R.id.pikachu);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this, PikachuActivity.class);
                startActivity(intent);
            }
        });
        ImageButton btn6 = (ImageButton)findViewById(R.id.gastly);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this, GastlyActivity.class);
                startActivity(intent);
            }
        });
        ImageButton btn7 = (ImageButton)findViewById(R.id.ditto);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this, DittoActivity.class);
                startActivity(intent);
            }
        });
        ImageButton btn8 = (ImageButton)findViewById(R.id.mew);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this, MewActivity.class);
                startActivity(intent);
            }
        });
        ImageButton btn9 = (ImageButton)findViewById(R.id.aron);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this, AronActivity.class);
                startActivity(intent);
            }
        });
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        ImageButton btn10 = (ImageButton)findViewById(R.id.a);
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this, AronActivity.class);
                startActivity(intent);
            }
        });
    }
}
