public class SymulatorOdtwarzaczy {
    public static void main(String[] args) {
        Mp3 mp3 = new Mp3();
        CD cd = new CD();
        System.out.println(mp3.nastepnyUtwor());
        System.out.println(mp3.pauza());
        System.out.println(mp3.odtwarzaj());
        System.out.println(mp3.poprzedniUtwor());
        System.out.println(mp3.stop());

        System.out.println(cd.nastepnyUtwor());
        System.out.println(cd.pauza());
        System.out.println(cd.odtwarzaj());
        System.out.println(cd.poprzedniUtwor());
        System.out.println(cd.stop());
    }
}
