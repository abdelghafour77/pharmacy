package ac.upm.pharmacy.controller;

import ac.upm.pharmacy.controller.dto.StockDto;
import ac.upm.pharmacy.model.Stock;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("stock")
public class StockController {
    final StockService stockService;
    final StockConverter stockConverter;

    public StockController(StockService stockService, StockConverter stockConverter) {
        this.stockService = stockService;
        this.stockConverter = stockConverter;
    }
    @PostMapping("/")
    public ResponseEntity<StockDto> save(@RequestBody Stock stock){
        StockDto personDto = new StockDto();
        StockDto.setId(1L);
        StockDto.setReference(stock.getReference()+ " UPM");
        StockDto.setQuantity(stock.getQuantity());
        StockDto.setExp_date(stock.getExp_date());

        return ResponseEntity.status(HttpStatus.CREATED).body(personDto);
    }
}
