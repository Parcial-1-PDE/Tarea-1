package com.myproyect.tarea_1;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText etTarea;
    private Button btnAgregar, btnPendientes, btnHechas;
    private ListView lvTareas;
    private ArrayList<String> tareasPendientes;
    private ArrayList<String> tareasHechas;
    private ArrayAdapter<String> adapterPendientes;
    private ArrayAdapter<String> adapterHechas;
    private boolean mostrandoPendientes = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etTarea = findViewById(R.id.etTarea);
        btnAgregar = findViewById(R.id.btnAgregar);
        btnPendientes = findViewById(R.id.btnPendientes);
        btnHechas = findViewById(R.id.btnHechas);
        lvTareas = findViewById(R.id.lvTareas);

        tareasPendientes = new ArrayList<>();
        tareasHechas = new ArrayList<>();

        adapterPendientes = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, tareasPendientes);
        adapterHechas = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, tareasHechas);
        lvTareas.setAdapter(adapterPendientes);

        btnAgregar.setOnClickListener(v -> {
            String tarea = etTarea.getText().toString();
            if (!tarea.isEmpty()) {
                tareasPendientes.add(tarea);
                adapterPendientes.notifyDataSetChanged();
                etTarea.setText("");
            }
        });

        btnPendientes.setOnClickListener(v -> mostrarPendientes());
        btnHechas.setOnClickListener(v -> mostrarHechas());

        registerForContextMenu(lvTareas);

        lvTareas.setOnItemClickListener((parent, view, position, id) -> {
            if (mostrandoPendientes) {
                tareasHechas.add(tareasPendientes.remove(position));
                adapterPendientes.notifyDataSetChanged();
                adapterHechas.notifyDataSetChanged();
            }
        });
    }

    private void mostrarPendientes() {
        mostrandoPendientes = true;
        lvTareas.setAdapter(adapterPendientes);
    }

    private void mostrarHechas() {
        mostrandoPendientes = false;
        lvTareas.setAdapter(adapterHechas);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.menu, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        if (item.getItemId() == R.id.eliminar) {
            if (mostrandoPendientes) {
                tareasPendientes.remove(info.position);
                adapterPendientes.notifyDataSetChanged();
            } else {
                tareasHechas.remove(info.position);
                adapterHechas.notifyDataSetChanged();
            }
            return true;
        }
        return super.onContextItemSelected(item);
    }
}
