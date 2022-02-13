package unit;
import guns.CannonGun;

public abstract class Unit {
    private CannonGun cannonGun;
    private int experiance =0;

    public Unit(CannonGun cannonGun){
        this.cannonGun = cannonGun;
    }

    public CannonGun getCannonGun() {
        return cannonGun;
    }


    public void addPower(int power) {
        int currentValue = getCannonGun().getPower();
        getCannonGun().setPower(currentValue+power);
    }

    public void subtractPower(int power) {
        getCannonGun().setPower(cannonGun.getPower()-power);
    }

    public int getExperiance() {
        return experiance;
    }

    public void setExperiance(int experiance) {
        this.experiance = experiance;
    }
}
