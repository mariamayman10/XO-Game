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
    //////////////////////////////////Aya
     public boolean Move(int x,int y,char i){
        if(grid[x][y]==' ' &&  x<3 && y<3){
            update_board(x,y,i);
            return true;
        }
        return false;
    }
    public void play_game(){
        Scanner in = new Scanner(System.in);
        while(!is_draw() && !is_winner()){
            for (Player i:players) {
                int x,y;
                System.out.println("Enter where you want to place your symbol :");
                display_board();
                x=in.nextInt()-1;
                y=in.nextInt()-1;
                while (!Move(x,y,i.Symbol)){
                    System.out.println("Enter a valid place :");
                    display_board();
                    x=in.nextInt()-1;
                    y=in.nextInt()-1;
                }
                if(is_winner()){
                    System.out.println("Player "+i.Name+" win!");
                    break;
                }
                if(is_draw()){
                    System.out.println("Draw!");
                    break;
                }

            }
        }
    }
}
