public class Main {

    public static void main(String[] args){

        Tekuci tekuci = new Tekuci("TR123", 0);
        Stednja stedni = new Stednja("SR456", 2000);


        try {
            tekuci.isplata(5600); // OK
            stedni.isplata(3500); // Baca iznimku
        } catch (NedovoljnoSredstavaException e) {
            System.out.println("Greška: " + e.getMessage());
        }

    }
}
