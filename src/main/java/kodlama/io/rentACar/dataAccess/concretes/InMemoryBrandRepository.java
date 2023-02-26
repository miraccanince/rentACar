package kodlama.io.rentACar.dataAccess.concretes;

import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository

public class InMemoryBrandRepository implements BrandRepository {

List<Brand> brands;

    public InMemoryBrandRepository() {
        brands = new ArrayList<>();
        brands.add(new Brand(1,"MERCEDES"));
        brands.add(new Brand(2,"BMW"));
        brands.add(new Brand(3,"FIAT"));
        brands.add(new Brand(4,"RENAULT"));
        brands.add(new Brand(5,"AUIDI"));
    }




    @Override
    public List<Brand> getAll() {
        return brands;
    }
}
