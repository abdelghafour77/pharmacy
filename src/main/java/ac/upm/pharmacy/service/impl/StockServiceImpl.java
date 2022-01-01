package ac.upm.pharmacy.service.impl;

import lombok.AllArgsConstructor;
import ac.upm.pharmacy.model.Stock;
import ac.upm.pharmacy.repository.StockRepository;
import ac.upm.pharmacy.service.StockService;
import org.springframework.stereotype.Service;


@Service
public class StockServiceImpl {
    final StockRepository stockRepository;

    public StockServiceImpl(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

//    @Override
//    public Stock save(Stock stock) {
//        return stockRepository.save(stock);
//    }
}
