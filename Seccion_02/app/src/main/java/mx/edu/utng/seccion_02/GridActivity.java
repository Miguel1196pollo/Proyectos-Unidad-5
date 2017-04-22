package mx.edu.utng.seccion_02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class GridActivity extends AppCompatActivity {

    private List<String> names;
    private GridView gridView;

    private MyAdapater myAdapater;

    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

        gridView = (GridView)findViewById(R.id.gv_gridView);


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



        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(GridActivity.this, "Click: "+names.get(position), Toast.LENGTH_LONG).show();

            }
        });

        myAdapater = new MyAdapater(this, R.layout.grid_item, names);
        gridView.setAdapter(myAdapater);

        registerForContextMenu(gridView);
    }


    //Inflamos los layout del menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
    inflater.inflate(R.menu.action_bar_menu,menu);
        return true;
    }

    //manejamos eventos
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.add_item:
                this.names.add("Added nº"+(++counter));
                this.myAdapater.notifyDataSetChanged();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    //Inflamos el layout del context menu
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater inflater = getMenuInflater();

        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) menuInfo;
        menu.setHeaderTitle(names.get(info.position));
        inflater.inflate(R.menu.context_menu,menu);
    }

    // Manjems eventos cick en el context menu
    @Override
    public boolean onContextItemSelected(MenuItem item) {
        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();

        switch (item.getItemId()){
            case R.id.delete_item:
                this.names.remove(info.position);
                this.myAdapater.notifyDataSetChanged();
                return true;
            default:
                return  super.onContextItemSelected(item);
        }
    }
}
