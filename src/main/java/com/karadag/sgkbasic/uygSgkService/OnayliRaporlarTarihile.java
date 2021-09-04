/**
 * OnayliRaporlarTarihile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.karadag.sgkbasic.uygSgkService;

public class OnayliRaporlarTarihile  implements java.io.Serializable {
    private java.lang.String kullaniciAdi;

    private java.lang.String isyeriKodu;

    private java.lang.String wsToken;

    private java.lang.String tarih1;

    private java.lang.String tarih2;

    public OnayliRaporlarTarihile() {
    }

    public OnayliRaporlarTarihile(
           java.lang.String kullaniciAdi,
           java.lang.String isyeriKodu,
           java.lang.String wsToken,
           java.lang.String tarih1,
           java.lang.String tarih2) {
           this.kullaniciAdi = kullaniciAdi;
           this.isyeriKodu = isyeriKodu;
           this.wsToken = wsToken;
           this.tarih1 = tarih1;
           this.tarih2 = tarih2;
    }


    /**
     * Gets the kullaniciAdi value for this OnayliRaporlarTarihile.
     * 
     * @return kullaniciAdi
     */
    public java.lang.String getKullaniciAdi() {
        return kullaniciAdi;
    }


    /**
     * Sets the kullaniciAdi value for this OnayliRaporlarTarihile.
     * 
     * @param kullaniciAdi
     */
    public void setKullaniciAdi(java.lang.String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }


    /**
     * Gets the isyeriKodu value for this OnayliRaporlarTarihile.
     * 
     * @return isyeriKodu
     */
    public java.lang.String getIsyeriKodu() {
        return isyeriKodu;
    }


    /**
     * Sets the isyeriKodu value for this OnayliRaporlarTarihile.
     * 
     * @param isyeriKodu
     */
    public void setIsyeriKodu(java.lang.String isyeriKodu) {
        this.isyeriKodu = isyeriKodu;
    }


    /**
     * Gets the wsToken value for this OnayliRaporlarTarihile.
     * 
     * @return wsToken
     */
    public java.lang.String getWsToken() {
        return wsToken;
    }


    /**
     * Sets the wsToken value for this OnayliRaporlarTarihile.
     * 
     * @param wsToken
     */
    public void setWsToken(java.lang.String wsToken) {
        this.wsToken = wsToken;
    }


    /**
     * Gets the tarih1 value for this OnayliRaporlarTarihile.
     * 
     * @return tarih1
     */
    public java.lang.String getTarih1() {
        return tarih1;
    }


    /**
     * Sets the tarih1 value for this OnayliRaporlarTarihile.
     * 
     * @param tarih1
     */
    public void setTarih1(java.lang.String tarih1) {
        this.tarih1 = tarih1;
    }


    /**
     * Gets the tarih2 value for this OnayliRaporlarTarihile.
     * 
     * @return tarih2
     */
    public java.lang.String getTarih2() {
        return tarih2;
    }


    /**
     * Sets the tarih2 value for this OnayliRaporlarTarihile.
     * 
     * @param tarih2
     */
    public void setTarih2(java.lang.String tarih2) {
        this.tarih2 = tarih2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OnayliRaporlarTarihile)) return false;
        OnayliRaporlarTarihile other = (OnayliRaporlarTarihile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.kullaniciAdi==null && other.getKullaniciAdi()==null) || 
             (this.kullaniciAdi!=null &&
              this.kullaniciAdi.equals(other.getKullaniciAdi()))) &&
            ((this.isyeriKodu==null && other.getIsyeriKodu()==null) || 
             (this.isyeriKodu!=null &&
              this.isyeriKodu.equals(other.getIsyeriKodu()))) &&
            ((this.wsToken==null && other.getWsToken()==null) || 
             (this.wsToken!=null &&
              this.wsToken.equals(other.getWsToken()))) &&
            ((this.tarih1==null && other.getTarih1()==null) || 
             (this.tarih1!=null &&
              this.tarih1.equals(other.getTarih1()))) &&
            ((this.tarih2==null && other.getTarih2()==null) || 
             (this.tarih2!=null &&
              this.tarih2.equals(other.getTarih2())));
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
        if (getKullaniciAdi() != null) {
            _hashCode += getKullaniciAdi().hashCode();
        }
        if (getIsyeriKodu() != null) {
            _hashCode += getIsyeriKodu().hashCode();
        }
        if (getWsToken() != null) {
            _hashCode += getWsToken().hashCode();
        }
        if (getTarih1() != null) {
            _hashCode += getTarih1().hashCode();
        }
        if (getTarih2() != null) {
            _hashCode += getTarih2().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OnayliRaporlarTarihile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.com", ">onayliRaporlarTarihile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kullaniciAdi");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kullaniciAdi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isyeriKodu");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isyeriKodu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsToken");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wsToken"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tarih1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tarih1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tarih2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tarih2"));
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
