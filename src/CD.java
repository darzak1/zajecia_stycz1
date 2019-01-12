public class CD extends MusicPlayer{

    @Override
    public String odtwarzaj() {
        return "CD Odtwarzam";
    }

    @Override
    public String pauza() {
        return "CD pauzuję";
    }

    @Override
    public String stop() {
        return "CD zatrzymanie";
    }

    @Override
    public String nastepnyUtwor() {
        return "CD gram następny utwór";
    }

    @Override
    public String poprzedniUtwor() {
        return "CD Odtwórz poprzedni utwór";
    }

}
