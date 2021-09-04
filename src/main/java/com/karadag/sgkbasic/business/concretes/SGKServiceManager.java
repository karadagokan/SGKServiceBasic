package com.karadag.sgkbasic.business.concretes;

import com.karadag.sgkbasic.business.abstracts.SGKService;
import com.karadag.sgkbasic.core.Login;
import com.karadag.sgkbasic.core.Result.DataResult;
import com.karadag.sgkbasic.core.Result.SuccessDataResult;
import com.karadag.sgkbasic.entities.LoginInformation;
import com.karadag.sgkbasic.entities.RaporAramaKimlikNo;
import com.karadag.sgkbasic.entities.RaporAramaTarihle;
import com.karadag.sgkbasic.uygSgkService.CevapRapor;
import com.karadag.sgkbasic.uygSgkService.RaporAramaTarihleBean;
import com.karadag.sgkbasic.uygSgkService.RaporBean;
import com.karadag.sgkbasic.uygSgkService.ViziteGonderSoapBindingStub;
import org.springframework.stereotype.Service;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

@Service
public class SGKServiceManager implements SGKService {

    private LoginInformation loginInformation;
    private String token;

    @Override
    public DataResult<String> login(LoginInformation loginInformation) {
        this.loginInformation = loginInformation;
        Login login = new Login();
        return new SuccessDataResult<String>(this.token = login.getToken(loginInformation), "Token Oluşturuldu");
    }

    @Override
    public DataResult<List<RaporAramaTarihle>> raporAramaTarihleList(String date) {
        List<RaporAramaTarihle> raporAramaTarihleResult = new ArrayList<>();
        try {
            ViziteGonderSoapBindingStub viziteGonderSoapBindingStub = new ViziteGonderSoapBindingStub();
            CevapRapor cevapRapor = viziteGonderSoapBindingStub.raporAramaTarihile(loginInformation.getKullaniciAdi(), loginInformation.getIsyeriKodu(), this.token, date);
            RaporAramaTarihleBean[] raporAramaTarihleBeanArray = cevapRapor.getRaporAramaTarihleBeanArray();


            RaporAramaTarihle raporAramaTarihle = new RaporAramaTarihle();
            for (RaporAramaTarihleBean person : raporAramaTarihleBeanArray) {

                raporAramaTarihle.setMedulaRaporId(person.getMEDULARAPORID());
                raporAramaTarihle.setRaporTakipNo(person.getRAPORTAKIPNO());
                raporAramaTarihle.setRaporSiraNo(person.getRAPORSIRANO());
                raporAramaTarihle.setTcKimlikNo(person.getTCKIMLIKNO());
                raporAramaTarihle
                        .setSigortaliAdSoyad(person.getAD() + " " + person.getSOYAD());
                raporAramaTarihle.setABasTar(person.getABASTAR());
                raporAramaTarihle.setABitTar(person.getABITTAR());
                raporAramaTarihle.setYatRapBasTar(person.getYATRAPBASTAR());
                raporAramaTarihle.setIsBasKontTar(person.getISBASKONTTAR());
                raporAramaTarihle.setVaka(person.getVAKA());
                raporAramaTarihle.setVakaAdi(person.getVAKAADI());
                raporAramaTarihle.setPolikinlikTar(person.getPOLIKLINIKTAR());
                raporAramaTarihle.setRaporDurumu(person.getRAPORDURUMU());
                raporAramaTarihle.setYatRapBasTar(person.getYATRAPBASTAR());
                raporAramaTarihle.setYatRapBitTar(person.getYATRAPBITTAR());

                raporAramaTarihleResult.add(raporAramaTarihle);
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return new SuccessDataResult<List<RaporAramaTarihle>>(raporAramaTarihleResult, "Raporlar Tarih İle Listelendi");
    }

    @Override
    public DataResult<RaporAramaKimlikNo> raporAramaTCKimlikNo(String tcKimlikNo) {
        RaporAramaKimlikNo raporAramaKimlikNo = new RaporAramaKimlikNo();

        try {
            ViziteGonderSoapBindingStub viziteGonderSoapBindingStub = new ViziteGonderSoapBindingStub();
            CevapRapor cevapRapor = viziteGonderSoapBindingStub.raporAramaKimlikNo(loginInformation.getKullaniciAdi(), loginInformation.getIsyeriKodu(), this.token, tcKimlikNo);


            RaporBean[] raporBeanArray = cevapRapor.getRaporBeanArray();


            for (RaporBean person : raporBeanArray) {
                raporAramaKimlikNo.setMedulaRaporId(person.getMEDULARAPORID());
                raporAramaKimlikNo.setRaporTakipNo(person.getRAPORTAKIPNO());
                raporAramaKimlikNo.setRaporSiraNo(person.getRAPORSIRANO());
                raporAramaKimlikNo.setTcKimlikNo(person.getTCKIMLIKNO());
                raporAramaKimlikNo.setABasTar(person.getABASTAR());
                raporAramaKimlikNo.setABitTar(person.getABITTAR());
                raporAramaKimlikNo.setYatRapBasTar(person.getYATRAPBASTAR());
                raporAramaKimlikNo.setIsBasKontTar(person.getISBASKONTTAR());
                raporAramaKimlikNo.setVaka(person.getVAKA());
                raporAramaKimlikNo.setVakaAdi(person.getVAKAADI());
                raporAramaKimlikNo.setPolikinlikTar(person.getPOLIKLINIKTAR());
                raporAramaKimlikNo.setRaporDurumu(person.getRAPORDURUMU());

                raporAramaKimlikNo.setAd(person.getAD());
                raporAramaKimlikNo.setSoyad(person.getSOYAD());
                raporAramaKimlikNo.setRaporBitTar(person.getRAPORBITTAR());
                raporAramaKimlikNo.setIsvereneBildirildigiTarih(person.getISVERENEBILDIRILDIGITARIH());
                raporAramaKimlikNo.setBashekimOnayTarihi(person.getBASHEKIMONAYTARIHI());
                raporAramaKimlikNo.setTesisKodu(person.getTESISKODU());
                raporAramaKimlikNo.setTesisAdi(person.getTESISADI());

            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }

        return new SuccessDataResult<RaporAramaKimlikNo>(raporAramaKimlikNo, "Raporlar Tarih İle Listelendi");
    }
}
