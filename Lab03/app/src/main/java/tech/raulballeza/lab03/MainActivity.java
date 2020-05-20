package tech.raulballeza.lab03;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    Button B1;
    CheckBox CB1;
    TextView TV1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CB1 = (CheckBox) findViewById(R.id.checkBox);
        TV1 = (TextView) findViewById(R.id.textView);
        B1 = (Button) findViewById (R.id.button1);

        CB1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                String C = ((isChecked==true) ? "Verdadero" : "Falso" );
                TV1.setText(C);
            }
        });

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Estatus del Check: "+CB1.isChecked(), Toast.LENGTH_LONG).show();
            }
        });


    }


   
}
