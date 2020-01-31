package Chapter3;

class Gear3 {
    int chainRing, cog;

    Gear3(int chainRing, int cog) {
        this.chainRing = chainRing;
        this.cog = cog;
    }

    int ratio() {
        return chainRing/cog;
    }

    int gear_inches(int diameter) {
        return ratio() * diameter;
    }
}

class Wheel3 {
    int rim, tire;
    Gear3 gear3;

    Wheel3(int rim, int tire, int chainRing, int cog) {
        this.rim = rim;
        this.tire = tire;
        this.gear3 = new Gear3(chainRing, cog);
    }

    int diameter() {
        return rim + (tire * 2);
    }

    int gear_inches() {
        return gear3.gear_inches(diameter());
    }
}

