package ch32_Enum.enum01;

public class Runner {

    public static void main(String[] args) {
        //Task -> enum dan alacaginiz objeden  ay
// ismine göre kaç gün çektiğini
// print eden code create ediniz

        Aylar ay= Aylar.KASIM;

        System.out.println("ay = " + ay);//ay = KASIM

        System.out.println("ay.name() = " + ay.name());//ay.name() = KASIM

        System.out.println("ay.hashCode() = " + ay.hashCode());//ay.hashCode() = 1595953398

        System.out.println("ay.ordinal() = " + ay.ordinal());//ay.ordinal() = 10

        switch (ay){

            case OCAK:
                System.out.println("31 gun icerir");
                break;
            case SUBAT:
                System.out.println("subat 28 gundur");
                break;
            case MART:
                System.out.println("mart31 gun olur");
                break;
            case KASIM:
                System.out.println("Kasım 30 gundur");
                break;
            default:
                System.out.println("Yanlış ay girdiniz");
                break;
        }




    }
}
