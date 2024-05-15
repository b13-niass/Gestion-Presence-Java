package services;

import repositories.ApprenantRepository;

public class ApprenantService {
    // principe d'injection de dépendance
    // par
    // couplage faible, Open/close principal
    private ApprenantRepository apprenantRepository;

    // injection de dependence par constructeur
    public ApprenantService(ApprenantRepository apprenantRepository) {
        this.apprenantRepository = apprenantRepository;
    }
    // fabrique pattern pour ripository et services
}
