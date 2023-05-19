package br.com.etecia.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.card.MaterialCardView;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener {
    MaterialCardView idMenuPets, idMenuAlimentos,
            idMenuDoacoes, idMenuServicos,
            idMenuLocalizar, idMenuParceiros;
//teste
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_layout);

        idMenuPets = findViewById(R.id.idMenuPets);
        idMenuAlimentos = findViewById(R.id.idMenuAlimentos);
        idMenuDoacoes = findViewById(R.id.idMenuDoacoes);
        idMenuServicos = findViewById(R.id.idMenuServicos);
        idMenuParceiros = findViewById(R.id.idMenuParceiros);
        idMenuLocalizar = findViewById(R.id.idMenuLocalizar);

        idMenuPets.setOnClickListener(this);
        idMenuAlimentos.setOnClickListener(this);
        idMenuDoacoes.setOnClickListener(this);
        idMenuLocalizar.setOnClickListener(this);
        idMenuParceiros.setOnClickListener(this);
        idMenuServicos.setOnClickListener(this);


    }

//teste
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.idMenuPets:
                startActivity(new Intent(getApplicationContext(), PetsActivity.class));
                break;
            case R.id.idMenuDoacoes:
                startActivity(new Intent(getApplicationContext(), PetsActivity.class));
                break;
            case R.id.idMenuParceiros:
                startActivity(new Intent(getApplicationContext(), PetsActivity.class));
                break;
            case R.id.idMenuAlimentos:
                startActivity(new Intent(getApplicationContext(), PetsActivity.class));
                break;
            case R.id.idMenuLocalizar:
                startActivity(new Intent(getApplicationContext(), PetsActivity.class));
                break;
            case R.id.idMenuServicos:
                startActivity(new Intent(getApplicationContext(), PetsActivity.class));
                break;
        }
    }
}