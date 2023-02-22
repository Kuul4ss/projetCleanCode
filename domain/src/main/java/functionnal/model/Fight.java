package functionnal.model;

public class Fight {

    private Integer id;
    private Boolean isWinner;
    private Hero opponent;


    public Fight(Boolean isWinner, Hero opponent) {
        this.isWinner = isWinner;
        this.opponent = opponent;
    }


}
