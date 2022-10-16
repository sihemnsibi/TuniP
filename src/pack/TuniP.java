package pack;

public class TuniP {
	public static void main (String args[]) {
	Produit produit1= new Produit ();
	Produit lait= new Produit(1021 ,"Lait" , "Délice");
	Produit yaourt= new Produit(2510 ,"Yaourt" , "Vitalait");
	Produit tomate= new Produit(3250 ,"Tomate" , "Sicam" , 1.200f);
	lait.afficher();
	yaourt.afficher();
	tomate.afficher();
    lait.prix=0.700f;
    yaourt.prix=0.300f;
    lait.afficher();
    yaourt.afficher();
    
   

	}
}

