package repositories;

import model.Promotion;

import java.util.List;

public interface PromotionRepository {
    int create(Promotion promotion);

    List<Promotion> findAll();

    int update(Promotion promotion);

    int delete(Promotion promotion);
}
