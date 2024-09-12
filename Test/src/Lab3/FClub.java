package Lab3;

import java.util.*;

class Player{
    String name;
    String position;
    int number;
    boolean isInjured;

    public Player() {}

    public Player(String name, String position, int number, boolean isInjured) {
        this.name = name;
        this.position = position;
        this.number = number;
        this.isInjured = isInjured;

    }

    String getPlayerData(){
        return ("Name: " + name + ", Position:" + position + ", Number: " + number);
    }
}

class Club{
    String name;
    Player[] players;

    public Club(){}
    public Club(String name, Player[] players) {
        this.name = name;
        this.players = players;
    }

    void printClubData(){
        System.out.println("Club: " + name);
        System.out.println("Players:");
        for(Player player : players){
            System.out.println("****" + player.getPlayerData() + " - Injured: " + player.isInjured);
        }
    }
    void printSquad(){
        for(Player player : players){
            if(!player.isInjured){
                System.out.println(player.number + " " + player.name + " " + player.position);
            }
        }
    }
}
public class FClub {
    public static void main(String[] args) {
        Player player1 = new Player("Neuer", "GK", 1, false);
        Player player2 = new Player("Carvajal", "RB", 2, true);
        Player player3 = new Player("Ramos", "CDF", 4, false);
        Player player4 = new Player("Kante", "CB", 6, true);
        Player player5 = new Player("Griezmann", "FWD", 7, false);

        Player[] players1 = {player1, player2, player3, player4, player5};

        Club club1 = new Club("Club1", players1);

        Player player6 = new Player("zxcv", "GK", 8, false);
        Player player7 = new Player("asd", "RB", 6, false);
        Player player8 = new Player("qwer", "CDF", 4, false);
        Player player9 = new Player("grs", "CB", 7, true);
        Player player10 = new Player("sgdf", "FWD", 3, true);

        Player[] players2 = {player6, player7, player8, player9, player10};

        Club club2 = new Club("Club2", players2);

        club1.printClubData();
        System.out.println("*************************************************");
        club2.printClubData();
        System.out.println("---------------------------------------------------");
        club1.printSquad();
        System.out.println("*************************************************");
        club2.printSquad();

    }
}


