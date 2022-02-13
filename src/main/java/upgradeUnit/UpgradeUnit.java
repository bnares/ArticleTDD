package upgradeUnit;

import unit.Unit;

public class UpgradeUnit {

    private int extraExperiancePoints = 20;
    private IsExperianceSufficient isExperianceSufficient;

    public UpgradeUnit(IsExperianceSufficient isExperianceSufficient){
        this.isExperianceSufficient = isExperianceSufficient;
    }

    public void setHigherExperiance(Unit unit){
        if(isExperianceSufficient.isExperianceHigherThanShould()){
            unit.setExperiance(unit.getExperiance()+extraExperiancePoints);
        }
    }
}
