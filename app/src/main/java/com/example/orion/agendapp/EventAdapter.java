package com.example.orion.agendapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Orion on 14/04/2017.
 */

public class EventAdapter extends RecyclerView.Adapter<EventAdapter.EventViewHolder>{

    Context contexto;
    private List<Events> listaEventos;

     public EventAdapter(Context con, List<Events> lista){
        contexto=con;
        listaEventos=lista;
    }

    @Override
    public EventViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.tarjeta_evento,parent,false);
        return new EventViewHolder(v);
    }

    @Override
    public void onBindViewHolder(EventViewHolder holder, int position) {
        holder.tvEvento.setText(listaEventos.get(position).getEvento());
        holder.tvEventoFecha.setText(listaEventos.get(position).getFecha());
        holder.tvEventoHora.setText(listaEventos.get(position).getHora());
        holder.tvEventoDescrip.setText(listaEventos.get(position).getDescripcion());
        holder.tvTel.setText(listaEventos.get(position).getTel());
    }

    @Override
    public int getItemCount() {
        return listaEventos.size();
    }

    public static class EventViewHolder extends RecyclerView.ViewHolder implements  View.OnCreateContextMenuListener {

        private TextView tvEvento;
        private TextView tvEventoFecha;
        private TextView tvEventoHora;
        private TextView tvEventoDescrip;
        private TextView tvTel;

        public EventViewHolder(View itemView) {
            super(itemView);

            tvEvento=(TextView) itemView.findViewById(R.id.tvEvento);
            tvEventoFecha=(TextView) itemView.findViewById(R.id.tvEventoFecha);
            tvEventoHora=(TextView) itemView.findViewById(R.id.tvEventoHora);
            tvEventoDescrip=(TextView) itemView.findViewById(R.id.tvEventoDescrip);
            tvTel=(TextView) itemView.findViewById(R.id.tvTel);
            itemView.setOnCreateContextMenuListener(this);
        }

        @Override
        public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
            MenuItem edit=menu.add(Menu.NONE,1,1,"Edit");
            MenuItem delete=menu.add(Menu.NONE,2,2,"Delete");
            MenuItem call=menu.add(Menu.NONE,3,3,"Call");
            edit.setOnMenuItemClickListener(listenerOnEditMenu);
            delete.setOnMenuItemClickListener(listenerOnDeleteMenu);
            call.setOnMenuItemClickListener(listenerOnCallMenu);
        }

        MenuItem.OnMenuItemClickListener listenerOnEditMenu= new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                //Toast.makeText(contexto,"Edit",Toast.LENGTH_SHORT).show();
                return false;
            }
        };

        MenuItem.OnMenuItemClickListener listenerOnDeleteMenu= new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                //Toast.makeText(this,"Delete",Toast.LENGTH_SHORT).show();
                return false;
            }
        };

        MenuItem.OnMenuItemClickListener listenerOnCallMenu= new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                //Toast.makeText(this,"Call",Toast.LENGTH_SHORT).show();
                return false;
            }
        };
    }






}
