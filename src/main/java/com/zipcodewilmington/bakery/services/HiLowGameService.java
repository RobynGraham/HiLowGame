package com.zipcodewilmington.bakery.services;

import com.zipcodewilmington.bakery.models.HiLowGame;
import com.zipcodewilmington.bakery.repositories.HiLowGameRepositary;

public class HiLowGameService {
    private HiLowGameRepositary repositary;

    public HiLowGameService(HiLowGameRepositary repositary) {
        this.repositary = repositary;
    }
    public HiLowGame show(Long gameid){
        return (HiLowGame) repositary.findById(gameid).get();
    }
    public HiLowGame create(HiLowGame hiLowGame){
        return (HiLowGame) repositary.save(hiLowGame);
    }
    public Boolean delete(Long gameid){
        repositary.deleteById(gameid);
        return true;
    }
    public HiLowGame update(Long gameid, HiLowGame newHiLowGame){
        HiLowGame originalHiLow = (HiLowGame) repositary.findById(gameid).get();
    return (HiLowGame) repositary.save(originalHiLow);
    }
}
