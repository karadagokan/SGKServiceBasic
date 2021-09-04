/**
 * ViziteGonder_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.karadag.sgkbasic.uygSgkService;

public interface ViziteGonder_PortType extends java.rmi.Remote {
    public com.karadag.sgkbasic.uygSgkService.Cevap isverenIletisimBilgileri(java.lang.String kullaniciAdi, java.lang.String isyeriKodu, java.lang.String wsToken, java.lang.String cepTel, java.lang.String eposta) throws java.rmi.RemoteException;
    public com.karadag.sgkbasic.uygSgkService.CevapRapor manuelCalismazlikBildirimiGoruntu(java.lang.String kullaniciAdi, java.lang.String isyeriKodu, java.lang.String wsToken, java.lang.String tckNo) throws java.rmi.RemoteException;
    public com.karadag.sgkbasic.uygSgkService.CevapRapor manuelCalismazlikBildirimiSil(java.lang.String kullaniciAdi, java.lang.String isyeriKodu, java.lang.String wsToken, java.lang.String id, java.lang.String tckNo) throws java.rmi.RemoteException;
    public void destroy() throws java.rmi.RemoteException;
    public com.karadag.sgkbasic.uygSgkService.CevapRapor hasIsKazSorguTarihle(java.lang.String kullaniciAdi, java.lang.String isyeriKodu, java.lang.String wsToken, java.lang.String tarih, java.lang.String tarih2) throws java.rmi.RemoteException;
    public com.karadag.sgkbasic.uygSgkService.CevapRapor manuelCalismazlikBildirimiGiris(java.lang.String kullaniciAdi, java.lang.String isyeriKodu, java.lang.String wsToken, java.lang.String tckNo, java.lang.String raporBaslangicTarihi, java.lang.String iseBaslamaTarihi, java.lang.String nitelikDurumu) throws java.rmi.RemoteException;
    public com.karadag.sgkbasic.uygSgkService.CevapRapor raporAramaTarihile(java.lang.String kullaniciAdi, java.lang.String isyeriKodu, java.lang.String wsToken, java.lang.String tarih) throws java.rmi.RemoteException;
    public com.karadag.sgkbasic.uygSgkService.CevapRapor hasIsKazSorguTCile(java.lang.String kullaniciAdi, java.lang.String isyeriKodu, java.lang.String wsToken, java.lang.String tckNo) throws java.rmi.RemoteException;
    public com.karadag.sgkbasic.uygSgkService.CevapLogin wsLogin(java.lang.String kullaniciAdi, java.lang.String isyeriKodu, java.lang.String isyeriSifresi) throws java.rmi.RemoteException;
    public com.karadag.sgkbasic.uygSgkService.CevapRapor raporAramaKimlikNo(java.lang.String kullaniciAdi, java.lang.String isyeriKodu, java.lang.String wsToken, java.lang.String tckNo) throws java.rmi.RemoteException;
    public void init(java.lang.Object context) throws java.rmi.RemoteException;
    public com.karadag.sgkbasic.uygSgkService.CevapRapor raporOnay(java.lang.String kullaniciAdi, java.lang.String isyeriKodu, java.lang.String wsToken, java.lang.String tckNo, java.lang.String vaka, java.lang.String medulaRaporId, java.lang.String nitelikDurumu, java.lang.String tarih) throws java.rmi.RemoteException;
    public com.karadag.sgkbasic.uygSgkService.CevapRapor onaylIptal(java.lang.String kullaniciAdi, java.lang.String isyeriKodu, java.lang.String wsToken, java.lang.String medulaRaporId) throws java.rmi.RemoteException;
    public com.karadag.sgkbasic.uygSgkService.Cevap hasIsKazSorguKapat(java.lang.String kullaniciAdi, java.lang.String isyeriKodu, java.lang.String wsToken, java.lang.String bildirimId) throws java.rmi.RemoteException;
    public com.karadag.sgkbasic.uygSgkService.CevapRapor personelimDegildir(java.lang.String kullaniciAdi, java.lang.String isyeriKodu, java.lang.String wsToken, java.lang.String tckNo, java.lang.String vaka, java.lang.String medulaRaporId) throws java.rmi.RemoteException;
    public com.karadag.sgkbasic.uygSgkService.CevapRapor isverenIletisimBilgileriGoruntu(java.lang.String kullaniciAdi, java.lang.String isyeriKodu, java.lang.String wsToken) throws java.rmi.RemoteException;
    public com.karadag.sgkbasic.uygSgkService.CevapRapor onayliRaporlarTarihile(java.lang.String kullaniciAdi, java.lang.String isyeriKodu, java.lang.String wsToken, java.lang.String tarih1, java.lang.String tarih2) throws java.rmi.RemoteException;
    public com.karadag.sgkbasic.uygSgkService.Cevap raporOkunduKapat(java.lang.String kullaniciAdi, java.lang.String isyeriKodu, java.lang.String wsToken, java.lang.String medulaRaporId) throws java.rmi.RemoteException;
}
