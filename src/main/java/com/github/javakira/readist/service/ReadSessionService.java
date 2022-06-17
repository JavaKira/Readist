package com.github.javakira.readist.service;

import com.github.javakira.readist.entity.ReadSession;
import com.github.javakira.readist.repository.ReadSessionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReadSessionService implements IReadSessionService {
    private final ReadSessionRepository repository;

    public ReadSessionService(ReadSessionRepository repository) {
        this.repository = repository;
    }

    @Override
    public ReadSession get(long id) {
        return repository.getReferenceById(id);
    }

    @Override
    public List<ReadSession> getAll() {
        return repository.findAll();
    }

    @Override
    public void save(ReadSession readSession) {
        repository.save(readSession);
    }
}
