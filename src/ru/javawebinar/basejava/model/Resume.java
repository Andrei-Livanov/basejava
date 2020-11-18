package ru.javawebinar.basejava.model;

import java.util.EnumMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/**
 * ru.javawebinar.basejava.model.Resume class
 */
public class Resume implements Comparable<Resume> {

    // Unique identifier
    private final String uuid;
    private final String fullName;

    private final Map<ContactType, String> contacts = new EnumMap<>(ContactType.class);
    private final Map<SectionType, Section> sections = new EnumMap<>(SectionType.class);

    public Resume(String fullName) {
        this(UUID.randomUUID().toString(), fullName);
    }

    public Resume(String uuid, String fullName) {
        Objects.requireNonNull(uuid, "Parameter uuid must not be null!");
        Objects.requireNonNull(fullName, "Parameter fullName must not be null!");
        this.uuid = uuid;
        this.fullName = fullName;
    }

    public String getUuid() {
        return uuid;
    }

    public String getContacts(ContactType type) {
        return contacts.get(type);
    }

    public Section getSection(SectionType type) {
        return sections.get(type);
    }

    public void addContact(ContactType type, String value) {
        contacts.put(type, value);
    }

    public void addSection(SectionType type, Section section) {
        sections.put(type, section);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Resume resume = (Resume) o;
        return uuid.equals(resume.uuid) &&
                fullName.equals(resume.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid, fullName);
    }

/*    @Override
    public String toString() {
        return uuid + " " + '(' + fullName + ')';
    }*/

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(fullName).append("\n\n");

        for (Map.Entry<ContactType, String> entry : contacts.entrySet()) {
            stringBuilder.append(entry.getKey().getTitle()).append(" ");
            stringBuilder.append(entry.getValue()).append("\n");
        }

        stringBuilder.append("\n");

        for (Map.Entry<SectionType, Section> entry : sections.entrySet()) {
            stringBuilder.append(entry.getKey().getTitle()).append("\n\n");
            stringBuilder.append(entry.getValue().toString()).append("\n\n");
        }

        return stringBuilder.toString();
    }

    @Override
    public int compareTo(Resume o) {
        final int compare = fullName.compareTo(o.fullName);
        return compare != 0 ? compare : uuid.compareTo(o.uuid);
    }
}