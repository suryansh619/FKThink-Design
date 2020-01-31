package Chapter5;

class Trip{
    Bicycle[]  bicycles;
    int [] cutomers;
    int vehicle;
    void prepare(PrepareInterface preparers){
        preparers.prepareTrip(this);
    }

}