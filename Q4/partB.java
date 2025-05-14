public boolean clearPair(int row, int col) {
    int targetValue = puzzle[row][col];
    for (int i = row; i < puzzle.length; i++) {
        for (int j = (i == row) ? col + 1 : 0; j < puzzle[i].length; j++) {
            if (puzzle[i][j] != 0 && (puzzle[i][j] == targetValue || puzzle[i][j] + targetValue == 10)) {
                puzzle[row][col] = 0;
                puzzle[i][j] = 0;
                return true;
            }
        }
    }
    return false;
}
