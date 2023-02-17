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

    public void play_game(){
        Scanner in = new Scanner(System.in);
        while(!is_draw() && !is_winner()){
            for (Player i:players) {
                int x,y;
                System.out.println(i.Name + ", Enter where you want to place your symbol '" + i.getSymbol() + "':");
                display_board();
                System.out.print("Enter x: ");
                x=in.nextInt();
                System.out.print("\nEnter y: ");
                y=in.nextInt();
                System.out.print('\n');
                boolean r = i.get_move(x, y);
                while (!r){
                    System.out.println("Enter a valid place!");
                    System.out.println(i.Name + ", Enter where you want to place your symbol '" + i.getSymbol() + "':");
                    display_board();
                    System.out.print("Enter x: ");
                    x=in.nextInt();
                    System.out.print("\n" + "Enter y: ");
                    y=in.nextInt();
                    System.out.print('\n');
                    r = i.get_move(x, y);
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
