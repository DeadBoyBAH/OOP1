public class CombatShip extends Ship {

    int damage; // урон корабля
    int guns; // количество пушек
    boolean isAttacking = false; // режим атаки

    public CombatShip(String name, int damage, int guns) {
        super(100, name, "black", 0);
        System.out.println("Построился боевой корабль");
        this.damage = damage;
        this.guns = guns;
    }

    // включение режима атаки
    public void attackOn() {
        System.out.println("Пушки заряжены");
        this.isAttacking = true;
    }

    // выключение режима атаки
    public void attackOff() {
        System.out.println("Пушки освобождены");
    }

    // показ герба у боевого корабля
    @Override
    public void showGerb() {
        System.out.println("Корабль " + this.name + " показывает боевой герб");
    }

}
