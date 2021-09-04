package com.karadag.sgkbasic.core;

import com.karadag.sgkbasic.entities.LoginInformation;
import com.karadag.sgkbasic.uygSgkService.CevapLogin;
import com.karadag.sgkbasic.uygSgkService.ViziteGonderSoapBindingStub;

import java.rmi.RemoteException;

public class Login {

    public String getToken(LoginInformation loginInformation) {
        try {
            ViziteGonderSoapBindingStub viziteGonderSoapBindingStub = new ViziteGonderSoapBindingStub();
            CevapLogin cevapLogin = viziteGonderSoapBindingStub.wsLogin(loginInformation.getKullaniciAdi(), loginInformation.getIsyeriKodu(), loginInformation.getIsyeriSifresi());
            return cevapLogin.getWsToken();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return null;

    }

}
