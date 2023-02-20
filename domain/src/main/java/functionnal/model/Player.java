package functionnal.model;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private final Integer id;
    private final String name;
    private  Integer chip = 4;
    private Integer winCounter = 0;
    private List<Hero> deck;


    public Player(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.deck = new ArrayList<Hero>();
    }

    public void increaseWinCounter(){
        this.winCounter++;
    }

    public void addHero(Hero newHero){
        this.deck.add(newHero);
    }

    public void askFight(){

    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Hero> getDeck() {
        return deck;
    }


}
