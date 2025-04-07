public abstract class Racun implements Transakcije {
    private String brojRacuna;
    private double stanjeRacuna;

    public Racun(String brojRacuna, double stanjeRacuna){
        this.brojRacuna=brojRacuna;
        this.stanjeRacuna=stanjeRacuna;
    }

    public String getBrojRacuna(){
        return brojRacuna;
    }

    public void setBrojRacuna(String brojRacuna){
        this.brojRacuna=brojRacuna;
    }

    public double getStanjeRacuna() {
        return stanjeRacuna;
    }

    public void setStanjeRacuna(double stanjeRacuna) {
        this.stanjeRacuna = stanjeRacuna;
    }
    @Override
    public void uplata(double iznos) {
        stanjeRacuna+=iznos;
    }

    @Override
    public void isplata(double iznos) throws NedovoljnoSredstavaException {
        if(iznos>this.stanjeRacuna){
            throw new NedovoljnoSredstavaException("Nemate dovoljno sredstava na racunu");
        }
        stanjeRacuna-=iznos;

    }
}

