package mcm.edu.ph.carpet_inheritancerpg;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class firbolgInfoOther extends AppCompatActivity implements View.OnClickListener{

    Button back;
    TextView health, attack, defense, type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firbolg_info_other);

        health = findViewById(R.id.txtViewFirbHP);
        attack = findViewById(R.id.txtViewFirbATK);
        defense = findViewById(R.id.txtViewFirbDEF);
        type = findViewById(R.id.txtViewFirbType);

        back = findViewById(R.id.btnBackFirbC);

        back.setOnClickListener(this);

        health.setText("180");
        attack.setText("90");
        defense.setText("200");
        type.setText("Druid");

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnBackFirbC:
                Intent back = new Intent(firbolgInfoOther.this, firbolgSelect.class);
                startActivity(back);
                break;
        }

    }
}
