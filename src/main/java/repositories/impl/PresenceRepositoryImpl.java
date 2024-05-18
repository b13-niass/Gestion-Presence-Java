package repositories.impl;

import model.Presence;
import repositories.PresenceRepository;

import java.util.List;

public class PresenceRepositoryImpl implements PresenceRepository {

    public PresenceRepositoryImpl(DaoImpl dao) {

    }

    @Override
    public int create(Presence presence) {
        return 0;
    }

    @Override
    public List<Presence> findAll() {
        return List.of();
    }

    @Override
    public int update(Presence presence) {
        return 0;
    }

    @Override
    public int delete(Presence presence) {
        return 0;
    }
}
