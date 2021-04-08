package mcm.edu.ph.carpet_inheritancerpg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class orcInfoBarb extends AppCompatActivity implements View.OnClickListener{

    Button back;
    TextView health, attack, defense, type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orc_info);

        health = findViewById(R.id.txtViewOrcHP);
        attack = findViewById(R.id.txtViewOrcATK);
        defense = findViewById(R.id.txtViewOrcDEF);
        type = findViewById(R.id.txtViewOrcType);

        back = findViewById(R.id.btnBackOrc);

        back.setOnClickListener(this);

        health.setText("250");
        attack.setText("180");
        defense.setText("200");
        type.setText("Barbarian");

    }

    @Override
    public void onClick(View v) {
        switch  (v.getId()){
            case R.id.btnBackOrc:
                Intent back = new Intent(orcInfoBarb.this, orcSelect.class);
                startActivity(back);
                break;
        }

    }
}