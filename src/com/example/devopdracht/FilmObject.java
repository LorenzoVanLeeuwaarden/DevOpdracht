package com.example.devopdracht;

public class FilmObject {

	private int filmID;
	private String filmTitel;
	private int filmJaar;
	private String filmIMDB;
	private String filmCover;
	private String trailerLink;
	private String filmBeschrijving;
	private String IMDBlink;
	
	private String leonGezien;
	private int leonCijfer;
	private String leonComment;
	
	private String lorenzoGezien;
	private int lorenzoCijfer;
	private String lorenzoComment;
	
	private String erwinGezien;
	private int erwinCijfer;
	private String erwinComment;
	
	private String nigelGezien;
	private int nigelCijfer;
	private String nigelComment;
	
	
	public FilmObject(int filmID, String filmTitel, int filmJaar, String filmIMDB, String filmCover, String trailerLink, String filmBeschrijving, String IMDBlink ,Object[] Leon, Object[] Erwin, Object[] Lorenzo, Object[] Nigel) {
		this.setFilmID(filmID);
		this.setFilmTitel(filmTitel);
		this.setFilmJaar(filmJaar);
		this.setFilmIMDB(filmIMDB);
		this.setFilmCover(filmCover);
		this.setTrailerLink(trailerLink);
		this.setFilmBeschrijving(filmBeschrijving);
		this.setIMDBlink(IMDBlink);
		
		this.setLeonGezien((String)Leon[0]);
		this.setLeonCijfer((Integer)Leon[1]);
		this.setLeonComment((String)Leon[2]);
		
		this.setLorenzoGezien((String)Lorenzo[0]);
		this.setLorenzoCijfer((Integer)Lorenzo[1]);
		this.setLorenzoComment((String)Lorenzo[2]);
		
		this.setErwinGezien((String)Erwin[0]);
		this.setErwinCijfer((Integer)Erwin[1]);
		this.setErwinComment((String)Erwin[2]);
		
		this.setNigelGezien((String)Nigel[0]);
		this.setNigelCijfer((Integer)Nigel[1]);
		this.setNigelComment((String)Nigel[2]);
		
	}


	public int getFilmID() {
		return filmID;
	}


	private void setFilmID(int filmID) {
		this.filmID = filmID;
	}


	public String getFilmTitel() {
		return filmTitel;
	}


	private void setFilmTitel(String filmTitel) {
		this.filmTitel = filmTitel;
	}


	public int getFilmJaar() {
		return filmJaar;
	}


	private void setFilmJaar(int filmJaar) {
		this.filmJaar = filmJaar;
	}


	public String getFilmIMDB() {
		return filmIMDB;
	}


	private void setFilmIMDB(String filmIMDB) {
		this.filmIMDB = filmIMDB;
	}


	public String getFilmCover() {
		return filmCover;
	}


	private void setFilmCover(String filmCover) {
		this.filmCover = filmCover;
	}


	public String getTrailerLink() {
		return trailerLink;
	}


	private void setTrailerLink(String trailerLink) {
		this.trailerLink = trailerLink;
	}


	public String getFilmBeschrijving() {
		return filmBeschrijving;
	}


	private void setFilmBeschrijving(String filmBeschrijving) {
		this.filmBeschrijving = filmBeschrijving;
	}


	public String getIMDBlink() {
		return IMDBlink;
	}


	private void setIMDBlink(String iMDBlink) {
		IMDBlink = iMDBlink;
	}


	public String getLeonGezien() {
		return leonGezien;
	}


	private void setLeonGezien(String leonGezien) {
		this.leonGezien = leonGezien;
	}


	public int getLeonCijfer() {
		return leonCijfer;
	}


	private void setLeonCijfer(int leonCijfer) {
		this.leonCijfer = leonCijfer;
	}


	public String getLeonComment() {
		return leonComment;
	}


	private void setLeonComment(String leonComment) {
		this.leonComment = leonComment;
	}


	public String getLorenzoGezien() {
		return lorenzoGezien;
	}


	private void setLorenzoGezien(String lorenzoGezien) {
		this.lorenzoGezien = lorenzoGezien;
	}


	public int getLorenzoCijfer() {
		return lorenzoCijfer;
	}


	private void setLorenzoCijfer(int lorenzoCijfer) {
		this.lorenzoCijfer = lorenzoCijfer;
	}


	public String getLorenzoComment() {
		return lorenzoComment;
	}


	private void setLorenzoComment(String lorenzoComment) {
		this.lorenzoComment = lorenzoComment;
	}


	public String getErwinGezien() {
		return erwinGezien;
	}


	private void setErwinGezien(String erwinGezien) {
		this.erwinGezien = erwinGezien;
	}


	public int getErwinCijfer() {
		return erwinCijfer;
	}


	private void setErwinCijfer(int erwinCijfer) {
		this.erwinCijfer = erwinCijfer;
	}


	public String getErwinComment() {
		return erwinComment;
	}


	private void setErwinComment(String erwinComment) {
		this.erwinComment = erwinComment;
	}


	public String getNigelGezien() {
		return nigelGezien;
	}


	private void setNigelGezien(String nigelGezien) {
		this.nigelGezien = nigelGezien;
	}


	public int getNigelCijfer() {
		return nigelCijfer;
	}


	private void setNigelCijfer(int nigelCijfer) {
		this.nigelCijfer = nigelCijfer;
	}


	public String getNigelComment() {
		return nigelComment;
	}


	private void setNigelComment(String nigelComment) {
		this.nigelComment = nigelComment;
	}
	
	

}
