package de.htwberlin.webtech.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class InstrumentController {

    @GetMapping("/instruments")
    public List<Instrument> getInstruments() {
        List<Instrument> list = new ArrayList<>();
        list.add(new Instrument(1L, "AAPL", "Apple", "Stock", 227.45, "Yahoo Finance"));
        list.add(new Instrument(2L, "VWCE", "Vanguard All-World ETF", "ETF", 132.18, "Xetra"));
        list.add(new Instrument(3L, "BTC", "Bitcoin", "Crypto", 67420.50, "CoinGecko"));
        list.add(new Instrument(4L, "EURUSD", "Euro / US Dollar", "Pair", 1.08, "ECB"));
        return list;
    }
}
