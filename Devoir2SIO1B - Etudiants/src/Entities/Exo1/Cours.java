package Entities.Exo1;

public class Cours implements ICalcul,Comparable<Cours>
{
    protected double prixCours;
    protected int idCours;

    public Cours(double prixCours, int idCours) {
        this.prixCours = prixCours;
        this.idCours = idCours;
    }

    @Override
    public int compareTo(Cours o) {
        return 0;
    }

    @Override
    public double getPrix() {
        double prix = 5;

        return prix;
    }

    public String getInfos()
    {
        return "Prix du cours : " + prixCours + "/n" + "Id du cours : " + idCours;
    }
}
