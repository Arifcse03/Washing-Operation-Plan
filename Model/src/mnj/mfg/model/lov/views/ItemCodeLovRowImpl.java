package mnj.mfg.model.lov.views;

import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Aug 06 19:00:54 PKT 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ItemCodeLovRowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        Code {
            public Object get(ItemCodeLovRowImpl obj) {
                return obj.getCode();
            }

            public void put(ItemCodeLovRowImpl obj, Object value) {
                obj.setCode((String)value);
            }
        }
        ,
        InventoryItemId {
            public Object get(ItemCodeLovRowImpl obj) {
                return obj.getInventoryItemId();
            }

            public void put(ItemCodeLovRowImpl obj, Object value) {
                obj.setInventoryItemId((Number)value);
            }
        }
        ,
        Item {
            public Object get(ItemCodeLovRowImpl obj) {
                return obj.getItem();
            }

            public void put(ItemCodeLovRowImpl obj, Object value) {
                obj.setItem((String)value);
            }
        }
        ,
        HeaderId {
            public Object get(ItemCodeLovRowImpl obj) {
                return obj.getHeaderId();
            }

            public void put(ItemCodeLovRowImpl obj, Object value) {
                obj.setHeaderId((Number)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(ItemCodeLovRowImpl object);

        public abstract void put(ItemCodeLovRowImpl object, Object value);

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
    public static final int CODE = AttributesEnum.Code.index();
    public static final int INVENTORYITEMID = AttributesEnum.InventoryItemId.index();
    public static final int ITEM = AttributesEnum.Item.index();
    public static final int HEADERID = AttributesEnum.HeaderId.index();

    /**
     * This is the default constructor (do not remove).
     */
    public ItemCodeLovRowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute Code.
     * @return the Code
     */
    public String getCode() {
        return (String) getAttributeInternal(CODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Code.
     * @param value value to set the  Code
     */
    public void setCode(String value) {
        setAttributeInternal(CODE, value);
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
     * Gets the attribute value for the calculated attribute Item.
     * @return the Item
     */
    public String getItem() {
        return (String) getAttributeInternal(ITEM);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Item.
     * @param value value to set the  Item
     */
    public void setItem(String value) {
        setAttributeInternal(ITEM, value);
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
