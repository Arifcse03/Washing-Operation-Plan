package mnj.mfg.model.lov.views;

import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Oct 31 14:58:15 BDT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class WashLovVOImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public WashLovVOImpl() {
    }

    /**
     * Returns the bind variable value for P_STYLE.
     * @return bind variable value for P_STYLE
     */
    public String getP_STYLE() {
        return (String)getNamedWhereClauseParam("P_STYLE");
    }

    /**
     * Sets <code>value</code> for bind variable P_STYLE.
     * @param value value to bind as P_STYLE
     */
    public void setP_STYLE(String value) {
        setNamedWhereClauseParam("P_STYLE", value);
    }

    /**
     * Returns the bind variable value for P_Season.
     * @return bind variable value for P_Season
     */
    public String getP_Season() {
        return (String)getNamedWhereClauseParam("P_Season");
    }

    /**
     * Sets <code>value</code> for bind variable P_Season.
     * @param value value to bind as P_Season
     */
    public void setP_Season(String value) {
        setNamedWhereClauseParam("P_Season", value);
    }

    /**
     * Returns the bind variable value for P_Buyer_Id.
     * @return bind variable value for P_Buyer_Id
     */
    public String getP_Buyer_Id() {
        return (String)getNamedWhereClauseParam("P_Buyer_Id");
    }

    /**
     * Sets <code>value</code> for bind variable P_Buyer_Id.
     * @param value value to bind as P_Buyer_Id
     */
    public void setP_Buyer_Id(String value) {
        setNamedWhereClauseParam("P_Buyer_Id", value);
    }
}
