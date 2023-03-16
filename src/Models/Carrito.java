package Models;

import java.time.LocalDateTime;

public class Carrito {
    private ItemCarrito[] items;
    private LocalDateTime localDateTime;


    public Carrito() {
       this.items = new ItemCarrito[10];
       this.localDateTime = LocalDateTime.now();
    }

    public ItemCarrito[] getItems() {
        return items;
    }


    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public float costoTotal() {
        float total = 0;
        for (int i = 0; i < 5; i++) {
            ItemCarrito item = items[i];
            total += item.costoFinal();
        }

        return total;
    }
}
