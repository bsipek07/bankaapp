public class Tekuci extends Racun{


    private double maxDebt=-4500;

    public Tekuci(String brojRacuna, double stanjeRacuna) {
        super(brojRacuna, stanjeRacuna);

    }


    public double getMaxDebt() {
        return maxDebt;
    }

    public void setMaxDebt(double maxDebt) {
        this.maxDebt = maxDebt;
    }

    @Override
    public void isplata(double iznos) throws NedovoljnoSredstavaException {
        if(iznos-getStanjeRacuna()<maxDebt){
            throw new NedovoljnoSredstavaException("Nemate dovoljno sredstava na racunu");
        }
        setStanjeRacuna(getStanjeRacuna()-iznos);

    }
}
