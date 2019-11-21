public class Adventure {
    Durance durance;

    public Adventure(Durance durance) {
        this.durance = durance;
    }

    public Durance getDurance() {
        return durance;
    }

    public void setRandomisation(int seed){
        durance.setRand(seed);
    }
}
