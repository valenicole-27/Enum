public class Rettangolo implements Forma {

    private int base = 5;
    private int altezza = 6;

    @Override
    public int calcolaArea() {
        return base * altezza;
    }

    @Override
    public TipoForma getTipoForma() {
        return TipoForma.RETTANGOLO;
    }
}