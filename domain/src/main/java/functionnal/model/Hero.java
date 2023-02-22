package functionnal.model;

import java.util.Objects;

public class Hero {


    private String name;
    private Double healthPoint;
    private Integer experiencePoint = 0;
    private Double power;
    private Double armor;
    private HeroRarity rarity;
    private Integer level = 1;

    public Hero(String name, HeroRarity rarity) {
        this.name = name;
        this.rarity = rarity;
    }

    public void takeDamage(Integer enemyPower){
        this.healthPoint -= enemyPower - this.armor;
    }

    public void gainExperience(Integer bonusExperience){
        this.experiencePoint+=bonusExperience;
    }

    public Boolean isMaxExperience(){
        return this.experiencePoint==5;
    }

    public void levelUp(){
        this.level++;
        this.experiencePoint=0;
        this.healthPoint*=1.1;
        this.armor*=1.1;
        this.power*=1.1;
    }

    public Boolean hasSameLevel(Integer enemyLevel){
        return Objects.equals(this.level, enemyLevel);
    }

    public String getName() {
        return name;
    }

    public Double getHealthPoint() {
        return healthPoint;
    }

    public Integer getExperiencePoint() {
        return experiencePoint;
    }

    public Double getPower() {
        return power;
    }

    public Double getArmor() {
        return armor;
    }

    public HeroRarity getRarity() {
        return rarity;
    }

    public Integer getLevel() {
        return level;
    }
}
