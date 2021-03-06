package mnj.ont.model.services.common;

import oracle.jbo.ApplicationModule;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Aug 10 18:19:45 PKT 2015
// ---------------------------------------------------------------------
public interface AppModule extends ApplicationModule {
    void findSelLines();

    void populateOrderLines(String saleOrderID);

    void setPopUpWhereClauseOperations();

    void populateOperations();

    void populateBundlesStn();

    int VersionCreation();

    String createJob(int HeaderId);

    void setSessionValues(String orgId, String userId, String respId,
                          String respAppl);

    String createMaterial(int HeaderId);

    String callCreateRouting(int inventoryID, int HeaderId);

    String CreateRequisition();

    String callBOM(int inventoryID, int HeaderID);

    void Populate();

    void checkduplication(String HeaderId, String BuyerId, String Style,
                          String Season, String Wash, String Color);

    void Delete_Header();

    void DeleteStyleDetail();

    String CallPost(int HeaderId);

    String CallCompletion(int HeaderId);

    String CreateMaterial(String inventoryID, String HeaderID);
}
