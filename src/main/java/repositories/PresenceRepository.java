package repositories;

import model.Presence;

import java.util.List;

public interface PresenceRepository {
    int create(Presence presence);

    List<Presence> findAll();

    int update(Presence presence);

    int delete(Presence presence);
}
