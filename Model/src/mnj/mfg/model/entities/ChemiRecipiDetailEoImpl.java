package mnj.mfg.model.entities;

import java.sql.SQLException;

import java.util.Map;

import oracle.adf.share.ADFContext;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Aug 05 18:10:49 PKT 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ChemiRecipiDetailEoImpl extends EntityImpl {
    private static EntityDefImpl mDefinitionObject;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        SNo {
            public Object get(ChemiRecipiDetailEoImpl obj) {
                return obj.getSNo();
            }

            public void put(ChemiRecipiDetailEoImpl obj, Object value) {
                obj.setSNo((Number)value);
            }
        }
        ,
        OpLineId {
            public Object get(ChemiRecipiDetailEoImpl obj) {
                return obj.getOpLineId();
            }

            public void put(ChemiRecipiDetailEoImpl obj, Object value) {
                obj.setOpLineId((Number)value);
            }
        }
        ,
        ChemicalId {
            public Object get(ChemiRecipiDetailEoImpl obj) {
                return obj.getChemicalId();
            }

            public void put(ChemiRecipiDetailEoImpl obj, Object value) {
                obj.setChemicalId((Number)value);
            }
        }
        ,
        ItemCode {
            public Object get(ChemiRecipiDetailEoImpl obj) {
                return obj.getItemCode();
            }

            public void put(ChemiRecipiDetailEoImpl obj, Object value) {
                obj.setItemCode((String)value);
            }
        }
        ,
        PerBatchQuantity {
            public Object get(ChemiRecipiDetailEoImpl obj) {
                return obj.getPerBatchQuantity();
            }

            public void put(ChemiRecipiDetailEoImpl obj, Object value) {
                obj.setPerBatchQuantity((String)value);
            }
        }
        ,
        PerBatchConsumption {
            public Object get(ChemiRecipiDetailEoImpl obj) {
                return obj.getPerBatchConsumption();
            }

            public void put(ChemiRecipiDetailEoImpl obj, Object value) {
                obj.setPerBatchConsumption((String)value);
            }
        }
        ,
        TotalConsumption {
            public Object get(ChemiRecipiDetailEoImpl obj) {
                return obj.getTotalConsumption();
            }

            public void put(ChemiRecipiDetailEoImpl obj, Object value) {
                obj.setTotalConsumption((String)value);
            }
        }
        ,
        OnHandQty {
            public Object get(ChemiRecipiDetailEoImpl obj) {
                return obj.getOnHandQty();
            }

            public void put(ChemiRecipiDetailEoImpl obj, Object value) {
                obj.setOnHandQty((String)value);
            }
        }
        ,
        ExcessShortage {
            public Object get(ChemiRecipiDetailEoImpl obj) {
                return obj.getExcessShortage();
            }

            public void put(ChemiRecipiDetailEoImpl obj, Object value) {
                obj.setExcessShortage((String)value);
            }
        }
        ,
        ItemDescription {
            public Object get(ChemiRecipiDetailEoImpl obj) {
                return obj.getItemDescription();
            }

            public void put(ChemiRecipiDetailEoImpl obj, Object value) {
                obj.setItemDescription((String)value);
            }
        }
        ,
        CreatedBy {
            public Object get(ChemiRecipiDetailEoImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(ChemiRecipiDetailEoImpl obj, Object value) {
                obj.setCreatedBy((Number)value);
            }
        }
        ,
        CreationDate {
            public Object get(ChemiRecipiDetailEoImpl obj) {
                return obj.getCreationDate();
            }

            public void put(ChemiRecipiDetailEoImpl obj, Object value) {
                obj.setCreationDate((Date)value);
            }
        }
        ,
        LastUpdatedBy {
            public Object get(ChemiRecipiDetailEoImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(ChemiRecipiDetailEoImpl obj, Object value) {
                obj.setLastUpdatedBy((Number)value);
            }
        }
        ,
        LastUpdateDate {
            public Object get(ChemiRecipiDetailEoImpl obj) {
                return obj.getLastUpdateDate();
            }

            public void put(ChemiRecipiDetailEoImpl obj, Object value) {
                obj.setLastUpdateDate((Date)value);
            }
        }
        ,
        DetailRecipesEO {
            public Object get(ChemiRecipiDetailEoImpl obj) {
                return obj.getDetailRecipesEO();
            }

            public void put(ChemiRecipiDetailEoImpl obj, Object value) {
                obj.setDetailRecipesEO((DetailRecipesEOImpl)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(ChemiRecipiDetailEoImpl object);

        public abstract void put(ChemiRecipiDetailEoImpl object, Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int SNO = AttributesEnum.SNo.index();
    public static final int OPLINEID = AttributesEnum.OpLineId.index();
    public static final int CHEMICALID = AttributesEnum.ChemicalId.index();
    public static final int ITEMCODE = AttributesEnum.ItemCode.index();
    public static final int PERBATCHQUANTITY = AttributesEnum.PerBatchQuantity.index();
    public static final int PERBATCHCONSUMPTION = AttributesEnum.PerBatchConsumption.index();
    public static final int TOTALCONSUMPTION = AttributesEnum.TotalConsumption.index();
    public static final int ONHANDQTY = AttributesEnum.OnHandQty.index();
    public static final int EXCESSSHORTAGE = AttributesEnum.ExcessShortage.index();
    public static final int ITEMDESCRIPTION = AttributesEnum.ItemDescription.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();
    public static final int DETAILRECIPESEO = AttributesEnum.DetailRecipesEO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public ChemiRecipiDetailEoImpl() {
    }


    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject = EntityDefImpl.findDefObject("mnj.mfg.model.entities.ChemiRecipiDetailEo");
        }
        return mDefinitionObject;
    }

    /**
     * Gets the attribute value for SNo, using the alias name SNo.
     * @return the SNo
     */
    public Number getSNo() {
        return (Number)getAttributeInternal(SNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for SNo.
     * @param value value to set the SNo
     */
    public void setSNo(Number value) {
        setAttributeInternal(SNO, value);
    }

    /**
     * Gets the attribute value for OpLineId, using the alias name OpLineId.
     * @return the OpLineId
     */
    public Number getOpLineId() {
        return (Number)getAttributeInternal(OPLINEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for OpLineId.
     * @param value value to set the OpLineId
     */
    public void setOpLineId(Number value) {
        setAttributeInternal(OPLINEID, value);
    }

    /**
     * Gets the attribute value for ChemicalId, using the alias name ChemicalId.
     * @return the ChemicalId
     */
    public Number getChemicalId() {
        return (Number)getAttributeInternal(CHEMICALID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ChemicalId.
     * @param value value to set the ChemicalId
     */
    public void setChemicalId(Number value) {
        setAttributeInternal(CHEMICALID, value);
    }

    /**
     * Gets the attribute value for ItemCode, using the alias name ItemCode.
     * @return the ItemCode
     */
    public String getItemCode() {
        return (String)getAttributeInternal(ITEMCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ItemCode.
     * @param value value to set the ItemCode
     */
    public void setItemCode(String value) {
        setAttributeInternal(ITEMCODE, value);
    }

    /**
     * Gets the attribute value for PerBatchQuantity, using the alias name PerBatchQuantity.
     * @return the PerBatchQuantity
     */
    public String getPerBatchQuantity() {
        return (String)getAttributeInternal(PERBATCHQUANTITY);
    }

    /**
     * Sets <code>value</code> as the attribute value for PerBatchQuantity.
     * @param value value to set the PerBatchQuantity
     */
    public void setPerBatchQuantity(String value) {
        setAttributeInternal(PERBATCHQUANTITY, value);
    }

    /**
     * Gets the attribute value for PerBatchConsumption, using the alias name PerBatchConsumption.
     * @return the PerBatchConsumption
     */
    public String getPerBatchConsumption() {
        return (String)getAttributeInternal(PERBATCHCONSUMPTION);
    }

    /**
     * Sets <code>value</code> as the attribute value for PerBatchConsumption.
     * @param value value to set the PerBatchConsumption
     */
    public void setPerBatchConsumption(String value) {
        setAttributeInternal(PERBATCHCONSUMPTION, value);
    }

    /**
     * Gets the attribute value for TotalConsumption, using the alias name TotalConsumption.
     * @return the TotalConsumption
     */
    public String getTotalConsumption() {
        return (String)getAttributeInternal(TOTALCONSUMPTION);
    }

    /**
     * Sets <code>value</code> as the attribute value for TotalConsumption.
     * @param value value to set the TotalConsumption
     */
    public void setTotalConsumption(String value) {
        setAttributeInternal(TOTALCONSUMPTION, value);
    }

    /**
     * Gets the attribute value for OnHandQty, using the alias name OnHandQty.
     * @return the OnHandQty
     */
    public String getOnHandQty() {
        return (String)getAttributeInternal(ONHANDQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for OnHandQty.
     * @param value value to set the OnHandQty
     */
    public void setOnHandQty(String value) {
        setAttributeInternal(ONHANDQTY, value);
    }

    /**
     * Gets the attribute value for ExcessShortage, using the alias name ExcessShortage.
     * @return the ExcessShortage
     */
    public String getExcessShortage() {
        return (String)getAttributeInternal(EXCESSSHORTAGE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ExcessShortage.
     * @param value value to set the ExcessShortage
     */
    public void setExcessShortage(String value) {
        setAttributeInternal(EXCESSSHORTAGE, value);
    }

    /**
     * Gets the attribute value for ItemDescription, using the alias name ItemDescription.
     * @return the ItemDescription
     */
    public String getItemDescription() {
        return (String)getAttributeInternal(ITEMDESCRIPTION);
    }

    /**
     * Sets <code>value</code> as the attribute value for ItemDescription.
     * @param value value to set the ItemDescription
     */
    public void setItemDescription(String value) {
        setAttributeInternal(ITEMDESCRIPTION, value);
    }

    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the CreatedBy
     */
    public Number getCreatedBy() {
        return (Number)getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedBy.
     * @param value value to set the CreatedBy
     */
    public void setCreatedBy(Number value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for CreationDate, using the alias name CreationDate.
     * @return the CreationDate
     */
    public Date getCreationDate() {
        return (Date)getAttributeInternal(CREATIONDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreationDate.
     * @param value value to set the CreationDate
     */
    public void setCreationDate(Date value) {
        setAttributeInternal(CREATIONDATE, value);
    }

    /**
     * Gets the attribute value for LastUpdatedBy, using the alias name LastUpdatedBy.
     * @return the LastUpdatedBy
     */
    public Number getLastUpdatedBy() {
        return (Number)getAttributeInternal(LASTUPDATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastUpdatedBy.
     * @param value value to set the LastUpdatedBy
     */
    public void setLastUpdatedBy(Number value) {
        setAttributeInternal(LASTUPDATEDBY, value);
    }

    /**
     * Gets the attribute value for LastUpdateDate, using the alias name LastUpdateDate.
     * @return the LastUpdateDate
     */
    public Date getLastUpdateDate() {
        return (Date)getAttributeInternal(LASTUPDATEDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastUpdateDate.
     * @param value value to set the LastUpdateDate
     */
    public void setLastUpdateDate(Date value) {
        setAttributeInternal(LASTUPDATEDATE, value);
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index,
                                           AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value,
                                         AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }

    /**
     * @return the associated entity DetailRecipesEOImpl.
     */
    public DetailRecipesEOImpl getDetailRecipesEO() {
        return (DetailRecipesEOImpl)getAttributeInternal(DETAILRECIPESEO);
    }

    /**
     * Sets <code>value</code> as the associated entity DetailRecipesEOImpl.
     */
    public void setDetailRecipesEO(DetailRecipesEOImpl value) {
        setAttributeInternal(DETAILRECIPESEO, value);
    }


    /**
     * @param chemicalId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number chemicalId) {
        return new Key(new Object[]{chemicalId});
    }

    protected void create(AttributeList attributeList) {
        super.create(attributeList);
        oracle.jbo.server.SequenceImpl s =new oracle.jbo.server.SequenceImpl("MNJ_MFG_CHEMICAL_DET_S",getDBTransaction());
        oracle.jbo.domain.Number sVal = s.getSequenceNumber();
        setChemicalId(sVal);
    }
    
    /**
        * Custom DML update/insert/delete logic here.
        * @param operation the operation type
        * @param e the transaction event
        */
       protected void doDML(int operation, TransactionEvent e) {
           Map sessionScope = ADFContext.getCurrent().getSessionScope();   
           String user = (String)sessionScope.get("userId");
           String orgId  =(String)sessionScope.get("orgId");
           String unitName  =(String)sessionScope.get("unitName");
           
           System.out.println("ASSES INS DO DML 1 ------------------>"+user);
           System.out.println("ASSES INS DO DML 2------------------>"+orgId);
           System.out.println("ASSES INS DML 3 ------------------>"+unitName);
           
           if(DML_UPDATE == operation){
                     try {
                         
                         setLastUpdateDate((Date)Date.getCurrentDate()); 
                         setLastUpdatedBy(new oracle.jbo.domain.Number(user));
                     } catch (SQLException f) {
                         System.out.println(f.getMessage());
                     }
                 }
                 else if (DML_INSERT == operation){
                  
                     try {
                         
                         //setHeaderNo(getSrNoString());
                         //setOrgId(new oracle.jbo.domain.Number(orgId));
                         //setAttribute1(unitName);
                         setCreationDate((Date)Date.getCurrentDate());  
                         setCreatedBy(new oracle.jbo.domain.Number(user));
                        
                        
                        
                     } catch (SQLException f) {
                         ;
                     }
                 } 
           
           super.doDML(operation, e);
       }



}
