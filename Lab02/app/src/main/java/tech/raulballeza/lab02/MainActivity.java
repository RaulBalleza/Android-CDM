package tech.raulballeza.lab02;

/* Fuente:
http://javatechig.com/android/android-textwatcher-example

 */

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText passwordEditText;
    private TextView textView;
    private AutoCompleteTextView ACtextView;
    private Button B1;

    private final Button.OnClickListener BL = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(getApplicationContext(), "BOTON ", Toast.LENGTH_LONG).show();
        }
    };

    private final TextWatcher passwordWatcher = new TextWatcher() {
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        public void onTextChanged(CharSequence s, int start, int before, int count) {
            textView.setVisibility(View.VISIBLE);
        }

        public void afterTextChanged(Editable s) {
            if (s.length() == 0) {
                textView.setVisibility(View.GONE);
            } else{
                textView.setText("Ingresaste : " + passwordEditText.getText());
            }
        }
    };

    private final TextWatcher colorWatcher = new TextWatcher() {
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        public void onTextChanged(CharSequence s, int start, int before, int count) {
            //textView.setVisibility(View.VISIBLE);
            switch (ACtextView.getText().toString()) {
                case "Red":   Toast.makeText(getApplicationContext(), "ROJO: ", Toast.LENGTH_LONG).show();  B1.setBackgroundColor(Color.RED); break;
                case "Blue":  Toast.makeText(getApplicationContext(), "AZUL: ", Toast.LENGTH_LONG).show();  B1.setBackgroundColor(Color.BLUE);  break;
                case "Green": Toast.makeText(getApplicationContext(), "VERDE: ", Toast.LENGTH_LONG).show(); B1.setBackgroundColor(Color.GREEN); break;
                case "Black": Toast.makeText(getApplicationContext(), "VERDE: ", Toast.LENGTH_LONG).show(); B1.setBackgroundColor(Color.BLACK); B1.setTextColor(Color.WHITE); break;
            }
        }

        public void afterTextChanged(Editable s) {
            if (s.length() == 0) {
                textView.setVisibility(View.GONE);
            } else{
                textView.setText("You have entered : " + passwordEditText.getText());
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        B1 = (Button) findViewById(R.id.button1);
        B1.setOnClickListener(BL);

        ACtextView = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView1);
        String colors[] = {"Red","Blue","White","Yellow","Black", "Green","Purple","Orange","Grey"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, colors);
        ACtextView.setAdapter(adapter);

        /* Initializing views */
        passwordEditText = (EditText) findViewById(R.id.password);
        textView = (TextView) findViewById(R.id.passwordHint);
        //textView.setVisibility(View.GONE);
        textView.setVisibility(View.VISIBLE);

        /* Set Text Watcher listener */
        passwordEditText.addTextChangedListener(passwordWatcher);
        ACtextView.addTextChangedListener(colorWatcher);



    }







}
