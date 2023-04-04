package Entities.Exo1;

public class CoursIndividuel extends Cours implements ICalcul
{

    private Instrument lInstrument;

    public CoursIndividuel(Instrument lInstrument, double unPrixCours, int unIdCours ) {
        super(unPrixCours, unIdCours);
        {
            this.lInstrument = lInstrument;
        }
    }

    @Override
    public double getPrix() {
        double prix = 5;
        if (lInstrument.equals("piano"))
        {
            prix = prix + 10.5;
        } else if (lInstrument.equals("guitare")) {
            prix = prix + 7.5;
        }
        else {
            prix = prix + 9;
        }

        return prix;
    }

    public String getInfos()
    {
        return"";
    }
}
