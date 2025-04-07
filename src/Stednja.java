public class Stednja extends Racun {

    private int minStanje=0;

    public Stednja(String brojRacuna, double stanjeRacuna) {
        super(brojRacuna, stanjeRacuna);
    }

    public int getMinStanje() {
        return minStanje;
    }

    @Override
    public void isplata(double iznos) throws NedovoljnoSredstavaException {
        if(iznos-getStanjeRacuna()<minStanje){
            throw new NedovoljnoSredstavaException("Nemate dovoljno sredstava na racunu");
        }
        setStanjeRacuna(getStanjeRacuna()-iznos);

    }
}
