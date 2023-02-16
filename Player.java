import java.util.Scanner;

class Player extends Board{
    protected String Name;
    protected char Symbol;
    public Player(String name, char symbol){
        Name = name;
        Symbol = symbol;
    }
    public void get_move(int x, int y){
        Scanner in = new Scanner(System.in);
        while(x > 2 || y > 2){
            System.out.println("Invalid Coordinate");
            System.out.print("Enter x: ");
            x = in.nextInt();
            System.out.print("\nEnter y: ");
            y = in.nextInt();
        }
        if(grid[x][y] != ' '){
            System.out.println("Invalid Coordinate");
            System.out.print("Enter x: ");
            x = in.nextInt();
            System.out.print("\nEnter y: ");
            y = in.nextInt();
        }
        update_board(x, y, this.Symbol);
    }
    public char getSymbol(){
        return Symbol;
    }
    public String getName(){
        return Name;
    }
}
