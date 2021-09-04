/**
 * Cevap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.karadag.sgkbasic.uygSgkService;

public class Cevap  implements java.io.Serializable {
    private int sonucKod;

    private java.lang.String sonucAciklama;

    public Cevap() {
    }

    public Cevap(
           int sonucKod,
           java.lang.String sonucAciklama) {
           this.sonucKod = sonucKod;
           this.sonucAciklama = sonucAciklama;
    }


    /**
     * Gets the sonucKod value for this Cevap.
     * 
     * @return sonucKod
     */
    public int getSonucKod() {
        return sonucKod;
    }


    /**
     * Sets the sonucKod value for this Cevap.
     * 
     * @param sonucKod
     */
    public void setSonucKod(int sonucKod) {
        this.sonucKod = sonucKod;
    }


    /**
     * Gets the sonucAciklama value for this Cevap.
     * 
     * @return sonucAciklama
     */
    public java.lang.String getSonucAciklama() {
        return sonucAciklama;
    }


    /**
     * Sets the sonucAciklama value for this Cevap.
     * 
     * @param sonucAciklama
     */
    public void setSonucAciklama(java.lang.String sonucAciklama) {
        this.sonucAciklama = sonucAciklama;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Cevap)) return false;
        Cevap other = (Cevap) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.sonucKod == other.getSonucKod() &&
            ((this.sonucAciklama==null && other.getSonucAciklama()==null) || 
             (this.sonucAciklama!=null &&
              this.sonucAciklama.equals(other.getSonucAciklama())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getSonucKod();
        if (getSonucAciklama() != null) {
            _hashCode += getSonucAciklama().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Cevap.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.vizite.ws.sgk.com", "Cevap"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sonucKod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sonucKod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sonucAciklama");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sonucAciklama"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
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
