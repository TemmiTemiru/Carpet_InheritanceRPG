package mcm.edu.ph.carpet_inheritancerpg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class elfInfoBard extends AppCompatActivity implements View.OnClickListener{

    Button back;
    TextView health, attack, defense, type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elf_info_bard);

        health = findViewById(R.id.txtElfHP);
        attack = findViewById(R.id.txtViewElfATK);
        defense = findViewById(R.id.txtViewElfDEF);
        type = findViewById(R.id.txtViewElfType);

        back = findViewById(R.id.btnBAckElfW);

        back.setOnClickListener(this);

        health.setText("150");
        attack.setText("85");
        defense.setText("120");
        type.setText("Bard");

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnBAckElfW:
                Intent back = new Intent(elfInfoBard.this, elfSelect.class);
                startActivity(back);
                break;
        }


    }
}