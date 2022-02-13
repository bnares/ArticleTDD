package upgradeUnit;

import guns.CannonGun;
import org.junit.jupiter.api.Test;
import unit.Tank;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

class UpgradeUnitTest {

    @Test
    void UnitShouldGet20ExperiancePointsWithMock(){
        //given
        IsExperianceSufficient isExperianceSufficient = mock(IsExperianceSufficient.class);
        UpgradeUnit upgradeUnit = new UpgradeUnit(isExperianceSufficient);
        Tank tank = new Tank(new CannonGun(10));
        given(isExperianceSufficient.isExperianceHigherThanShould()).willReturn(true);
        //when
        upgradeUnit.setHigherExperiance(tank);
        //then
        assertThat(tank.getExperiance(), equalTo(20));
    }

    @Test
    void UnitShouldGetExtra20ExperiancePointsWithStub(){
        //given
        ExperianceStub experianceStub = new ExperianceStub();
        UpgradeUnit upgradeUnit = new UpgradeUnit(experianceStub);
        Tank tank = new Tank(new CannonGun(10));
        //when
        upgradeUnit.setHigherExperiance(tank);
        //then
        assertThat(tank.getExperiance(), equalTo(20));
    }
}