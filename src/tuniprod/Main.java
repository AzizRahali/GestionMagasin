package tuniprod;

import tuniprod.employe.Caissier;
import tuniprod.employe.Responsable;
import tuniprod.employe.Vendeur;
import tuniprod.magasin.Magasin;
import tuniprod.magasin.MagasinPleinException;
import tuniprod.magasin.PrixNegatifException;
import tuniprod.produit.Produit;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws MagasinPleinException, PrixNegatifException {
        Magasin carrefour = new Magasin(1, "Carrefour", "Centre Ville");
        Magasin monoPrix = new Magasin(2, "Mono Prix", "Manzah 6");

        Caissier c1 = new Caissier(1, "Ali", "Tunis");
        Caissier c2 = new Caissier(2, "Mohamed", "Ariana");
        Vendeur v1 = new Vendeur(3, "Ahmed", "Tunis");
        Responsable r1 = new Responsable(4, "Hassen", "Tunis");

        for (int i = 0; i < 4; i++) {
            carrefour.addEmploye(c1);
            carrefour.addEmploye(c2);
            carrefour.addEmploye(v1);
            carrefour.addEmploye(r1);
        }

        c1 = new Caissier(5, "Arij", "Tunis");
        v1 = new Vendeur(6, "Aziz", "Tunis");
        Vendeur v2 = new Vendeur(7, "Mohamed", "Tunis");
        Vendeur v3 = new Vendeur(8, "Firas", "Tunis");
        r1 = new Responsable(9, "Nadim", "Tunis");

        for (int i = 0; i < 5; i++) {
            monoPrix.addEmploye(c1);
            monoPrix.addEmploye(v1);
            monoPrix.addEmploye(v2);
            monoPrix.addEmploye(v3);
            monoPrix.addEmploye(r1);
        }

        for (int i =0; i< carrefour.getNbEmployes(); i++) {
            System.out.println(carrefour.getEmployes()[i]);
        }

        for (int i =0; i< monoPrix.getNbEmployes(); i++) {
            System.out.println(monoPrix.getEmployes()[i]);
        }

        Produit p1 = new Produit(1, "Lait", "Delice");
        Produit p2 = new Produit(2, "Yaourt", "Yab", 0.5);
        Produit p3 = new Produit(3, "Yaourt", "Yab", 0.5, LocalDate.of(2021, 12, 31));
        Produit p4 = new Produit(4, "Snack", "Kif", 1.5, LocalDate.of(2021, 12, 31));

        for (int i = 0; i < 3; i++) {
            carrefour.addProduit(p1);
            carrefour.addProduit(p2);
            carrefour.addProduit(p3);
            carrefour.addProduit(p4);
        }

        p1 = new Produit(5, "Cafe", "Nescafe", 2.5, LocalDate.of(2021, 12, 31));
        p2 = new Produit(6, "Eau", "Ain Zaghouan", 0.5, LocalDate.of(2021, 12, 31));
        p3 = new Produit(7, "Eau", "Sabrine", 1.5, LocalDate.of(2021, 12, 31));
        p4 = new Produit(8, "Snack", "Kif", 1.5, LocalDate.of(2021, 12, 31));

        for (int i = 0; i < 3; i++) {
            monoPrix.addProduit(p1);
            monoPrix.addProduit(p2);
            monoPrix.addProduit(p3);
            monoPrix.addProduit(p4);
        }

        for (int i =0; i< carrefour.getNbProduits(); i++) {
            System.out.println(carrefour.getProduits()[i]);
        }

        for (int i =0; i< monoPrix.getNbProduits(); i++) {
            System.out.println(monoPrix.getProduits()[i]);
        }
    }
}