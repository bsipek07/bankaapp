public interface Transakcije {

     void uplata(double iznos);


     void isplata(double iznos)throws NedovoljnoSredstavaException;

}
