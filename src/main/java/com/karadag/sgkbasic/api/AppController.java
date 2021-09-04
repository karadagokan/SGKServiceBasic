package com.karadag.sgkbasic.api;

import com.karadag.sgkbasic.business.abstracts.SGKService;
import com.karadag.sgkbasic.core.Result.DataResult;
import com.karadag.sgkbasic.entities.LoginInformation;
import com.karadag.sgkbasic.entities.RaporAramaKimlikNo;
import com.karadag.sgkbasic.entities.RaporAramaTarihle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sgk")
public class AppController {

    SGKService sgkService;

    @Autowired
    public AppController(SGKService sgkService) {
        this.sgkService = sgkService;
    }

    @PostMapping("/login")
    public DataResult<String> login(@RequestBody LoginInformation loginInformation) {
        return sgkService.login(loginInformation);
    }

    @GetMapping("/listTarihle")
    public DataResult<List<RaporAramaTarihle>> raporAramaTarihle(@RequestParam String date) {
        return sgkService.raporAramaTarihleList(date);
    }

    @GetMapping("/listTCKimlikle")
    public DataResult<RaporAramaKimlikNo> raporAramaKimlikNo(@RequestParam String tcKimlikNo) {
        return sgkService.raporAramaTCKimlikNo(tcKimlikNo);
    }


}





