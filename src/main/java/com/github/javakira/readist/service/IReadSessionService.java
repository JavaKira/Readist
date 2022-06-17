package com.github.javakira.readist.service;

import com.github.javakira.readist.entity.ReadSession;

import java.util.List;

public interface IReadSessionService {
    ReadSession get(long id);

    List<ReadSession> getAll();

    void save(ReadSession readSession);
}
