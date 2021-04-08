package mcm.edu.ph.carpet_inheritancerpg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class monsterSelect extends AppCompatActivity implements View.OnClickListener{

    Button electro, fire, ice, rock, water, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monster_select);

        electro = findViewById(R.id.btnElectro);
        fire = findViewById(R.id.btnFire);
        ice = findViewById(R.id.btnIce);
        rock = findViewById(R.id.btnRock);
        water = findViewById(R.id.btnWater);
        back = findViewById(R.id.btnBackMons);

        electro.setOnClickListener(this);
        fire.setOnClickListener(this);
        ice.setOnClickListener(this);
        rock.setOnClickListener(this);
        water.setOnClickListener(this);
        back.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnElectro:
                Intent electro = new Intent(monsterSelect.this, electromon.class);
                startActivity(electro);
                break;
            case R.id.btnFire:
                Intent fire = new Intent(monsterSelect.this, firemon.class);
                startActivity(fire);
                break;
            case R.id.btnIce:
                Intent ice = new  Intent(monsterSelect.this, icemon.class);
                startActivity(ice);
                break;
            case R.id.btnRock:
                Intent rock = new Intent(monsterSelect.this, rockmon.class);
                startActivity(rock);
                break;
            case R.id.btnWater:
                Intent water = new Intent(monsterSelect.this, watermon.class);
                startActivity(water);
                break;
            case R.id.btnBackMons:
                Intent back = new Intent(monsterSelect.this, CharacterSelect.class);
                startActivity(back);
                break;
        }

    }
}