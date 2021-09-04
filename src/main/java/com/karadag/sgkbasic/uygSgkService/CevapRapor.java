/**
 * CevapRapor.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.karadag.sgkbasic.uygSgkService;

public class CevapRapor  extends com.karadag.sgkbasic.uygSgkService.Cevap  implements java.io.Serializable {
    private com.karadag.sgkbasic.uygSgkService.IsKazasiHastaneBilgiBean[] isKazasiHastaneBilgiBeanArray;

    private com.karadag.sgkbasic.uygSgkService.HastaneBildirimiIsKazasiBean[] hastaneBildirimiIsKazasiBean;

    private com.karadag.sgkbasic.uygSgkService.IsverenIletisimBilgiBean[] isverenIletisimBilgiBean;

    private com.karadag.sgkbasic.uygSgkService.OnayliRaporlarTarihleBean[] onayliRaporlarTarihleBeanArray;

    private com.karadag.sgkbasic.uygSgkService.RaporAramaTarihleBean[] raporAramaTarihleBeanArray;

    private com.karadag.sgkbasic.uygSgkService.ManuelCalismazlikBean[] manuelCalismazlikBean;

    private com.karadag.sgkbasic.uygSgkService.TarihSorguBean[] tarihSorguBean;

    private com.karadag.sgkbasic.uygSgkService.RaporBean[] raporBeanArray;

    public CevapRapor() {
    }

    public CevapRapor(
           int sonucKod,
           java.lang.String sonucAciklama,
           com.karadag.sgkbasic.uygSgkService.IsKazasiHastaneBilgiBean[] isKazasiHastaneBilgiBeanArray,
           com.karadag.sgkbasic.uygSgkService.HastaneBildirimiIsKazasiBean[] hastaneBildirimiIsKazasiBean,
           com.karadag.sgkbasic.uygSgkService.IsverenIletisimBilgiBean[] isverenIletisimBilgiBean,
           com.karadag.sgkbasic.uygSgkService.OnayliRaporlarTarihleBean[] onayliRaporlarTarihleBeanArray,
           com.karadag.sgkbasic.uygSgkService.RaporAramaTarihleBean[] raporAramaTarihleBeanArray,
           com.karadag.sgkbasic.uygSgkService.ManuelCalismazlikBean[] manuelCalismazlikBean,
           com.karadag.sgkbasic.uygSgkService.TarihSorguBean[] tarihSorguBean,
           com.karadag.sgkbasic.uygSgkService.RaporBean[] raporBeanArray) {
        super(
            sonucKod,
            sonucAciklama);
        this.isKazasiHastaneBilgiBeanArray = isKazasiHastaneBilgiBeanArray;
        this.hastaneBildirimiIsKazasiBean = hastaneBildirimiIsKazasiBean;
        this.isverenIletisimBilgiBean = isverenIletisimBilgiBean;
        this.onayliRaporlarTarihleBeanArray = onayliRaporlarTarihleBeanArray;
        this.raporAramaTarihleBeanArray = raporAramaTarihleBeanArray;
        this.manuelCalismazlikBean = manuelCalismazlikBean;
        this.tarihSorguBean = tarihSorguBean;
        this.raporBeanArray = raporBeanArray;
    }


    /**
     * Gets the isKazasiHastaneBilgiBeanArray value for this CevapRapor.
     * 
     * @return isKazasiHastaneBilgiBeanArray
     */
    public com.karadag.sgkbasic.uygSgkService.IsKazasiHastaneBilgiBean[] getIsKazasiHastaneBilgiBeanArray() {
        return isKazasiHastaneBilgiBeanArray;
    }


    /**
     * Sets the isKazasiHastaneBilgiBeanArray value for this CevapRapor.
     * 
     * @param isKazasiHastaneBilgiBeanArray
     */
    public void setIsKazasiHastaneBilgiBeanArray(com.karadag.sgkbasic.uygSgkService.IsKazasiHastaneBilgiBean[] isKazasiHastaneBilgiBeanArray) {
        this.isKazasiHastaneBilgiBeanArray = isKazasiHastaneBilgiBeanArray;
    }


    /**
     * Gets the hastaneBildirimiIsKazasiBean value for this CevapRapor.
     * 
     * @return hastaneBildirimiIsKazasiBean
     */
    public com.karadag.sgkbasic.uygSgkService.HastaneBildirimiIsKazasiBean[] getHastaneBildirimiIsKazasiBean() {
        return hastaneBildirimiIsKazasiBean;
    }


    /**
     * Sets the hastaneBildirimiIsKazasiBean value for this CevapRapor.
     * 
     * @param hastaneBildirimiIsKazasiBean
     */
    public void setHastaneBildirimiIsKazasiBean(com.karadag.sgkbasic.uygSgkService.HastaneBildirimiIsKazasiBean[] hastaneBildirimiIsKazasiBean) {
        this.hastaneBildirimiIsKazasiBean = hastaneBildirimiIsKazasiBean;
    }


    /**
     * Gets the isverenIletisimBilgiBean value for this CevapRapor.
     * 
     * @return isverenIletisimBilgiBean
     */
    public com.karadag.sgkbasic.uygSgkService.IsverenIletisimBilgiBean[] getIsverenIletisimBilgiBean() {
        return isverenIletisimBilgiBean;
    }


    /**
     * Sets the isverenIletisimBilgiBean value for this CevapRapor.
     * 
     * @param isverenIletisimBilgiBean
     */
    public void setIsverenIletisimBilgiBean(com.karadag.sgkbasic.uygSgkService.IsverenIletisimBilgiBean[] isverenIletisimBilgiBean) {
        this.isverenIletisimBilgiBean = isverenIletisimBilgiBean;
    }


    /**
     * Gets the onayliRaporlarTarihleBeanArray value for this CevapRapor.
     * 
     * @return onayliRaporlarTarihleBeanArray
     */
    public com.karadag.sgkbasic.uygSgkService.OnayliRaporlarTarihleBean[] getOnayliRaporlarTarihleBeanArray() {
        return onayliRaporlarTarihleBeanArray;
    }


    /**
     * Sets the onayliRaporlarTarihleBeanArray value for this CevapRapor.
     * 
     * @param onayliRaporlarTarihleBeanArray
     */
    public void setOnayliRaporlarTarihleBeanArray(com.karadag.sgkbasic.uygSgkService.OnayliRaporlarTarihleBean[] onayliRaporlarTarihleBeanArray) {
        this.onayliRaporlarTarihleBeanArray = onayliRaporlarTarihleBeanArray;
    }


    /**
     * Gets the raporAramaTarihleBeanArray value for this CevapRapor.
     * 
     * @return raporAramaTarihleBeanArray
     */
    public com.karadag.sgkbasic.uygSgkService.RaporAramaTarihleBean[] getRaporAramaTarihleBeanArray() {
        return raporAramaTarihleBeanArray;
    }


    /**
     * Sets the raporAramaTarihleBeanArray value for this CevapRapor.
     * 
     * @param raporAramaTarihleBeanArray
     */
    public void setRaporAramaTarihleBeanArray(com.karadag.sgkbasic.uygSgkService.RaporAramaTarihleBean[] raporAramaTarihleBeanArray) {
        this.raporAramaTarihleBeanArray = raporAramaTarihleBeanArray;
    }


    /**
     * Gets the manuelCalismazlikBean value for this CevapRapor.
     * 
     * @return manuelCalismazlikBean
     */
    public com.karadag.sgkbasic.uygSgkService.ManuelCalismazlikBean[] getManuelCalismazlikBean() {
        return manuelCalismazlikBean;
    }


    /**
     * Sets the manuelCalismazlikBean value for this CevapRapor.
     * 
     * @param manuelCalismazlikBean
     */
    public void setManuelCalismazlikBean(com.karadag.sgkbasic.uygSgkService.ManuelCalismazlikBean[] manuelCalismazlikBean) {
        this.manuelCalismazlikBean = manuelCalismazlikBean;
    }


    /**
     * Gets the tarihSorguBean value for this CevapRapor.
     * 
     * @return tarihSorguBean
     */
    public com.karadag.sgkbasic.uygSgkService.TarihSorguBean[] getTarihSorguBean() {
        return tarihSorguBean;
    }


    /**
     * Sets the tarihSorguBean value for this CevapRapor.
     * 
     * @param tarihSorguBean
     */
    public void setTarihSorguBean(com.karadag.sgkbasic.uygSgkService.TarihSorguBean[] tarihSorguBean) {
        this.tarihSorguBean = tarihSorguBean;
    }


    /**
     * Gets the raporBeanArray value for this CevapRapor.
     * 
     * @return raporBeanArray
     */
    public com.karadag.sgkbasic.uygSgkService.RaporBean[] getRaporBeanArray() {
        return raporBeanArray;
    }


    /**
     * Sets the raporBeanArray value for this CevapRapor.
     * 
     * @param raporBeanArray
     */
    public void setRaporBeanArray(com.karadag.sgkbasic.uygSgkService.RaporBean[] raporBeanArray) {
        this.raporBeanArray = raporBeanArray;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CevapRapor)) return false;
        CevapRapor other = (CevapRapor) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.isKazasiHastaneBilgiBeanArray==null && other.getIsKazasiHastaneBilgiBeanArray()==null) || 
             (this.isKazasiHastaneBilgiBeanArray!=null &&
              java.util.Arrays.equals(this.isKazasiHastaneBilgiBeanArray, other.getIsKazasiHastaneBilgiBeanArray()))) &&
            ((this.hastaneBildirimiIsKazasiBean==null && other.getHastaneBildirimiIsKazasiBean()==null) || 
             (this.hastaneBildirimiIsKazasiBean!=null &&
              java.util.Arrays.equals(this.hastaneBildirimiIsKazasiBean, other.getHastaneBildirimiIsKazasiBean()))) &&
            ((this.isverenIletisimBilgiBean==null && other.getIsverenIletisimBilgiBean()==null) || 
             (this.isverenIletisimBilgiBean!=null &&
              java.util.Arrays.equals(this.isverenIletisimBilgiBean, other.getIsverenIletisimBilgiBean()))) &&
            ((this.onayliRaporlarTarihleBeanArray==null && other.getOnayliRaporlarTarihleBeanArray()==null) || 
             (this.onayliRaporlarTarihleBeanArray!=null &&
              java.util.Arrays.equals(this.onayliRaporlarTarihleBeanArray, other.getOnayliRaporlarTarihleBeanArray()))) &&
            ((this.raporAramaTarihleBeanArray==null && other.getRaporAramaTarihleBeanArray()==null) || 
             (this.raporAramaTarihleBeanArray!=null &&
              java.util.Arrays.equals(this.raporAramaTarihleBeanArray, other.getRaporAramaTarihleBeanArray()))) &&
            ((this.manuelCalismazlikBean==null && other.getManuelCalismazlikBean()==null) || 
             (this.manuelCalismazlikBean!=null &&
              java.util.Arrays.equals(this.manuelCalismazlikBean, other.getManuelCalismazlikBean()))) &&
            ((this.tarihSorguBean==null && other.getTarihSorguBean()==null) || 
             (this.tarihSorguBean!=null &&
              java.util.Arrays.equals(this.tarihSorguBean, other.getTarihSorguBean()))) &&
            ((this.raporBeanArray==null && other.getRaporBeanArray()==null) || 
             (this.raporBeanArray!=null &&
              java.util.Arrays.equals(this.raporBeanArray, other.getRaporBeanArray())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getIsKazasiHastaneBilgiBeanArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsKazasiHastaneBilgiBeanArray());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsKazasiHastaneBilgiBeanArray(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHastaneBildirimiIsKazasiBean() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHastaneBildirimiIsKazasiBean());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHastaneBildirimiIsKazasiBean(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsverenIletisimBilgiBean() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsverenIletisimBilgiBean());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsverenIletisimBilgiBean(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOnayliRaporlarTarihleBeanArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOnayliRaporlarTarihleBeanArray());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOnayliRaporlarTarihleBeanArray(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRaporAramaTarihleBeanArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRaporAramaTarihleBeanArray());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRaporAramaTarihleBeanArray(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getManuelCalismazlikBean() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getManuelCalismazlikBean());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getManuelCalismazlikBean(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTarihSorguBean() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTarihSorguBean());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTarihSorguBean(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRaporBeanArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRaporBeanArray());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRaporBeanArray(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CevapRapor.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.vizite.ws.sgk.com", "CevapRapor"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isKazasiHastaneBilgiBeanArray");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isKazasiHastaneBilgiBeanArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bean.vizite.ws.sgk.com", "IsKazasiHastaneBilgiBean"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "IsKazasiHastaneBilgiBean"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hastaneBildirimiIsKazasiBean");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hastaneBildirimiIsKazasiBean"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bean.vizite.ws.sgk.com", "HastaneBildirimiIsKazasiBean"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "HastaneBildirimiIsKazasiBean"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isverenIletisimBilgiBean");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isverenIletisimBilgiBean"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bean.vizite.ws.sgk.com", "IsverenIletisimBilgiBean"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "IsverenIletisimBilgiBean"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onayliRaporlarTarihleBeanArray");
        elemField.setXmlName(new javax.xml.namespace.QName("", "onayliRaporlarTarihleBeanArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bean.vizite.ws.sgk.com", "OnayliRaporlarTarihleBean"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "OnayliRaporlarTarihleBean"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("raporAramaTarihleBeanArray");
        elemField.setXmlName(new javax.xml.namespace.QName("", "raporAramaTarihleBeanArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bean.vizite.ws.sgk.com", "RaporAramaTarihleBean"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "RaporAramaTarihleBean"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manuelCalismazlikBean");
        elemField.setXmlName(new javax.xml.namespace.QName("", "manuelCalismazlikBean"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bean.vizite.ws.sgk.com", "ManuelCalismazlikBean"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "ManuelCalismazlikBean"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tarihSorguBean");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tarihSorguBean"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bean.vizite.ws.sgk.com", "TarihSorguBean"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "TarihSorguBean"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("raporBeanArray");
        elemField.setXmlName(new javax.xml.namespace.QName("", "raporBeanArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bean.vizite.ws.sgk.com", "RaporBean"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "RaporBean"));
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
