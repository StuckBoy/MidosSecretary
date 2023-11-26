package pojos;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
     * Denotes whether a demon is capable of evolving when reaching a certain
     * level.
     */
    boolean canEvolve;
    /**
     * The name of the demon the current will evolve into given a high enough
     * level.
     */
    private String evolutionForm;
    /**
     * A {@link Map} where the key represents a race/clan that this
     * {@link Demon} is compatible with for fusions, and the value is the
     * resulting race/clan that is produced when fused witht the key.
     */
    private Map<String, String> compatibleClans;
    /**
     * A {@link LinkedHashMap} where each key (level) is mapped to a
     * {@link Set} of {@link Skill} for every level of the current
     * {@link Demon}. Skills that are innate are mapped to 0.
     *
     * TODO Determine whether Gson can handle a LinkedHashMap and what that
     * looks like when converted from Java -> JSON.
     */
    private LinkedHashMap<String, Set<String>> learnset;

    @Override
    public void print(){
        System.out.println();
        //TODO Flesh out printing of Demon info
        //TODO Use helpers for sub-sections of info (Affinities, Stats, etc.)
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

    public LinkedHashMap<String, Set<String>> getLearnset() {
        return learnset;
    }

    public void setLearnset(LinkedHashMap<String, Set<String>> learnset) {
        this.learnset = learnset;
    }

    public LinkedHashMap<Integer, Set<Skill>> getDetailedLearnset() {
        //Implement String -> Skill lookup and rebuild learnset mapping.
        return null;
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
