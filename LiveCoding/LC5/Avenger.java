package LC5;

public class Avenger {
    String nama;
    String kode;
    int combat;
    int tactical;
    int fieldSim;

    Avenger(String nama, String kode, int combat, int tactical, int fieldSim) {
        this.nama = nama;
        this.kode = kode;
        this.combat = combat;
        this.tactical = tactical;
        this.fieldSim = fieldSim;
    }

    double hitungPowerRating() {
        return (0.2 * combat) + (0.35 * tactical) + (0.45 * fieldSim);
    }

    String getRank() {
        double pr = hitungPowerRating();
        if (pr >= 90)
            return "S-Tier Avenger";
        else if (pr >= 75)
            return "Elite Avenger";
        else if (pr >= 60)
            return "Senior Avenger";
        else if (pr >= 40)
            return "Junior Avenger";
        else
            return "Trainee";
    }
}