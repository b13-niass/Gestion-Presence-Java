package repositories;

import model.Referentiel;

import java.util.List;

public interface ReferentielRepository {
    int create(Referentiel referentiel);

    List<Referentiel> findAll();

    int update(Referentiel referentiel);

    int delete(Referentiel referentiel);
}
