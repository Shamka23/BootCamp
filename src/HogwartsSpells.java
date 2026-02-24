import jdk.jfr.EventType;

import java.util.*;

public class HogwartsSpells {
    private final Map<Integer, SpellEvent> spellById = new HashMap<>();
    private final Map<String, List<SpellEvent>> spellsByType = new HashMap<>();

    public static void main(String[] args) {

    }

    public void addSpellEvent(String eventType, String actionDescription) {
        SpellEvent spell = new SpellEvent(eventType, actionDescription);

        spellById.put(spell.getId(), spell);
        spellsByType
                .computeIfAbsent(eventType, k -> new ArrayList<>())
                .add(spell);
    }

    public SpellEvent getSpellEventById(int id) {
        return spellById.get(id);
    }

    public List<SpellEvent> getSpellEventByType(String eventType) {
        return spellsByType.getOrDefault(eventType, new ArrayList<>());
    }

    public void deleteSpellEvent(int id) {
        SpellEvent spellEvent = spellById.remove(id);
        if (spellEvent != null){
            List<SpellEvent> events = spellsByType.get(spellEvent.getEventType());
            if (events != null){
                events.remove(spellEvent);
            }
        }
    }

    public void printAllSpellEvents() {
        for (Map.Entry<Integer, SpellEvent> entry: spellById.entrySet()){
            System.out.println(entry.getValue().getId() +
                    " " + entry.getValue().getAction() +
                    " " + entry.getValue().getEventType());
        }
    }
}
