package tech.raulballeza.lab04;

//import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    TextView TV1;
    ImageView IM1;
    Button B1;
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*TV1 = (TextView) findViewById(R.id.textView);
        IM1= (ImageView) findViewById(R.id.imageView);
        B1 = (Button) findViewById (R.id.button1);

        radioGroup = (RadioGroup) findViewById(R.id.radio);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // checkedId is the RadioButton selected
                //TV1.setText(""+checkedId);
                RadioButton rb=(RadioButton)findViewById(checkedId);
                TV1.setText(rb.getText());

                switch (rb.getText().toString()) {
                    case "Opcion 1": IM1.setImageResource(R.drawable.cgup); break;
                    case "Opcion 2": IM1.setImageResource(R.drawable.upv); break;
                    case "Opcion 3": IM1.setImageResource(R.drawable.cgup); break;
                    default: break;
                }

            }
        });

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*RadioButton RB1;
                RB1 = (RadioButton) radioGroup.getCheckedRadioButtonId();*/
                /*int id = radioGroup.getCheckedRadioButtonId();

                switch (id) {
                    case R.id.rb1: Toast.makeText(getApplicationContext(), "Opcion 1:", Toast.LENGTH_LONG).show(); break;
                    case R.id.rb2: Toast.makeText(getApplicationContext(), "Opcion 2:", Toast.LENGTH_LONG).show(); break;
                    case R.id.rb3: Toast.makeText(getApplicationContext(), "Opcion 3:" , Toast.LENGTH_LONG).show(); break;
                    default: break;
                }


            }
        });*/
    }

}
