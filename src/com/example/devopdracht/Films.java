package com.example.devopdracht;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by lorenzo on 25-5-13.
 */
public class Films extends ListActivity {

    String lijstFilms[];
    static Datasaver saver = new Datasaver();
    JSONtester json;
    ArrayAdapter<String> adapter;
    Map<Integer, Integer> positieOnLijst = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        json = new JSONtester(this);
        json.execute();
        
        lijstFilms = new String[]{"verbinden"};
        adapter = new ArrayAdapter<String>(Films.this, android.R.layout.simple_list_item_1, lijstFilms);        
        setListAdapter(adapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        if(positieOnLijst != null){
	        saver.setClickedFilm(positieOnLijst.get(position));
	
	        try{
	            Class filmNaam = Class.forName("com.example.devopdracht.Filmpagina");
	            Intent toFilm = new Intent(Films.this, filmNaam);
	            startActivity(toFilm);
	        }catch (ClassNotFoundException e){
	            e.printStackTrace();
	        }
        }
    }
    
    public void fillList(){
    	Log.d("nee", "4");
    	Map<Integer,FilmObject> films = json.getFilms(); 
        positieOnLijst = new HashMap();
        lijstFilms = new String[films.size()];
        Log.d("JSON",films.size()+"");
        Set<Integer> filmSet = films.keySet();
        int xCount = 0;
        for (int filmID : filmSet) {
        	positieOnLijst.put(xCount, filmID);
           	lijstFilms[xCount] = films.get(filmID).getFilmTitel();
           	xCount++;
        }
        Log.d("nee", films.size()+"");
        adapter = new ArrayAdapter<String>(Films.this, android.R.layout.simple_list_item_1, lijstFilms);        
        setListAdapter(adapter);
    }
}

