package repositories.impl;

import model.Referentiel;
import repositories.ReferentielRepository;

import java.util.List;

public class ReferentielRepositoryImpl implements ReferentielRepository {

    public ReferentielRepositoryImpl(DaoImpl dao) {

    }

    @Override
    public int create(Referentiel referentiel) {
        return 0;
    }

    @Override
    public List<Referentiel> findAll() {
        return List.of();
    }

    @Override
    public int update(Referentiel referentiel) {
        return 0;
    }

    @Override
    public int delete(Referentiel referentiel) {
        return 0;
    }
}
