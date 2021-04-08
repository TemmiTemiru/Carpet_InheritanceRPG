package mcm.edu.ph.carpet_inheritancerpg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tieflingSelect extends AppCompatActivity implements View.OnClickListener{

    Button ranger, rogue, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tiefling_select);

        ranger = findViewById(R.id.btnRanger);
        rogue = findViewById(R.id.btnRogue);
        back = findViewById(R.id.btnBackTief);

        ranger.setOnClickListener(this);
        rogue.setOnClickListener(this);
        back.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btnRanger:
                Intent ranger = new Intent(tieflingSelect.this, tieflingInfo.class);
                startActivity(ranger);
                break;
            case R.id.btnRogue:
                Intent rogue = new Intent(tieflingSelect.this, tieflingInfo.class);
                startActivity(rogue);
                break;
            case R.id.btnBackTief:
                Intent back = new Intent(tieflingSelect.this, heroSelect.class);
                startActivity(back);
                break;
        }

    }
}