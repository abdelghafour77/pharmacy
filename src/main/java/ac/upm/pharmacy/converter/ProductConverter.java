package ac.upm.pharmacy.converter;

import ac.upm.pharmacy.controller.dto.ProductDto;
import ac.upm.pharmacy.model.Product;
import org.modelmapper.ModelMapper;
import org.modelmapper.config.Configuration;
import org.springframework.stereotype.Component;

@Component
public class ProductConverter extends AbstractConverter<Product, ProductDto> {
    private final ModelMapper modelMapper;

    public ProductConverter(ModelMapper modelMapper) {
        modelMapper.getConfiguration()
                .setFieldMatchingEnabled(true)
                .setFieldAccessLevel(Configuration.AccessLevel.PRIVATE);
        this.modelMapper = modelMapper;
    }

    @Override
    public Product convertToDM(ProductDto productDto) {
        return modelMapper.map(productDto, Product.class);
    }



    @Override
    public ProductDto convertToDTO(Product product) {
        return modelMapper.map(product, ProductDto.class);
    }
}
