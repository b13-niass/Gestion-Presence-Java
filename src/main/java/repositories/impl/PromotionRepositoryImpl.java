package repositories.impl;

import model.Promotion;
import repositories.PromotionRepository;

import java.util.List;

public class PromotionRepositoryImpl implements PromotionRepository {
    public PromotionRepositoryImpl(DaoImpl dao) {

    }

    @Override
    public int create(Promotion promotion) {
        return 0;
    }

    @Override
    public List<Promotion> findAll() {
        return List.of();
    }

    @Override
    public int update(Promotion promotion) {
        return 0;
    }

    @Override
    public int delete(Promotion promotion) {
        return 0;
    }
}
