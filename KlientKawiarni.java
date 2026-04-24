public class KlientKawiarni {
    private int idKlienta;
    private String imie;
    private String nazwisko;
    private String email;

    public KlientKawiarni(int idKlienta, String imie, String nazwisko, String email) {
        this.idKlienta = idKlienta;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
    }

    @Override
    public String toString() {
        return imie + " " + nazwisko + " (" + email + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof KlientKawiarni)) return false;

        KlientKawiarni other = (KlientKawiarni) obj;
        return this.email.equals(other.email);
    }
}