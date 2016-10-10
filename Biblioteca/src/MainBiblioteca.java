import java.util.ArrayList;
import java.util.List;

import biblioteca.*;

public class MainBiblioteca {

	public static void main(String[] args) {
		
		Gestione g = new Gestione();
		Biblioteca b = new Biblioteca();
		Utente u = new Utente();
		List<Libro> libri = new ArrayList<Libro>();
		
		
		///REGISTRA LIBRI
		g.registraLibro(b, "The Deal", "Lisa Passi", "HHIH982J", 4);
		g.registraLibro(b, "Harry Potter e la Pietra Filosofale", "JKR", "FGGTRKSK", 1);
		g.registraLibro(b, "Preferisco la Coppa", "Carlo Ancelotti", "CCIH7DFGJ", 3);
		g.registraLibro(b, "Harry Potter e la Camera dei Segreti", "JKR", "FJIHOKSK", 3);
				
		
		///STAMPA I LIBRI
		g.stampaLibri(b);
		
		
		
		///REGISTRA UTENTI
		g.registraUtente(b, "Piero", "Mal");
		g.registraUtente(b, "Piero", "Mal");
		g.registraUtente(b, "Piero", "Mal");
		g.registraUtente(b, "Fiorenzo", "Passi");
		g.registraUtente(b, "Lisa", "Passi");
		g.registraUtente(b, "Fiorenzo", "Passi");
		g.registraUtente(b, "Lisa", "Passi");
		g.registraUtente(b, "Ettore", "Passi");
		g.registraUtente(b, "Davide", "D'Amico");
		g.registraUtente(b, "Dav", "Damics");
		
		///STAMPA GLI UTENTI
		g.stampaUtenti(b);
		
		
		
		///PRESTA LIBRI
		System.out.println("\n\n***PRESTA LIBRO***");
		g.prestaLibro(b, "Piero", "Mal", "The Deal", "Lisa Passi", libri);  ///IL LIBRO E' STATO PRESTATO
		g.prestaLibro(b, "Piero", "Mal", "The Deal", "Lisa Passi", libri);  ///IL LIBRO E' STATO PRESTATO
		g.prestaLibro(b, "Piero", "Mal", "The Deal", "Lisa Passi", libri);  ///IL LIBRO E' STATO PRESTATO
		g.prestaLibro(b, "Piero", "Mal", "The Deal", "Lisa Passi", libri);  ///IL LIBRO E' STATO PRESTATO
		g.prestaLibro(b, "Piero", "Mal", "Harry Potter e la Pietra Filosofale", "JKR", libri);  
		g.prestaLibro(b, "Fiorenzo", "Passi", "The Deal", "Lisa Passi", libri);  ///IL LIBRO E' STATO PRESTATO
		g.prestaLibro(b, "Piero", "Mal", "The Deal", "Lisa Passi", libri);  ///IL LIBRO E' STATO PRESTATO
		g.prestaLibro(b, "Davide", "D'Amico", "Harry Potter e la Camera dei Segreti", "JKR", libri);
		g.prestaLibro(b, "Davide", "D'Amico", "The Deal", "Lisa Passi", libri);  /// PRESTA IL LIBRO, QUANDO INVECE NON DOVREBBE FARLO
		g.prestaLibro(b, "Davide", "D'Amico", "Harry Potter e la Camera dei Segreti", "JKR", libri);
		g.prestaLibro(b, "Fiorenzo", "Passi", "Harry Potter e la Camera dei Segreti", "JKR", libri);
		g.prestaLibro(b, "Fiorenzo", "Passi", "Harry Potter e la Camera dei Segreti", "JKR", libri);
		g.prestaLibro(b, "Davide", "D'Amico", "The Deal", "Lisa Passi", libri);  ////DA' TI PRESTO LA CAMERA DEI SEGRETI
		g.prestaLibro(b, "Ettore", "Passi", "Harry Potter e la Camera dei Segreti", "JKR", libri);
		
		
		///VISUALIZZA LIBRI PRESTATI
		System.out.println("\n\n");
		g.stampaLibriPrestati(b);
		
		
		/// VISUALIZZA LIBRI TOTALI DOPO IL PRESTITO
		System.out.println("\n\n***LIBRI TOTALI DOPO IL PRESTITO***");
		g.stampaLibri(b);
		
		
		
		////RESTITUISCI LIBRI
		System.out.println(g.restituisciLibro(b, "Piero", "Mal", "The Deal", "Lisa Passi"));
		System.out.println(g.restituisciLibro(b, "Fiorenzo", "Passi", "The Deal", "Lisa Passi"));
		System.out.println(g.restituisciLibro(b, "Fiorenzo", "Passi", "Harry Potter e la Camera dei Segreti", "JKR"));
		System.out.println(g.restituisciLibro(b, "Fiorenzo", "Passi", "Harry Potter e la Camera dei Segreti", "JKR"));   ///QUESTO LIBRO NON E' PRESENTE NELLA LISTA LIBRI POSSEDUTI DI TALE UTENTE
		g.restituisciLibro(b, "Piero", "Mal", "The Deal", "Lisa Passi");  ///IL LIBRO E' STATO PRESTATO
		g.restituisciLibro(b, "Piero", "Mal", "The Deal", "Lisa Passi");  ///IL LIBRO E' STATO PRESTATO
		g.restituisciLibro(b, "Davide", "D'Amico", "Harry Potter e la Camera dei Segreti", "JKR");
		g.restituisciLibro(b, "Davide", "D'Amico", "Harry Potter e la Camera dei Segreti", "JKR");
		
		
		/// VISUALIZZA LIBRI TOTALI DOPO LA RESTITUZIONE
		System.out.println("\n\n***LIBRI TOTALI DOPO LA RESTITUZIONE***");
		g.stampaLibri(b);
		
		
		/// VISUALIZZA LIBRI PRESTATI DOPO LA RESTITUZIONE
		System.out.println("\n\n***LIBRI TOTALI PRESTATI DOPO LA RESTITUZIONE***");
		g.stampaLibriPrestati(b);
		
	}
}
