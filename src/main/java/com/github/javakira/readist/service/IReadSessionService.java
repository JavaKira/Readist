package com.github.javakira.readist.service;

import com.github.javakira.readist.entity.ReadSession;

public interface IReadSessionService {
    ReadSession get(long id);

    void save(ReadSession readSession);
}
