package mcm.edu.ph.carpet_inheritancerpg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class orcSelect extends AppCompatActivity implements View.OnClickListener{

    Button barbarian, paladin, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orc_select);

        barbarian = findViewById(R.id.btnBarbarian);
        paladin = findViewById(R.id.btnPaladin);
        back = findViewById(R.id.btnBackOrc);

        barbarian.setOnClickListener(this);
        paladin.setOnClickListener(this);
        back.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btnBarbarian:
                Intent barbarian = new Intent(orcSelect.this, orcInfoBarb.class);
                startActivity(barbarian);
                break;
            case R.id.btnPaladin:
                Intent paladin = new Intent(orcSelect.this, orcInfoBarb.class);
                startActivity(paladin);
                break;
            case R.id.btnBackOrc:
                Intent back = new Intent(orcSelect.this, heroSelect.class);
                startActivity(back);
                break;
        }

    }
}