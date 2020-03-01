import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class PassengerShip extends Ship {

    int passengers = 0; // количеств пассажиров
    int generals = 0; // количество генералов

    public PassengerShip(String name) {
        super(100, name, "white", 0);
        System.out.println("Построился пассажирский корабль");
    }

    // посадка пассажиров
    public void landing(int newPassengers) {
        this.passengers = newPassengers;
        System.out.println("Теперь на корабле " + this.passengers + " пассажиров");
    }

    public void debarkation(){
        this.passengers = 0;
        this.generals = 0;
        System.out.println("Произошла высадка пассажиров");
    }

    // посадка пассажиров с генералами
    public void landing(int newPassangers, int newGenerals) {
        this.passengers = newPassangers;
        this.generals = newGenerals;
        System.out.println("Теперь на корабле " + this.passengers + " пассажиров и " + this.generals + " генералов");
    }

    // показ количества пассажиров
    public int getPassengers() {
        return this.passengers;
    }

    // показ герба у пассажирского корабля
    @Override
    public void showGerb() {
        System.out.println("Корабль " + this.name + " показывает пассажирский герб");
    }


}
