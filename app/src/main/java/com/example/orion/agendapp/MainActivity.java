package com.example.orion.agendapp;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static com.example.orion.agendapp.R.id.reciclador;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Events> eventsList= new ArrayList<>();
    EventAdapter adapter;

   // BDEvento objEvento;
    //SQLiteDatabase DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=(RecyclerView) findViewById(reciclador);
        recyclerView.setHasFixedSize(true);
        registerForContextMenu(recyclerView);

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        cargarDatos();
        adapter=new EventAdapter(this,eventsList);
        recyclerView.setAdapter(adapter);


    }

    public void cargarDatos(){
        eventsList.add(new Events("eventTest","Date","Hour","Desc","Tel"));
        /*eventsList= (List<Events>) new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1);
        objEvento=new BDEvento(this, "CURSO",null, 1);
        DB=objEvento.getReadableDatabase();

        Cursor c = DB.rawQuery("SELECT * FROM evento ORDER BY nombre", null);
        if( c.moveToFirst() ){
            do{
                eventsList.add(c.getString(1)+" "+c.getString(2)+" "+c.getString(3)+" "+c.getString(4)+" "+c.getString(5));
            }while(c.moveToNext());
            recyclerView.setAdapter(eventsList);
        }else{
            Toast.makeText(getApplicationContext(), "No Existen Registros", Toast.LENGTH_SHORT).show();
            this.finish();
        }*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.itmAddEvent:
                Intent intent1= new Intent(this,NuevoEvento.class);
                startActivity(intent1);

                return true;
            case R.id.itmAbout:
                Intent intent= new Intent(this,About.class);
                startActivity(intent);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
