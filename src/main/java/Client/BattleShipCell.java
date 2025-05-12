package Client;

import Client.utils.AnsiColor;

public class BattleShipCell {
    private BattleShip battleShip;
    private boolean isMarked;
    private boolean isEnemyShip;
    public BattleShipCell()
    {
        this.isEnemyShip = false;
        this.isMarked = false;
    }

    public boolean isMarked() {
        return isMarked;
    }
    public void setMarked(boolean value) {
        isMarked = value;
    }
    public boolean isShip() {
        return battleShip != null || isEnemyShip;
    }
    public BattleShip getBattleShip() {
        return battleShip;
    }
    public void setBattleShip(BattleShip battleShip) {
        this.battleShip = battleShip;
    }
    public void setEnemyShip(boolean value) {
        this.isEnemyShip = value;
    }

    @Override
    public String toString() {
        if(isMarked){
            return (isShip())? AnsiColor.RED + "X" + AnsiColor.RESET: AnsiColor.BLUE + "O" + AnsiColor.RESET;
        }
        if(isShip())
        {
            return AnsiColor.WHITE + "S" + AnsiColor.RESET;
        }
        return AnsiColor.GRAY + "." + AnsiColor.RESET;
    }

}
