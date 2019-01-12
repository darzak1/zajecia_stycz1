abstract class MusicPlayer implements Player {

    @Override
    public String nastepnyUtwor() {
        return "gram następny utwór";
    }

    @Override
    public String pauza() {
        return "pauzuję";
    }

    @Override
    public String stop() {
        return "zatrzymanie";
    }

    @Override
    public String odtwarzaj() {
        return "Odtwarzam";
    }

    @Override
    public String poprzedniUtwor() {
        return "Odtwórz poprzedni utwór";
    }
}
