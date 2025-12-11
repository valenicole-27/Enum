public class Main {
    public static void main(String[] args) {

        Forma triangolo = new Triangolo();
        System.out.println(triangolo.getTipoForma() + ": " + triangolo.calcolaArea());

        Forma rettangolo = new Rettangolo();
        System.out.println(rettangolo.getTipoForma() + ": " + rettangolo.calcolaArea());
    }
}