package factory;

import repositories.ApprenantRepository;
import repositories.impl.*;
import services.Impl.*;

public class ServiceFactory {
    private DaoImpl dao;
    private ApprenantServiceImpl apprenantService;
    private PresenceServiceImpl presenceService;
    private ReferentielServiceImpl referentielService;
    private PromotionServiceImpl promotionService;
    private UserServiceImpl userService;
    private RepositoryFactory repositoryFactory = new RepositoryFactory();

    public Object getInstance(String interfaceName) {
        Object obj = null;
        switch (interfaceName) {
            case "ApprenantService": obj = this.getAppServInstance();
            case "PresenceService": obj = this.getPreServInstance();
            case "ReferentielService": obj = this.getRefServInstance();
            case "PromotionService": obj = this.getPromoServInstance();
            case "UserService": obj = this.getUserServInstance();
            default: obj = null;
        }
        return obj;
    }

    public ApprenantServiceImpl getAppServInstance() {
        if (this.apprenantService != null) {
            this.apprenantService = new ApprenantServiceImpl((ApprenantRepository) repositoryFactory.getInstance("ApprenantRepository"));
        }
        return this.apprenantService;
    }

    public PresenceServiceImpl getPreServInstance() {
        if (this.presenceService != null) {
            this.presenceService = new PresenceServiceImpl();
        }
        return this.presenceService;
    }

    public ReferentielServiceImpl getRefServInstance() {
        if (this.referentielService != null) {
            this.referentielService = new ReferentielServiceImpl();
        }
        return this.referentielService;
    }

    public PromotionServiceImpl getPromoServInstance() {
        if (this.promotionService != null) {
            this.promotionService = new PromotionServiceImpl();
        }
        return this.promotionService;
    }

    public UserServiceImpl getUserServInstance() {
        if (this.userService != null) {
            this.userService = new UserServiceImpl();
        }
        return this.userService;
    }
}
