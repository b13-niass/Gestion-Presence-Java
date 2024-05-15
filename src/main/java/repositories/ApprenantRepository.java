package repositories;

import model.Apprenant;

import java.util.List;

public interface ApprenantRepository {
    int create(Apprenant apprenant);

    List<Apprenant> findAll();

    int update(Apprenant apprenant);

    int delete(Apprenant apprenant);
}
