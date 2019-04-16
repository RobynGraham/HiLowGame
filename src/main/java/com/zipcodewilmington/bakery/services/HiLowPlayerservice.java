package com.zipcodewilmington.bakery.services;

import com.zipcodewilmington.bakery.models.CardPlayer;
import com.zipcodewilmington.bakery.models.HiLowGame;
import com.zipcodewilmington.bakery.repositories.HiLowPlayerRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HiLowPlayerservice {
    private HiLowPlayerRepositary repositary;
@Autowired
    public HiLowPlayerservice(HiLowPlayerRepositary repositary) {
        this.repositary = repositary;
    }

    public CardPlayer create(CardPlayer hiLowPlayer){
        return (CardPlayer) repositary.save(hiLowPlayer);
    }

    public CardPlayer show(Long gameid , Long accountId){
        return (CardPlayer) repositary.findById(gameid).get();
    }
    public Boolean delete(Long gameid){
        repositary.deleteById(gameid);
        return true;
    }
    public CardPlayer update (Long gameid, CardPlayer newHiLowPlayer){
        CardPlayer originalHiLowPlayer = (CardPlayer) repositary.findById(gameid).get();
        originalHiLowPlayer.setName(newHiLowPlayer.getName());
        originalHiLowPlayer.setAccount(newHiLowPlayer.getAccount());
        return (CardPlayer) repositary.save(originalHiLowPlayer);
    }
}
