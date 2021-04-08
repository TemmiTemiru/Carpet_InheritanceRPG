package mcm.edu.ph.carpet_inheritancerpg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class elfSelect extends AppCompatActivity implements View.OnClickListener{

    Button bard, warlock, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elf_select);

        bard = findViewById(R.id.btnBard);
        warlock = findViewById(R.id.btnWarlock);
        back = findViewById(R.id.btnBackElf);

        bard.setOnClickListener(this);
        warlock.setOnClickListener(this);
        back.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btnBard:
                Intent bard = new Intent(elfSelect.this, elfInfoBard.class);
                startActivity(bard);
                break;
            case R.id.btnWarlock:
                Intent warlock = new Intent(elfSelect.this, elfInfoBard.class);
                startActivity(warlock);
                break;
            case R.id.btnBackElf:
                Intent back = new Intent(elfSelect.this, heroSelect.class);
                startActivity(back);
                break;
        }

    }
}