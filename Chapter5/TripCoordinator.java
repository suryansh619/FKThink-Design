package Chapter5;

class TripCoordinator implements PrepareInterface{
    void buyFood(int[] customers){

    }
    public void prepareTrip(Trip trip){
        buyFood(trip.cutomers);
    }

}
