package mcm.edu.ph.carpet_inheritancerpg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class firbolgSelect extends AppCompatActivity implements View.OnClickListener{

    Button cleric, druid, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firbolg_select);

        cleric = findViewById(R.id.btnCleric);
        druid = findViewById(R.id.btnDruid);
        back = findViewById(R.id.btnBackFirbC);

        cleric.setOnClickListener(this);
        druid.setOnClickListener(this);
        back.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnCleric:
                Intent cleric = new Intent(firbolgSelect.this, firbolgInfoC.class);
                startActivity(cleric);
                break;
            case R.id.btnDruid:
                Intent druid = new Intent(firbolgSelect.this, firbolgInfoC.class);
                startActivity(druid);
                break;
            case R.id.btnBackFirbC:
                Intent back = new Intent(firbolgSelect.this, heroSelect.class);
                startActivity(back);
                break;
        }

    }
}