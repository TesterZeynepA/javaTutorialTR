package Project3;

import java.time.LocalDateTime;


public class Kullanıcı {//task 1. step kullanıcı obj uretecek kalıphane class -> main olmaz

    String name;
    LocalDateTime kayitZamani;

   // public Kullanıcı() {
   //
   // }

    public Kullanıcı(String name, LocalDateTime kayitZamani) {//obj üretecek full p li telescopic const
        this.name = name;
        this.kayitZamani = kayitZamani;

    }

    @Override
    public String toString() {//obj field larını stringe çeviren method
        return "Kullanıcı{" +
                "name='" + name + '\'' +
                ", kayitZamani=" + kayitZamani +
                '}';
    }
}