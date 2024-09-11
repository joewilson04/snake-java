public class Board {
    
    final int ROW_COUNT, COL_COUNT;
    private Cell[][] cells;

    public Board(int rowCount, int colCount)
    {
        ROW_COUNT = rowCount;
        COL_COUNT = colCount;

        cells = new Cell[ROW_COUNT][COL_COUNT];
        for (int row = 0; row < ROW_COUNT; row++) {
            for (int col = 0; col < COL_COUNT; col++) {
                cells[row][col] = new Cell(row, col);
            }
        }
    }

    public Cell[][] getCells() { return cells; }

    public void setCells(Cell[][] cells)
    {
        this.cells = cells;
    }

    public void generateFood()
    {
        System.out.println("Going to generate food");
        int row = 0, col = 0;
        while (true) {
            row = (int)(Math.random() * ROW_COUNT);
            col = (int)(Math.random() * COL_COUNT);
            if (cells[row][col].getCellType()
            != CellType.SNAKE_NODE)
            break;
        }
        cells[row][col].setCellType(CellType.FOOD);
        System.out.println("Food is generated at: "+row +" "+col);
    }

}
