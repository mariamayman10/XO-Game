import java.util.Scanner;

class Player extends Board{
    protected String Name;
    protected char Symbol;
    public Player(String name, char symbol){
        Name = name;
        Symbol = symbol;
    }

    public boolean get_move(int x, int y){
        if (x<3 && y<3){
            if(grid[x][y] == ' '){
                update_board(x,y,this.getSymbol());
                return true;
            }
        }
        return false;
    }

    public char getSymbol(){
        return Symbol;
    }
    public String getName(){
        return Name;
    }
}
