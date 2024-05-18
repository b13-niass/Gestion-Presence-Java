package factory;

import repositories.impl.*;

public class RepositoryFactory {
    private DaoImpl dao;
    private ApprenantRepositoryImpl apprenantRepository;
    private PresenceRepositoryImpl presenceRepository;
    private ReferentielRepositoryImpl referentielRepository;
    private PromotionRepositoryImpl promotionRepository;
    private UserRepositoryImpl userRepository;

    public Object getInstance(String interfaceName) {
        Object obj = null;
        switch (interfaceName) {
            case "Dao": obj = this.getDaoInstance();
            case "ApprenantRepository": obj = this.getAppRepInstance();
            case "PresenceRepository": obj = this.getPreRepInstance();
            case "ReferentielRepository": obj = this.getRefRepInstance();
            case "PromotionRepository": obj = this.getPromoRepInstance();
            case "UserRepository": obj = this.getUserRepInstance();
            default: obj = null;
        }
        return obj;
    }

    public DaoImpl getDaoInstance() {
        if (this.dao != null) {
            this.dao = new DaoImpl("root", "", "gesapprenant", "127.0.0.1");
        }
        return this.dao;
    }

    public ApprenantRepositoryImpl getAppRepInstance() {
        if (this.apprenantRepository != null) {
            this.apprenantRepository = new ApprenantRepositoryImpl(this.dao);
        }
        return this.apprenantRepository;
    }

    public PresenceRepositoryImpl getPreRepInstance() {
        if (this.presenceRepository != null) {
            this.presenceRepository = new PresenceRepositoryImpl(this.dao);
        }
        return this.presenceRepository;
    }

    public ReferentielRepositoryImpl getRefRepInstance() {
        if (this.referentielRepository != null) {
            this.referentielRepository = new ReferentielRepositoryImpl(this.dao);
        }
        return this.referentielRepository;
    }

    public PromotionRepositoryImpl getPromoRepInstance() {
        if (this.promotionRepository != null) {
            this.promotionRepository = new PromotionRepositoryImpl(this.dao);
        }
        return this.promotionRepository;
    }

    public UserRepositoryImpl getUserRepInstance() {
        if (this.userRepository != null) {
            this.userRepository = new UserRepositoryImpl(this.dao);
        }
        return this.userRepository;
    }
}
