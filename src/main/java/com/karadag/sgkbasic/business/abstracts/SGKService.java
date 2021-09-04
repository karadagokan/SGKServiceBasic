package com.karadag.sgkbasic.business.abstracts;

import com.karadag.sgkbasic.core.Result.DataResult;
import com.karadag.sgkbasic.entities.LoginInformation;
import com.karadag.sgkbasic.entities.RaporAramaKimlikNo;
import com.karadag.sgkbasic.entities.RaporAramaTarihle;

import java.util.List;

public interface SGKService {

    DataResult<String> login(LoginInformation loginInformation);

    DataResult<List<RaporAramaTarihle>> raporAramaTarihleList(String date);

    DataResult<RaporAramaKimlikNo> raporAramaTCKimlikNo(String tcKimlikNo);

}
