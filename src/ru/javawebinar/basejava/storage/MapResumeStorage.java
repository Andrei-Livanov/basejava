package ru.javawebinar.basejava.storage;

import ru.javawebinar.basejava.model.Resume;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapResumeStorage extends AbstractStorage<Resume> {
    private Map<String, Resume> map = new HashMap<>();

    @Override
    protected void doUpdate(Resume resume, Resume key) {
        map.replace(key.getUuid(), resume);
    }

    @Override
    protected boolean isExist(Resume key) {
        return key != null;
    }

    @Override
    protected void doSave(Resume resume, Resume key) {
        map.put(resume.getUuid(), resume);
    }

    @Override
    protected void doDelete(Resume key) {
        map.remove(key.getUuid());
    }

    @Override
    protected Resume doGet(Resume key) {
        return key;
    }

    @Override
    protected Resume getSearchKey(String uuid) {
        return map.get(uuid);
    }

    @Override
    protected List<Resume> getCopyStorageAsList() {
        return new ArrayList<>(map.values());
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public int size() {
        return map.size();
    }
}