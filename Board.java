class Board{
    protected char[][] grid;
    public Board(){
        grid = new char[][]{{' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}};
    }
    public void display_board(){
        System.out.println("_______");
        for (int i = 0; i < 3; i++) {
            System.out.print('|');
            for (int j = 0; j < 3; j++) {
                System.out.print((grid[i][j]));
                System.out.print('|');
            }
            System.out.println("\n_______");

        }
    }
    public void update_board(int x, int y, char symbol){
        grid[x][y] = symbol;
    }
    public boolean is_winner()
    {
        //row win
        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < 2; j++)
            {

                if((grid[i][j] == grid[i][j+1])&&(grid[i][j]!='-'))
                {
                    if (j!=1)
                        continue;
                    else if (j==1)
                    {
                        return true;
                    }
                }

            }
        }
        //col win
        int j=0;
        for (int i = 0; i < 2; i++)
        {
            if ((grid[i][j]==grid[i+1][j])&&(grid[i][j]!='-'))
            {
                if (i!=1)
                {
                    j++;
                    continue;
                }
                else if (i==1)
                    return true;
            }
        }
        //diagonal win
        if (((grid[0][0]==grid[1][1])&&(grid[0][0]==grid[2][2]))||(grid[0][2]==grid[1][1])&&(grid[0][2]==grid[2][0]))
        {
            if (grid[1][1]!='-')
                return true;
        }
        return false;
    }
    public boolean is_draw()
    {
        boolean result=is_winner();
        if (result==false)
            return false;
        return true;
    }
}
