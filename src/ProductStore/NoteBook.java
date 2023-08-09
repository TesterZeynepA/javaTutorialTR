package ProductStore;

import java.util.Scanner;

import static ProductStore.DataBase.input;

public class NoteBook extends ProductAbstract{
//simdi notebook islemleri yapilacak
    //yarin phone eklemek istersniz phone class create edin
    // abstract class i extends etmeniz yeterli

    @Override
    public void menu() throws InterruptedException {
        System.out.println(" ============= ISLEMLER =============\n" +
                "         1-addItem    *** create\n" +
                "         2-getProducts   *** read\n" +
                "         3-delete        *** delete\n" +
                "         4-ANA MENU    ***   menu\n" +
                "         5-CIKIS     ***  exit");
        System.out.println("secim yap");
        int secim =input.nextInt();
        switch (secim){
            case 1:
                addItem();
                menu();
                break;
            case 2:
                getProducts();
                menu();
                break;
            case 3:
                delete();
                menu();
                break;
            case 4:
                Store st=new Store();
                st.anaMenu();
                break;
            case 5:
                cikis();
                break;
            default:
                System.out.println("yanlis tuslama tekkrar dene");
                menu();
        }







    }


    @Override
    public void addItem() {

        System.out.println("urun ekleme sayfasına hoşgeldiniz");
        System.out.println("ürün adı giriniz");
        String name = new Scanner(System.in).nextLine();
        System.out.println("price giriniz");
        double price = input.nextDouble();

        System.out.println("urun discountRate giriniz");
        double discountRate = input.nextDouble();

        System.out.println("urun amount giriniz");
        int amount = input.nextInt();

        System.out.println("urun için uygun brand i listeden seçiniz");
        Brand.printBrands();//map deki tum brand leri gösterecek.

        System.out.println("urunun brand id sini listeden giriniz");

        int brandId = input.nextInt();
        Brand brand = Brand.getBrandById(brandId);

        System.out.println("screen size giriniz");
        double screenSize = input.nextDouble();

        System.out.println("urun ram giriniz");
        int ram = input.nextInt();

        System.out.println("urun memory giriniz");
        int memory = input.nextInt();

        Product notebook = new Product(name, price, discountRate,amount, brand, screenSize, ram, memory);

        DataBase.productList.add(notebook);

        System.out.println("eklenen urun " + notebook.getName());
        System.out.println("notebook = " + notebook);


    }

    @Override
    public void getProducts() {
        System.out.println("DataBase.productList = " + DataBase.productList);
       // DataBase.productList.stream().sorted().forEach(System.out::println);

    }

    @Override
    public void delete() {

    }



    @Override
    public void cikis() {

    }
}
