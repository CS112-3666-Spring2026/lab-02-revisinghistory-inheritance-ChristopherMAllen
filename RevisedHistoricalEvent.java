/**
 * RevisedHistoricalEvent.java - Adds on to HistorivalEvent to add extra data to 
 * correct "historical" information.
 */
public class RevisedHistoricalEvent extends HistoricalEvent{
    /********** CONSTANTS ************/
    public static final String DEFAULT_REVISED_DESCRIPTION = "Revised Historical event description default.";
    public static final String DEFAULT_CITATION = "Academic resource/citation";

    /********** INSTANCE VARIABLES ************/
    private String revisedDescription;
    private String citation;

    /********** CONSTRUCTORS ************/
    /**
     * Full constructor sets object to parametere values if valid, otherwise
     * outputs error message and exits program.
     * 
     * @param description original "histrorical" description
     * @param eventDay Date of historical event
     * @param revisedDescription revised history description
     * @param citation formal citation or link to resource
     */
    public RevisedHistoricalEvent(String description, Date eventDay, String revisedDescription, String citation) {
        super(description, eventDay);
        this.setRevisedDescription(revisedDescription);
        this.setCitation(citation);
    }

    /**
     * Default constructor sets RevisedHistoricalEvent object to default values
     */
    public RevisedHistoricalEvent() {
        this(HistoricalEvent.DEFAULT_DESCRIPTION, HistoricalEvent.DEFAULT_EVENT_DAY, DEFAULT_REVISED_DESCRIPTION,
                DEFAULT_CITATION);
    }
    /********** SETTERS / MUTATORS ************/
    /**
     * Sets revised description description instance variable (no error checking)
     * 
     * @param revisedDescription revised history description
     */
    public void setRevisedDescription(String revisedDescription) {
        this.revisedDescription = revisedDescription;
    }

    /**
     * Sets citation instance variable (no error checking)
     * @param citation formal citation or link to resource
     */
    public void setCitation(String citation) {
        this.citation = citation;
    }
    /**
     * Sets all instance variables if parameters valid
     * 
     * @param description original "historical" description
     * @param eventDay Date of historical event
     * @param revisedDescription revised history description
     * @param citation formal citation or link to resource
     * 
     * @return true if description and eventDay are valid, false otherwise
     */
    public boolean setAll(String description, Date eventDay, String revisedDescription, String citation) {
        if (super.setAll(description, eventDay)) {
            this.setRevisedDescription(revisedDescription);
            this.setCitation(citation);
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * Copy constructor creates a deep copy of original RevisedHistoricalEvent object,
     * if object null outputs error message and exits program.
     * 
     * @param original valid RevisedHistoricalEvent object to deep copy
     */
    public RevisedHistoricalEvent(RevisedHistoricalEvent original) {
        if (original != null) {
            this.setAll(original.getDescription(), original.getEventDay(), original.revisedDescription,
                    original.citation);
        } else {
            System.out.println("ERROR: null data given to copy constructor");
            System.exit(0);
        }
    }

    /********** GETTERS / ACCESSORS ************/
    /**
     * Access value of revisedDescription instance variable
     * 
     * @return revised description of historical event
     */
    public String getRevisedDescription() {
        return this.revisedDescription;
    }

    /**
     * Access value of citation instance variable
     * 
     * @return citation value (resource link, etc.)
     */
    public String getCitation() {
        return this.citation;
    }

    /********** OTHER REQUIRED METHODS ************/
    @Override
    public String toString() {
        return super.toString() + "\nRevised Historical Event: "
                + this.revisedDescription + "\n\nSource" + this.citation;
    }
    @Override
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        } else if (this.getClass() != other.getClass()) {
            return false;
        } else {
            RevisedHistoricalEvent otherEvent = (RevisedHistoricalEvent) other;
            return super.equals(other) &&
                    this.revisedDescription.equals(otherEvent.revisedDescription) &&
                    this.citation.equals(otherEvent.citation);
        }
    }
    /**
     * Output to console structured to educate people about historical events, showing the
     * past version many have been educated with vs. the revised history
     */
    public void teach() {
        System.out.println(this.toString());
    }
}
