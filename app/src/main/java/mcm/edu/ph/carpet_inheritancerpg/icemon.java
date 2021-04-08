package mcm.edu.ph.carpet_inheritancerpg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class icemon extends AppCompatActivity implements View.OnClickListener{

    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_icemon);

        back = findViewById(R.id.btnBackIce);

        back.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btnBackIce:
                Intent back = new Intent(icemon.this, monsterSelect.class);
                startActivity(back);
                break;
        }

    }
}