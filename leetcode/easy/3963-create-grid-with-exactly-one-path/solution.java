class Solution {
    public String[] createGrid(int m, int n) {
        String[] grid = new String[m];

        for (int r = 0; r < m; r++) {
            StringBuilder row = new StringBuilder();

            for (int c = 0; c < n; c++) {
                if (r == 0 || c == n - 1) {
                    row.append('.');
                } else {
                    row.append('#');
                }
            }

            grid[r] = row.toString();
        }

        return grid;
    }
}