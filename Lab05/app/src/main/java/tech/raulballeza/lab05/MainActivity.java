package tech.raulballeza.lab05;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    ListView LV1;
    Button B1;

    static final String[] Frutas = new String[]{"Manzana", "Mango", "Durazno", "Platano", "Fresa", "Uva", "Sandia", "Melon", "Ranbután", "Zapote", "Maracuya"};
    ArrayAdapter<String> adapter;
    List<String> lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista = new ArrayList<String>();
        lista.add("Programacion");
        lista.add("Matematicas");
        lista.add("Calculo");
        lista.add("Algebra");
        lista.add("Ing. Software");

        LV1 = (ListView) findViewById(R.id.listView);
        B1 = (Button) findViewById(R.id.button);

        //adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, Frutas);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, lista);


        LV1.setAdapter(adapter);
        LV1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),
                        ((TextView) view).getText() + "- Posicion: " + position, Toast.LENGTH_SHORT).show();
            }
        });

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText materia = findViewById(R.id.materia);
                lista.add(materia.getText().toString());
                materia.setText("");
                adapter.notifyDataSetChanged();
            }
        });

    }

}
