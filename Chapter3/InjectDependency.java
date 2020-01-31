package Chapter3;

class Gear2 {
    int chainRing, cog;
    Wheel2 wheel2;

    Gear2(int chainRing, int cog, Wheel2 wheel2) {
        this.chainRing = chainRing;
        this.cog = cog;
        this.wheel2 = wheel2;
    }

    int ratio() {
        return chainRing/cog;
    }

    int gear_inches() {
        return ratio() * wheel2.diameter();
    }
}

class Wheel2 {
    int rim, tire;

    Wheel2(int rim, int tire) {
        this.rim = rim;
        this.tire = tire;
    }

    int diameter() {
        return rim + (tire * 2);
    }
}
