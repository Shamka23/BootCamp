import jdk.jfr.EventType;

import java.util.Objects;

public class SpellEvent {
    private static int count = 1;

    private int id;
    private String eventType;
    private String action;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SpellEvent event = (SpellEvent) o;
        return id == event.id && Objects.equals(eventType, event.eventType) && Objects.equals(action, event.action);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, eventType, action);
    }

    public SpellEvent(String eventType, String action) {
        this.id = ++count;
        this.eventType = eventType;
        this.action = action;
    }

    public int getId() {
        return id;
    }

    public String getEventType() {
        return eventType;
    }

    public String getAction() {
        return action;
    }
}
