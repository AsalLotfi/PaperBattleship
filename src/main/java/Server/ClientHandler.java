package Server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientHandler implements Runnable {
    private Socket client;
    private DataInputStream in;
    private DataOutputStream out;
    private boolean isFirst;
    private String username;
    ClientHandler enemy;

    public void print(String requst) {
        //TODO: write to output
    }

    public void setEnemy(ClientHandler enemy) throws IOException {
        this.enemy = enemy;
    }
    public String getUsername()
    {
        return username;
    }

    public ClientHandler(Socket client, boolean isFirst) throws IOException {
        //initialize client
        //initialize in
        //initialize out
        //initialize isFirst
    }

    public void run() {
        try {
            while(true) {
                // TODO: Read a UTF-encoded string from the client
                String request = "";

                if (false) { //TODO: Set Username
                    int playerNumber = isFirst?0:1;
                    // TODO: Send player number to client

                    username = "";//TODO extract username
                    //TODO: wait till enemy is specified
                    //TODO: tell the clients that the other player joined
                }
                else if (false) { //TODO: Handle Attack

                    int row = 0;//TODO: extract row and col
                    int col = 0;//TODO: extract row and col

                    //TODO: inform enemy of the attack
                }
                else if (false) { //TODO: Handle Hit Result
                    //TODO: inform the enemy of the hit result
                }
            }
        } finally
        {
            // close in
            // close out
            // close client
        }
    }
}