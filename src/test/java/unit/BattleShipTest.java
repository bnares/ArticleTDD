package unit;

import guns.CannonGun;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.*;

class BattleShipTest {

    @Test
    void addingTankGunShouldChangeGunPower(){
        //given
        BattleShip battleShip = new BattleShip(new CannonGun(20));
        //when
        battleShip.addPower(20);
        //then
        assertThat(battleShip.getCannonGun().getPower(), equalTo(40));
    }

    @Test
    void removingTanGUnShouldDecreaseGunPower(){
        //given
        BattleShip battleShip = new BattleShip(new CannonGun(50));
        //when
        battleShip.subtractPower(22);
        //then
        assertThat(battleShip.getCannonGun().getPower(), equalTo(28));
    }

}