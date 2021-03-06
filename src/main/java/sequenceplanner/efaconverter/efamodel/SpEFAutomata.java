package sequenceplanner.efaconverter.efamodel;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author kbe
 */
public class SpEFAutomata {

    private Map<String, SpEFA> automatons;
    private Map<String, SpEvent> alphabet;
    private Map<String, SpVariable> variables;

    public SpEFAutomata() {
        this.automatons = new HashMap<String, SpEFA>();
        this.alphabet = new HashMap<String, SpEvent>();
        this.variables = new HashMap<String, SpVariable>();
    }

    public Collection<SpEvent> getAlphabet() {
        return alphabet.values();
    }

    public void addEvent(SpEvent event) {
        this.alphabet.put(event.getName(), event);
    }

    public Collection<SpEFA> getAutomatons() {
        return automatons.values();
    }

    public void addAutomaton(SpEFA automaton) {
       this.automatons.put(automaton.getName(), automaton);
       for (SpEvent e : automaton.getAlphabet()){
           this.alphabet.put(e.getName(), e);
       }
    }

    public Collection<SpVariable> getVariables() {
        return variables.values();
    }

    public void addVariable(SpVariable variables) {
        this.variables.put(variables.getName(), variables);
    }





}
