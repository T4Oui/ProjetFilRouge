package test;

import libraryJNA.LibraryImageMoteur;
import libraryJNA.LibrarySonMoteur;
import libraryJNA.LibraryTexteMoteur;
import com.sun.jna.Pointer;

public class TestJNA {
	
	public static void main(String[] args) {
		LibraryTexteMoteur libraryTexteMoteur = LibraryTexteMoteur.INSTANCE;
		//libraryTexteMoteur.indexation_texte();
		libraryTexteMoteur.rech_MC("musique");
		//libraryTexteMoteur.recherche_comparaison_texte("/home/pfr/DATA_PFR/03-Mimer_un_signal_nerveux_pour_utf8", 35);
		
		//LibraryImageMoteur libraryImageMoteur = LibraryImageMoteur.INSTANCE;
		//libraryImageMoteur.indexation_image();
		//String fich = "";
		//libraryImageMoteur.recherchenoiretblanc(4055, 0, fich);
		//System.out.println(fich);
		//LibrarySonMoteur librarySonMoteur = LibrarySonMoteur.INSTANCE;
		//librarySonMoteur.indexation_son();
	}
}