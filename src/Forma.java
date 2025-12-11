public interface Forma {

    enum TipoForma {
        RETTANGOLO,
        TRIANGOLO
    }

    TipoForma getTipoForma();
    int calcolaArea();
}