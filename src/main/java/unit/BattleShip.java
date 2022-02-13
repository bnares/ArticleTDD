package unit;

import guns.CannonGun;

public class BattleShip{

    private CannonGun cannonGun;

    public BattleShip(CannonGun cannonGun ) {
        this.cannonGun = cannonGun;
    }

    public CannonGun getCannonGun() {
        return this.cannonGun;
    }


    public void addPower(int power) {
        cannonGun.setPower(cannonGun.getPower()+power);
    }

    public void subtractPower(int power) {
        cannonGun.setPower(cannonGun.getPower()-power);
    }
}
