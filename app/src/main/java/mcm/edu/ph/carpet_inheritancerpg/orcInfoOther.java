package mcm.edu.ph.carpet_inheritancerpg;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class orcInfoOther extends AppCompatActivity implements View.OnClickListener{

    Button back;
    TextView health, attack, defense, type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orc_info_other);

        health = findViewById(R.id.txtViewOrcHP);
        attack = findViewById(R.id.txtViewOrcATK);
        defense = findViewById(R.id.txtViewOrcDEF);
        type = findViewById(R.id.txtViewOrcType);

        back = findViewById(R.id.btnBackOrc);

        back.setOnClickListener(this);

        health.setText("220");
        attack.setText("180");
        defense.setText("250");
        type.setText("Paladin");

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnBackOrc:
                Intent back = new Intent(orcInfoOther.this, orcSelect.class);
                startActivity(back);
                break;
        }

    }
}
