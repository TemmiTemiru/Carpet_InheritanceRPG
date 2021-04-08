package mcm.edu.ph.carpet_inheritancerpg;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class elfInfoWarlock extends AppCompatActivity implements View.OnClickListener{

    Button back;
    TextView health, attack, defense, type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elf_info_war);

        health = findViewById(R.id.txtViewElfHP);
        attack = findViewById(R.id.txtViewElfATK);
        defense = findViewById(R.id.txtViewElfDEF);
        type = findViewById(R.id.txtViewElfType);

        back = findViewById(R.id.btnBAckElfW);

        back.setOnClickListener(this);

        health.setText("200");
        attack.setText("120");
        defense.setText("150");
        type.setText("Warlock");


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnBAckElfW:
                Intent back = new Intent(elfInfoWarlock.this, elfSelect.class);
                startActivity(back);
                break;
        }

    }
}
