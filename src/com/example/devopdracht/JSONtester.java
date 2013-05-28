package com.example.devopdracht;

import java.util.HashMap;
import java.util.Map;

import java.io.InputStreamReader;
import java.net.URL;

import android.os.AsyncTask;
import android.util.Log;

import com.google.gson.stream.JsonReader;

public class JSONtester extends AsyncTask{
	
	static private Map<Integer, FilmObject> films;
	static private Map<Integer, ?> series;
	
	static private boolean gotFilms = false;
	static private boolean gotSeries = false;
	
	private Films lijst;
	
	@Override
	protected Object doInBackground(Object... arg0) {
		Log.d("nee", "1");
		if (!gotFilms) {
			gotFilms = true;
			setFilms();
			Log.d("nee", "2");
		}
		return true;
	}
	
	
	
	@Override
	protected void onPostExecute(Object result) {
		// TODO Auto-generated method stub
		super.onPostExecute(result);
		lijst.fillList();
	}

	public FilmObject getFilmObject(int FilmID){
		return films.get(FilmID);		
	}	

	public JSONtester(Films lijst){
		this.lijst = lijst;
	}
	
	public JSONtester(){}

	public Map<Integer, FilmObject> getFilms(){
		return films;
	}
	
	private void setFilms(){
		films = new HashMap();
		try {
			URL stoux = new URL("http://stoux2.nl/partsAJAX/getFilmsJSON.php");
			InputStreamReader stouxStream = new InputStreamReader(stoux.openStream());
			JsonReader reader = new JsonReader(stouxStream);
			reader.beginObject();
			while (reader.hasNext()) {
				int filmID = 0;
				String filmTitel = null;
				int filmJaar = 0;
				String filmIMDB = null;
				String filmCover = null;
				String trailerLink = null;
				String filmBeschrijving = null;
				String IMDBlink = null;
				
				Object[] Leon = new Object[3];
				Object[] Erwin = new Object[3];
				Object[] Lorenzo = new Object[3];
				Object[] Nigel = new Object[3];
				
					reader.nextName();
					reader.beginObject();
					while (reader.hasNext()) {
						
						
						
						String name = reader.nextName();
						
						if (name.equals("FilmNr")) {
							filmID = Integer.parseInt(reader.nextString());
						} else if (name.equals("FilmTitel")) {
							filmTitel = reader.nextString();
						} else if (name.equals("FilmJaar")) {
							filmJaar = Integer.parseInt(reader.nextString());
						} else if (name.equals("FilmIMDB")) {
							filmIMDB = reader.nextString();
						} else if (name.equals("FilmCover")) {
							filmCover = reader.nextString();
						} else if (name.equals("TrailerLink")) {
							trailerLink = reader.nextString();
						} else if (name.equals("FilmBeschrijving")) {
							filmBeschrijving = reader.nextString();
						} else if (name.equals("FilmIMDBLink")) {
							IMDBlink = reader.nextString();
						} else if (name.equals("Erwin")) {
							getPersoonData(Erwin, reader);
						} else if (name.equals("Leon")) {
							getPersoonData(Leon, reader);
						} else if (name.equals("Nigel")) {
							getPersoonData(Nigel, reader);
						} else if (name.equals("Lorenzo")) {
							getPersoonData(Lorenzo, reader);
						}
						
					}
					reader.endObject();
					FilmObject film = new FilmObject(filmID, filmTitel, filmJaar, filmIMDB, filmCover, trailerLink, filmBeschrijving, IMDBlink, Leon, Erwin, Lorenzo, Nigel);
					films.put(filmID, film);
			}
			reader.endObject();
			reader.close();
			Log.d("nee", films.size()+"");
			
		} catch (Exception e) {e.printStackTrace();}
	}
	
	private void getPersoonData(Object[] persoon, JsonReader reader) {
		try {
			reader.beginObject();
			while (reader.hasNext()) {
				String name = reader.nextName();
				if (name.equals("Gezien")) {
					persoon[0] = reader.nextString();
				} else if (name.equals("Rating")) {
					persoon[1] = Integer.parseInt(reader.nextString());
				} else if (name.equals("Comment")) {
					persoon[2] = reader.nextString();
				}
			}
			reader.endObject();
		}
		catch (Exception e) {
			try {
				reader.nextString();
			} catch (Exception er) {}
			persoon[0] = "NNI";
			persoon[1] = 0;
			persoon[2] = "";
		}
		
	}

	
	
}
