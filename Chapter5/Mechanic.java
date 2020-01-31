package Chapter5;

class Mechanic implements PrepareInterface{

    Bicycle [] prepareBicycles(Bicycle[] bicycles){
        return bicycles;
    }
    public void prepareTrip(Trip trip){
        prepareBicycles(trip.bicycles);
    }
    Bicycle prepareBicycle(){

        return new Bicycle();

    }
}

class Bicycle{

}