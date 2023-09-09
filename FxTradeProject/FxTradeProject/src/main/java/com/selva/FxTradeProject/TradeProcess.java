package com.selva.FxTradeProject;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/trade")
public class TradeProcess {

    private List<TradeDetails> tradeList = new ArrayList<>();

    @PostMapping("/trade_save")
    public String tradeInformation(@RequestBody TradeDetails trade) {
        trade.bookTrade(trade);
        tradeList.add(trade);
        return "Your trade is received " +"\n"+ trade.showDetails();
    }

    @GetMapping("/trade_details")
    public List<TradeDetails> getAllTradeDetails(){
        return tradeList;
    }
    
    @GetMapping("/trade_exit")
    public String exitTrade(@RequestBody TradeDetails trade) {
    return trade.exitTrade();
}
}



