package uygulamalar;

import entity.Urun;
import entityservice.UrunEntityService;

public class FindById {
    public static void main(String[] args) {
        UrunEntityService service = new UrunEntityService();
        Urun urun = service.findById(1L);

        System.out.println(urun);
    }
}