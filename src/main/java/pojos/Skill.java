package pojos;

import interfaces.Printable;

public class Skill implements Printable {

    private String name;
    private String effect;
    private Integer cost;
    private String resourceType;
    private Boolean percentageBased;
    private Boolean conversationBased;

    @Override
    public void print() {
        //TODO
    }
}
