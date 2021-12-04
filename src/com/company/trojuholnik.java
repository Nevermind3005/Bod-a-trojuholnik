package com.company;

public class trojuholnik {

    private Bod v1;
    private Bod v2;
    private Bod v3;

    public trojuholnik(int x1, int y1, int x2, int y2, int x3, int y3) {
        v1 = new Bod(x1, y1);
        v2 = new Bod(x2, y2);
        v3 = new Bod(x3, y3);
    }

    public trojuholnik(Bod v1, Bod v2, Bod v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString() {
        return "Trojuholnik: " + v1.toString() + ", " + v2.toString() + ", " + v3.toString();
    }

    public double obvod() {
        return v1.vzdialenost(v2) + v2.vzdialenost(v3) + v3.vzdialenost(v1);
    }

    public String typ() {
        if (v1.vzdialenost(v2) == v2.vzdialenost(v3) && v2.vzdialenost(v3) == v3.vzdialenost(v1)) {
            return "rovnostranny";
        } else if (v2.vzdialenost(v3) == v3.vzdialenost(v1)) {
            return "rovnoramenny";
        }
        return "vseobecny";
    }

}
