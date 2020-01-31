package Chapter5;

class Driver implements PrepareInterface{
    public void prepareTrip(Trip trip){
        gasUp(trip.vehicle);
        fillWaterTank(trip.vehicle);
    }
    void gasUp(int vehicle){
        //
    }
    void fillWaterTank(int vehicle){
        //
    }

}
