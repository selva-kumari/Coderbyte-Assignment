package com.selva.FxTradeProject;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/trade")
public class TradeController {

    private List<Trade> tradeList = new ArrayList<>();

    @PostMapping("/book_trade")
    public String tradeInformation(@RequestBody Trade trade) {
        trade.bookTrade(trade);
        tradeList.add(trade);
        return "Your trade is received " +"\n"+ trade.showTradeDetails();
    }

    @GetMapping("/print_trade")
    public List<Trade> getAllTradeDetails() {
        return tradeList;
    }
    
    @GetMapping("/exit_trade")
    public String exitTrade(@RequestBody Trade trade) {
    return trade.exitTrade();
}
}



