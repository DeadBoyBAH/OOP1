public class Ship {
    public boolean isMoving = false; // признак движения
    public int size; // размер
    public String name; // имя
    public String color; // цвет
    public int speed; // скорость корабля

    public Ship(int size, String name, String color, int speed) {
        this.size = size;
        this.name = name;
        this.color = color;
        this.speed = speed;
    }

    // движение корабля
    public void move(final int newSpeed) {
        System.out.println("Корабль " + this.name + " поплыл");
        this.isMoving = true;
        this.speed = newSpeed;
    }

    // остановка корабля
    public void stop() {
        System.out.println("Корабль " + this.name + " остановился");
        this.isMoving = false;
        this.speed = 0;
    }

    // показ, движется ли корабль
    public boolean isMoving() {
        return this.speed > 0;
    }

    // получение скорости корабля
    public int getSpeed() {
        if (this.speed > 0) {
            return this.speed;
        } else {
            return 0;
        }
    }

    public void showGerb() {
        System.out.println("Корабль " + this.name + " показывает герб");
    }


}
