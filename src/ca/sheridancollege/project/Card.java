/**
 *SYST 17796 Project Deliverable 2
 * Game: War
 * Authors: Natalie Hynes
 */
package ca.sheridancollege.project;

public abstract class Card {
    //default modifier for child classes

    /**
     * Students should implement this method for their specific children classes
     *
     * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
     */
    @Override
    public abstract String toString();
}
