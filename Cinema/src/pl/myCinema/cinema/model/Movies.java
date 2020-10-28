package pl.myCinema.cinema.model;

public class Movies {
    private String Comedies;

    public Movies(String comedies) {
        this.Comedies = comedies;
    }

    @Override
    public String toString() {
        return "Movies { " +
                "Comedies = '" + Comedies + '\'' +
                " }";
    }
}
