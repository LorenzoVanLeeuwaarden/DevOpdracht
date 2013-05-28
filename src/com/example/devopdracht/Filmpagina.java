package com.example.devopdracht;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.KeyEvent;
import android.widget.TextView;

/**
 * Created by lorenzo on 25-5-13.
 */
public class Filmpagina extends Activity {

    static Datasaver saver = new Datasaver();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.filmpagina);

        JSONtester filmjson = new JSONtester();
        FilmObject film = filmjson.getFilmObject(saver.getClickedFilm());
        
        
        
        TextView filmTitel = (TextView)findViewById(R.id.FilmNaam);
        TextView filmBeschrijving = (TextView)findViewById(R.id.FilmBeschrijving);
        TextView filmIMDB = (TextView)findViewById(R.id.FilmIMDB);
        TextView filmJaar = (TextView)findViewById(R.id.FilmJaar);
        filmTitel.setText(film.getFilmTitel());
        filmBeschrijving.setMovementMethod(new ScrollingMovementMethod());
        filmBeschrijving.setText(film.getFilmBeschrijving());
        filmIMDB.setText("IMDB Cijfer:"+film.getFilmIMDB());
        filmJaar.setText("Jaar: "+film.getFilmJaar());
        
        
        
       // String FilmBeschrijving = 

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK))
        {
            finish();
        }

        return super.onKeyDown(keyCode, event);

    }
}
