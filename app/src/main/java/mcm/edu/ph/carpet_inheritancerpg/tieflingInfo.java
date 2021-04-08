package mcm.edu.ph.carpet_inheritancerpg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class tieflingInfo extends AppCompatActivity implements View.OnClickListener{

    Button back;
    TextView health, attack, defense, type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tiefling_info);

        health = findViewById(R.id.txtViewTiefHP);
        attack = findViewById(R.id.txtViewTiefATK);
        defense = findViewById(R.id.txtViewTiefDEF);
        type = findViewById(R.id.txtViewTiefType);

        back = findViewById(R.id.btnBackTief);

        back.setOnClickListener(this);

        health.setText("175");
        attack.setText("160");
        defense.setText("120");
        type.setText("Ranger");

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnBackTief:
                Intent back = new Intent(tieflingInfo.this, tieflingSelect.class);
                startActivity(back);
                break;
        }

    }
}