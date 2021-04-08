package mcm.edu.ph.carpet_inheritancerpg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CharacterSelect extends AppCompatActivity implements View.OnClickListener{

    Button hero, monster;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_select);

        hero = findViewById(R.id. btnHero);
        monster = findViewById(R.id. btnMonster);

        hero.setOnClickListener(this);
        monster.setOnClickListener(this);
    }
    @Override
    public void onClick (View v){

        switch(v.getId()) {
            case R.id.btnHero:
                Intent hero = new Intent( CharacterSelect.this, heroSelect.class);
                startActivity(hero);
                break;
            case R.id.btnMonster:
                Intent monster = new Intent(CharacterSelect.this, monsterSelect.class);
                startActivity(monster);
                break;
        }
    }
}