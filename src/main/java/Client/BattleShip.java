package Client;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BattleShip {
    static final Map<String, Integer> ships = Map.of(
            "Carrier", 5,
            "Battleship", 4,
            "Cruiser", 3,
            "Submarine", 3,
            "Destroyer", 2
    );

    private final int length;
    private final String type;
    private final List<BattleShipCell> cellsInBoard = new ArrayList<>();

    public BattleShip(String type) {
        this.type = type;
        if(ships.get(type) == null)
        {
            System.out.println("SHIP NOT FOUND");
        }
        length = ships.get(type);
    }

    public void addShipCell(BattleShipCell cell){
        cellsInBoard.add(cell);
    }
    public boolean isAllHit() {
        for (BattleShipCell cell : cellsInBoard) {
            if (!cell.isMarked())
                return false;
        }
        return true;
    }

    public int getLength() {
        return length;
    }

    public String getType() {
        return type;
    }
}
