package model;

import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Dec 03 10:56:46 CET 2012
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class MytableViewImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public MytableViewImpl() {
    }

    protected void executeQueryForCollection(Object object, Object[] object2, int i) {
        System.err.println("MytableViewImpl::executeQueryForCollection:" + getQuery());
        getApplicationModule().getTransaction().commit();
        super.executeQueryForCollection(object, object2, i);
    }
}
