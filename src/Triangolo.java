public class Triangolo implements Forma {

    private int base = 6;
    private int altezza = 9;

    @Override
    public int calcolaArea() {
        return (base * altezza) / 2;
    }

    @Override
    public TipoForma getTipoForma() {
        return TipoForma.TRIANGOLO;
    }
}