package pojos;

import interfaces.Printable;

public class Skill implements Printable {

    /**
     * The name of the skill
     */
    private String name;
    /**
     * A description of what the move does.
     */
    private String effect;
    /**
     * The amount of a particular resource the skill requires to use. Depending
     * on the type of skill this may be HP or MP. HP-based skills typically
     * require a percentage of remaining health to cast.
     */
    private Integer cost;
    /**
     * Tracks whether a skill requires HP or MP to be used.
     */
    private String resourceType;
    /**
     * Indicates whether this skill requires a percentage of a remaining
     * resource. HP-based skills always require a fixed percentage of health,
     * but there are certain skills that require a percentage that aren't
     * purely physical attacks.
     */
    private Boolean percentageBased;
    /**
     * Indicates whether the skill is used purely for conversations, such as
     * requesting money or items and giving second chances during negotiations.
     */
    private Boolean conversationBased;
    /**
     * Indicates the chance of a critical hit occurring when using this skill.
     */
    private String criticalChance;
    /**
     * Indicates how many targets this skill may affect, assuming the specific
     * circumstances are met. Some skills may behave differently if there are
     * not enough valid targets.
     */
    private String target;
    /**
     * Indicates how strong this attack is.
     */
    private String damage;
    /**
     * Tracks whether a particular skill can cause an ailment in addition to
     * its other properties.
     */
    private Boolean causesAilment;
    /**
     * For skills that can cause an ailment, this shows just how often the
     * ailment has a chance of occurring.
     */
    private Integer ailmentChance;
    /**
     * For skills that can cause an ailment, this indicates what type of
     * ailment the skill afflicts the target with.
     */
    private String ailmentType;
    /**
     * Indicates the chance the targets of the skill have to dodge it. This
     * value may need fleshing out as not every skill explicitly lists a dodge
     * chance.
     */
    private String dodgeChance;
    /**
     * Tracks whether this skill is exclusive to specific a specific demon. If
     * a skill is exclusive, it typically cannot be passed down to other demons
     * via fusion.
     */
    private Boolean isExclusive;
    /**
     * If a skill is exclusive, this indicates which demon can learn the skill.
     */
    private String exclusiveDemon;

    @Override
    public void print() {
        //TODO
    }
}
