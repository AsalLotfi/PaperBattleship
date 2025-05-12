package Client;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Objects;

public class BattleShipClientNetworkHandler implements Runnable{
    private BattleShipClient client;
    private DataInputStream in;

    public BattleShipClientNetworkHandler(Socket clientSocket, BattleShipClient client) throws IOException {
        // initialize client
        // initialize in
    }
    @Override
    public void run() {
        while(true) {
                //TODO: get response
                String response = "";

                if(false) // TODO: set player number ( 0 or 1)
                {
                    int number = 0;
                    client.setPlayerNumber(number);
                }
                else if(false) // TODO: other player joined the game
                {
                    client.setOtherPlayerJoined();
                }
                else if(false){ // TODO: handle incoming hit
                    int row = 0; //TODO: extract row
                    int col = 0; //TODO: extract col
                    String message = client.getHit(row, col);

                }
                else if(false) //TODO: handle hit result from opponent
                {
                    client.setEnemyResult(false, "NONE");
                }
            }
        }
    }
