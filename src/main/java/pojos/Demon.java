package pojos;

import static systems.utility.Helpers.simplePrint;

import java.util.List;
import java.util.Map;

import interfaces.Fusable;
import interfaces.Printable;

public class Demon implements Fusable, Printable {

    /**
     * The name of the demon.
     */
    private String name;
    /**
     * The race the demon belongs to.
     */
    private String race;
    /**
     * The level the demon upon summoning.
     */
    private Integer level;
    /**
     * The hit points of the demon. Sometimes used to cast certain types of
     * {@link Skill}.
     */
    private Integer hitPoints;
    /**
     * The resource used by a demon to cast certain types of {@link Skill}.
     */
    private Integer magicPoints;
    private Integer strength;
    private Integer magic;
    private Integer vitality;
    private Integer agility;
    private Integer luck;
    /**
     * A {@link List} of {@link String} containing the types of {@link Skill}
     * the demon will reflect back towards a user if targeted with.
     */
    private List<String> reflects;
    /**
     * A {@link List} of {@link String} containing the types of {@link Skill}
     * the demon will absorb if targeted with.
     */
    private List<String> absorbs;
    /**
     * A {@link List} of {@link String} containing the types of {@link Skill}
     * the demon will nullify if targeted with.
     */
    private List<String> voids;
    /**
     * A {@link List} of {@link String} containing the types of {@link Skill}
     * the demon take reduced effects from if targeted with.
     */
    private List<String> resists;
    /**
     * A {@link List} of {@link String} containing the types of {@link Skill}
     * the demon is susceptible to if targeted with.
     */
    private List<String> weak;
    /**
     * A {@link List} of {@link Skill} representing every ability the demon
     * will learn as it levels up.
     */
    private List<Skill> skills;
    /**
     * Denotes whether a demon is capable of evolving when reaching a certain
     * level.
     */
    boolean canEvolve;

    /**
     * The name of the demon the current will evolve into given a high enough
     * level.
     */
    private String evolutionForm;

    private Map<String, String> compatibleClans;

    @Override
    public void print(){
        System.out.println();
        StringBuilder sb = new StringBuilder();
        sb.append("Race: " + name + "   ");
        sb.append("Level: " + level + "  ");
        simplePrint(sb.toString());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(Integer hitPoints) {
        this.hitPoints = hitPoints;
    }

    public Integer getMagicPoints() {
        return magicPoints;
    }

    public void setMagicPoints(Integer magicPoints) {
        this.magicPoints = magicPoints;
    }

    public Integer getStrength() {
        return strength;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    public Integer getMagic() {
        return magic;
    }

    public void setMagic(Integer magic) {
        this.magic = magic;
    }

    public Integer getVitality() {
        return vitality;
    }

    public void setVitality(Integer vitality) {
        this.vitality = vitality;
    }

    public Integer getAgility() {
        return agility;
    }

    public void setAgility(Integer agility) {
        this.agility = agility;
    }

    public Integer getLuck() {
        return luck;
    }

    public void setLuck(Integer luck) {
        this.luck = luck;
    }

    public List<String> getReflects() {
        return reflects;
    }

    public void setReflects(List<String> reflects) {
        this.reflects = reflects;
    }

    public List<String> getAbsorbs() {
        return absorbs;
    }

    public void setAbsorbs(List<String> absorbs) {
        this.absorbs = absorbs;
    }

    public List<String> getVoids() {
        return voids;
    }

    public void setVoids(List<String> voids) {
        this.voids = voids;
    }

    public List<String> getResists() {
        return resists;
    }

    public void setResists(List<String> resists) {
        this.resists = resists;
    }

    public List<String> getWeak() {
        return weak;
    }

    public void setWeak(List<String> weak) {
        this.weak = weak;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    public boolean isCanEvolve() {
        return canEvolve;
    }

    public void setCanEvolve(boolean canEvolve) {
        this.canEvolve = canEvolve;
    }

    public String getEvolutionForm() {
        return evolutionForm;
    }

    public void setEvolutionForm(String evolutionForm) {
        this.evolutionForm = evolutionForm;
    }

    public Map<String, String> getCompatibleClans() {
        return compatibleClans;
    }

    public void setCompatibleClans(Map<String, String> compatibleClans) {
        this.compatibleClans = compatibleClans;
    }

    @Override
    public Boolean canBeFused(Demon aDemon) {
        return compatibleClans.containsKey(aDemon.getRace());
    }

    @Override
    public Demon fuseWith(Demon aDemon) {
        //TODO
        return null;
    }
}
