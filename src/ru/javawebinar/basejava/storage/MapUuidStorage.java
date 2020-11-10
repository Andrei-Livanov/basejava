package ru.javawebinar.basejava.storage;

import ru.javawebinar.basejava.model.Resume;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapUuidStorage extends AbstractStorage {
    private Map<String, Resume> map = new HashMap<>();

    @Override
    protected void doUpdate(Resume resume, Object uuid) {
        map.replace((String) uuid, resume);
    }

    @Override
    protected boolean isExist(Object uuid) {
        return map.containsKey(uuid.toString());
    }

    @Override
    protected void doSave(Resume resume, Object uuid) {
        map.put((String) uuid, resume);
    }

    @Override
    protected void doDelete(Object uuid) {
        map.remove(uuid.toString());
    }

    @Override
    protected Resume doGet(Object uuid) {
        return map.get(uuid.toString());
    }

    @Override
    protected String getSearchKey(String uuid) {
        return uuid;
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public List<Resume> getCopyStorageAsList() {
        return new ArrayList<>(map.values());
    }

    @Override
    public int size() {
        return map.size();
    }
}
