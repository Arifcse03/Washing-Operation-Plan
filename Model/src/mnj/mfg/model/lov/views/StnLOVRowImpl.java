package mnj.mfg.model.lov.views;

import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Aug 06 15:33:33 PKT 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class StnLOVRowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        Stn {
            public Object get(StnLOVRowImpl obj) {
                return obj.getStn();
            }

            public void put(StnLOVRowImpl obj, Object value) {
                obj.setStn((String)value);
            }
        }
        ,
        OrderedItem {
            public Object get(StnLOVRowImpl obj) {
                return obj.getOrderedItem();
            }

            public void put(StnLOVRowImpl obj, Object value) {
                obj.setOrderedItem((String)value);
            }
        }
        ,
        InventoryItemId {
            public Object get(StnLOVRowImpl obj) {
                return obj.getInventoryItemId();
            }

            public void put(StnLOVRowImpl obj, Object value) {
                obj.setInventoryItemId((Number)value);
            }
        }
        ,
        Description {
            public Object get(StnLOVRowImpl obj) {
                return obj.getDescription();
            }

            public void put(StnLOVRowImpl obj, Object value) {
                obj.setDescription((String)value);
            }
        }
        ,
        HeaderId {
            public Object get(StnLOVRowImpl obj) {
                return obj.getHeaderId();
            }

            public void put(StnLOVRowImpl obj, Object value) {
                obj.setHeaderId((Number)value);
            }
        }
        ,
        OrderedQuantity {
            public Object get(StnLOVRowImpl obj) {
                return obj.getOrderedQuantity();
            }

            public void put(StnLOVRowImpl obj, Object value) {
                obj.setOrderedQuantity((Number)value);
            }
        }
        ,
        LineId {
            public Object get(StnLOVRowImpl obj) {
                return obj.getLineId();
            }

            public void put(StnLOVRowImpl obj, Object value) {
                obj.setLineId((Number)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(StnLOVRowImpl object);

        public abstract void put(StnLOVRowImpl object, Object value);

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


    public static final int STN = AttributesEnum.Stn.index();
    public static final int ORDEREDITEM = AttributesEnum.OrderedItem.index();
    public static final int INVENTORYITEMID = AttributesEnum.InventoryItemId.index();
    public static final int DESCRIPTION = AttributesEnum.Description.index();
    public static final int HEADERID = AttributesEnum.HeaderId.index();
    public static final int ORDEREDQUANTITY = AttributesEnum.OrderedQuantity.index();
    public static final int LINEID = AttributesEnum.LineId.index();

    /**
     * This is the default constructor (do not remove).
     */
    public StnLOVRowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute Stn.
     * @return the Stn
     */
    public String getStn() {
        return (String) getAttributeInternal(STN);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Stn.
     * @param value value to set the  Stn
     */
    public void setStn(String value) {
        setAttributeInternal(STN, value);
    }

    /**
     * Gets the attribute value for the calculated attribute OrderedItem.
     * @return the OrderedItem
     */
    public String getOrderedItem() {
        return (String) getAttributeInternal(ORDEREDITEM);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute OrderedItem.
     * @param value value to set the  OrderedItem
     */
    public void setOrderedItem(String value) {
        setAttributeInternal(ORDEREDITEM, value);
    }

    /**
     * Gets the attribute value for the calculated attribute InventoryItemId.
     * @return the InventoryItemId
     */
    public Number getInventoryItemId() {
        return (Number) getAttributeInternal(INVENTORYITEMID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute InventoryItemId.
     * @param value value to set the  InventoryItemId
     */
    public void setInventoryItemId(Number value) {
        setAttributeInternal(INVENTORYITEMID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Description.
     * @return the Description
     */
    public String getDescription() {
        return (String) getAttributeInternal(DESCRIPTION);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Description.
     * @param value value to set the  Description
     */
    public void setDescription(String value) {
        setAttributeInternal(DESCRIPTION, value);
    }

    /**
     * Gets the attribute value for the calculated attribute HeaderId.
     * @return the HeaderId
     */
    public Number getHeaderId() {
        return (Number) getAttributeInternal(HEADERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute HeaderId.
     * @param value value to set the  HeaderId
     */
    public void setHeaderId(Number value) {
        setAttributeInternal(HEADERID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute OrderedQuantity.
     * @return the OrderedQuantity
     */
    public Number getOrderedQuantity() {
        return (Number) getAttributeInternal(ORDEREDQUANTITY);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute OrderedQuantity.
     * @param value value to set the  OrderedQuantity
     */
    public void setOrderedQuantity(Number value) {
        setAttributeInternal(ORDEREDQUANTITY, value);
    }

    /**
     * Gets the attribute value for the calculated attribute LineId.
     * @return the LineId
     */
    public Number getLineId() {
        return (Number) getAttributeInternal(LINEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute LineId.
     * @param value value to set the  LineId
     */
    public void setLineId(Number value) {
        setAttributeInternal(LINEID, value);
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
}
