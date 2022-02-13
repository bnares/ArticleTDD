package unit;

import guns.CannonGun;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

class TankTest {

    @Test
    void addingTankGunShouldIncreaseGunPower(){
        //given
        Tank tank = new Tank(new CannonGun(10));
        //when
        tank.addPower(20);
        //then
        assertThat(tank.getCannonGun().getPower(), equalTo(30));
    }

    @Test
    void removingTanGUnShouldDecreaseGunPower(){
        //given
        Tank tank = new Tank(new CannonGun(45));
        //when
        tank.subtractPower(15);
        //then
        assertThat(tank.getCannonGun().getPower(), equalTo(30));
    }

}




