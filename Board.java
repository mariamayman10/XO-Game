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
    public boolean is_winner(){
        return false;
    }
    public boolean is_draw(){
        return false;
    }
}
