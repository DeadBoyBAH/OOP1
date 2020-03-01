import java.sql.SQLOutput;

public class TradeShip extends Ship {

    int cargo = 0; // количество груза


    public TradeShip(String name) {
        super(20, name, "yellow", 0);
        System.out.println("Построился торговый корабль");
    }

    // погрузка товара
    public void shipment(int newCargo) {
        this.cargo = newCargo;
        System.out.println("На корабль погружено " + this.cargo + " груза");
    }

    public void unloading() {
        this.cargo = 0;
        System.out.println("Корабль " + this.name + " разгружен");
    }

    // показ герба у торгового корабля
    @Override
    public void showGerb() {
        System.out.println("Корабль " + this.name + " показывает торговый герб");
    }

}
