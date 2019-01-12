public class Mp3 extends MusicPlayer  {
    @Override
    public String odtwarzaj() {
        return "MP3 Odtwarzam";
    }

    @Override
    public String pauza() {
        return "MP3 pauzuję";
    }

    @Override
    public String stop() {
        return "MP3 zatrzymanie";
    }

    @Override
    public String nastepnyUtwor() {
        return "MP3 gram następny utwór";
    }

    @Override
    public String poprzedniUtwor() {
        return "MP3 Odtwórz poprzedni utwór";
    }
}
