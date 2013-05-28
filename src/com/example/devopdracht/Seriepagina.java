package com.example.devopdracht;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TextView;

/**
 * Created by lorenzo on 25-5-13.
 */
public class Seriepagina extends Activity {

    static Datasaver saver = new Datasaver();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seriepagina);

        int Serienaam = saver.getClickedSerie();
        TextView serietitel = (TextView)findViewById(R.id.SerieTitel);
        serietitel.setText(Serienaam);

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
