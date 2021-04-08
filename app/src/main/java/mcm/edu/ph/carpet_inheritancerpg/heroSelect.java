package mcm.edu.ph.carpet_inheritancerpg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class heroSelect extends AppCompatActivity implements View.OnClickListener{

    Button elf, firbolg, orc, tiefling, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hero_select);

        elf = findViewById(R.id.btnElf);
        firbolg = findViewById(R.id.btnFirbolg);
        orc = findViewById(R.id.btnOrc);
        tiefling = findViewById(R.id.btnTiefling);
        back = findViewById(R.id.btnBackHero);

        elf.setOnClickListener(this);
        firbolg.setOnClickListener(this);
        orc.setOnClickListener(this);
        tiefling.setOnClickListener(this);
        back.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btnElf:
                Intent elf = new Intent(heroSelect.this, elfSelect.class);
                startActivity(elf);
                break;
            case R.id.btnFirbolg:
                Intent firbolg = new Intent(heroSelect.this, firbolgSelect.class);
                startActivity(firbolg);
                break;
            case R.id.btnOrc:
                Intent orc = new Intent(heroSelect.this, orcSelect.class);
                startActivity(orc);
                break;
            case R.id.btnTiefling:
                Intent tiefling = new Intent(heroSelect.this, tieflingSelect.class);
                startActivity(tiefling);
                break;
            case R.id.btnBackHero:
                Intent back = new Intent(heroSelect.this, CharacterSelect.class);
                startActivity(back);
                break;
        }

    }
}