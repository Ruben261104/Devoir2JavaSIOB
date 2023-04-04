package Entities.Exo1;

public class CoursCollectif extends Cours implements ICalcul
{

    private String nomCours;
    private int nbPlacesMaxi;
    private int ageMini;

    public CoursCollectif(String nomCours, int nbPlacesMaxi, int ageMini,double unPrixCours, int unIdCours ) {
        super(unPrixCours, unIdCours);
        this.nomCours = nomCours;
        this.nbPlacesMaxi = nbPlacesMaxi;
        this.ageMini = ageMini;
    }

    @Override
    public double getPrix() {
        double prix = 5;
        if (ageMini > 10 & ageMini < 20)
        {
            prix = prix + 15;
        } else if ( ageMini < 10) {
            prix = prix + 12;
        }
        else {
            prix = prix + 17;
        }
        return prix;
    }

    public String getInfos()
    {
        return "";
    }


}
