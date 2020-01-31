package Chapter3;

class Gear1 {
    int chainRing, cog, rim, tire;

    Gear1(int chainRing, int cog, int rim, int tire) {
        this.chainRing = chainRing;
        this.cog = cog;
        this.rim = rim;
        this.tire = tire;
    }

    int ratio() {
        return chainRing/cog;
    }

    int gear_inches() {
        return ratio() * new Wheel1(rim, tire).diameter();
    }
}

class Wheel1 {
    int rim, tire;

    Wheel1(int rim, int tire) {
        this.rim = rim;
        this.tire = tire;
    }

    int diameter() {
        return rim + (tire * 2);
    }
}