package pack;
import java.util.Calendar;

public class Produit {
    int id;
    String libelle ;
    String marque;
    float prix;
    Calendar dateExpiration = Calendar.getInstance ();
    Produit() {};
    Produit (int id , String libelle , String marque ) {
   	 this.id=id;
   	 this.libelle=libelle;
   	 this.marque=marque;
    }
    Produit (int id , String libelle , String marque , float prix) {
   	 this.id=id;
   	 this.libelle=libelle;
   	 this.marque=marque;
   	 this.prix=prix;
    }
    void afficher () {
   	 System.out.printf("id= %d , libelle= %s , marque= %s , prix= %f \n", id , libelle , marque , prix);
    }
    void modifierDateExipration (Calendar date) {
   	 dateExpiration = date;
   	 
   	 
    }
	
}


