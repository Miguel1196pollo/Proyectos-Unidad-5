package mx.edu.utng.seccion_02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {
    private ListView listView;
    private List<String> names;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.listView);


    //Dats a mostrar
        names = new ArrayList<String>();
        names.add("Miguel");
        names.add("Juan");
        names.add("Omar");
        names.add("Guadalupe");
        names.add("Cruz");
        names.add("Manuel");
        names.add("Pablo");
        names.add("Luis");
        names.add("Antonio");
        names.add("David");
        names.add("Israel");
        names.add("Oscar");
        names.add("Orlando");
        names.add("Mario");
        names.add("Uriel");


        //Adaptador, la forma visual en que se mostraran los campos
       // ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, names);

        // Enlazamos el adaptador con nuestro List View
        //listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(ListActivity.this, "Click: "+names.get(position), Toast.LENGTH_LONG).show();

            }
        });

        MyAdapater myAdapater = new MyAdapater(this, R.layout.list_item, names);
        listView.setAdapter(myAdapater);

    }
}

