/** File: Week11/Lab11Sol/PVLife.java Conway's Life @PV Pho Vu
 * My version of the game of life.
 * Play/ find the parameters of the "game of life" in Life.java
 * Initialize() is a function
 * Draw the lines
 * Each generation has its own color
 */
public class PVLife { // declare public class
    static int n = 60;//number of cells: n x n global variable

    public static void main(String[] args) {
        int cellSize = 20;   // should be an even number
        StdDraw.enableDoubleBuffering();
        StdDraw.setCanvasSize(n * cellSize, n * cellSize); // 20 x 10 = 200
        StdDraw.setScale(0, n * cellSize);
        int[][] Cells = new int[n][n]; // world of cells n x n
        for (int i = 1; i < n-1; i++){// border is Zero!
            for (int j = 1; j < n-1; j++){ // random 0 or 1 in a
                Cells[i][j] = (int) (Math.random() * 2);}}
        while (true) {  //  draw, pause, and update the world
            StdDraw.setPenColor(rand256(), rand256(), rand256());// black color of squares
            drawCells(Cells, cellSize);
            StdDraw.pause(50);//milliseconds
            Cells = update(Cells);
        }
    }//main
    static void GridLines(int size) {
        int width = n * size; // canvas size
        for (int i = 0; i < n; i++) {
            StdDraw.line(i * size, 0, i * size, width); // vertical lines
            StdDraw.line(0, i * size, width, i * size); // vertical lines
        }
    }
    static int rand256() {// (0, 256))}
        return (int) (Math.random() * 256);
    }

    static void drawCells(int[][] Cells, int size) { // gives randm values 0/1 to cells
        int w = size / 2;
        StdDraw.clear();
        GridLines(size);
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (Cells[r][c] == 1)//black if alive
                    StdDraw.filledSquare(w + c * size, w + r * size, w);
            }
        }
        StdDraw.show();
    }//drawCells
    static int[][] update(int[][] Cells) {
        int[][] newCells = new int[n][n];//initialize by zero
        for (int r = 1; r < n-1; r++) {
            for (int c = 1; c < n-1; c++) {
                int alive = countAlive(Cells, r, c);//count aliveNeighbors
                if (Cells[r][c] == 1 && (alive == 2 || alive == 3) )
                    newCells[r][c] = 1;
                else if (alive == 3) { newCells[r][c] = 1;}
            }
        }  return newCells;
    }//update
    static int countAlive(int[][] Cells,int x, int y){ // finding #Neighbours that are alive
        int count = 0;// #aliveNeighbours
        for (int i = -1; i <= 1; i++) {// -1,0,1
            for (int j = -1; j <= 1; j++){//-1,0,1
                count += Cells[x + i][y + j];//add values for all neighbors
            }} //this is why we are actually making a zero border!
        return count - Cells[x][y]; //delete the original cell
    }//alive
}//class