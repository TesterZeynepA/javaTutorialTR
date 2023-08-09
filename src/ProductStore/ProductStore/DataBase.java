package ProductStore.ProductStore;

import ProductStore.Brand;
import ProductStore.Product;

import java.util.*;

public interface DataBase {//bu interface database mis gibi kullanilcak burdaki collection ve map lerde tutulacak objeler



    List<Brand> brandList= new ArrayList<>();
    List<Product> productList= new ArrayList<>();

    Map<Long , Brand> mapBrand = new HashMap<>();
    Map<Long , Product> mapProduct = new HashMap<>();

    Map<Brand , Product> mapBrandAndProduct = new HashMap<>();
    //brand ve notebooklari olusturuduktan sonra bu map de tutabilirsiniz

    Scanner input =new Scanner(System.in);

}
