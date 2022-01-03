package ac.upm.pharmacy.converter;

import ac.upm.pharmacy.dto.ProductDTO;
import ac.upm.pharmacy.model.Product;
import org.modelmapper.ModelMapper;
import org.modelmapper.config.Configuration;
import org.springframework.stereotype.Component;

@Component
public class ProductConverter extends AbstractConverter<Product, ProductDTO> {
    private final ModelMapper modelMapper;

    public ProductConverter(ModelMapper modelMapper) {
        modelMapper.getConfiguration()
                .setFieldMatchingEnabled(true)
                .setFieldAccessLevel(Configuration.AccessLevel.PRIVATE);
        this.modelMapper = modelMapper;
    }

    @Override
    public Product convertToDM(ProductDTO productDTO) {
        return modelMapper.map(productDTO, Product.class);
    }



    @Override
    public ProductDTO convertToDTO(Product product) {
        return modelMapper.map(product, ProductDTO.class);
    }
}
