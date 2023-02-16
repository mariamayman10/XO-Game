import java.util.Scanner;

class Game extends Board{
    Player[] players;
    public Game(){
        Scanner in = new Scanner(System.in);
        String n1, n2;
        char s1, s2;
        players = new Player[2];
        System.out.print("Enter the Name of the first player: ");
        n1 = in.next();
        System.out.print("Enter the Symbol of the first player: ");
        s1 = in.next().charAt(0);
        if(s1 != 'X' && s1 != 'O'){
            System.out.println("Invalid Symbol");
            System.out.print("Enter the Symbol of the first player: ");
            s1 = in.next().charAt(0);
        }
        Player p1 = new Player(n1, s1);
        players[0] = p1;
        System.out.print("Enter the Name of the second player: ");
        n2 = in.next();
        System.out.print("Enter the Symbol of the second player: ");
        s2 = in.next().charAt(0);
        if(s2 == s1 || (s2 != 'X' && s2 != 'O')){
            System.out.println("Invalid Symbol");
            System.out.print("Enter the Symbol of the second player: ");
            s2 = in.next().charAt(0);
        }
        Player p2 = new Player(n2, s2);
        players[1] = p2;
    }
    public void play_game(){
        while(!is_draw() && !is_winner()){
            for (Player i:players) {
                //take x, y
                //call get move for i
                //call is winner
                //call is draw
            }
        }
    }

}
