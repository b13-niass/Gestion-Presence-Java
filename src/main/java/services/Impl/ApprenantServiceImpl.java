package services.Impl;

import repositories.ApprenantRepository;

public class ApprenantServiceImpl {
    // principe d'injection de dépendance
    // par
    // couplage faible, Open/close principal
    private ApprenantRepository apprenantRepository;

    // injection de dependence par constructeur
    public ApprenantServiceImpl(ApprenantRepository apprenantRepository) {
        this.apprenantRepository = apprenantRepository;
    }
    // fabrique pattern pour ripository et services
}
