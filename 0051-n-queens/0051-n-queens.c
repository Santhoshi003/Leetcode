#include <stdlib.h>
#include <string.h>
#include <stdbool.h>
void addSolution(int n, int* returnSize, char**** results, int** returnColumnSizes, char** board) {
    (*returnSize)++;
    *results = realloc(*results, (*returnSize) * sizeof(char**));
    (*results)[*returnSize - 1] = malloc(n * sizeof(char*));
    for (int i = 0; i < n; i++) {
        (*results)[*returnSize - 1][i] = strdup(board[i]);
    }
    *returnColumnSizes = realloc(*returnColumnSizes, (*returnSize) * sizeof(int));
    (*returnColumnSizes)[*returnSize - 1] = n;
}
void solve(int row, int n, bool* cols, bool* left_diags, bool* right_diags, 
           char** board, int* returnSize, char**** results, int** returnColumnSizes) {
    if (row == n) {
        addSolution(n, returnSize, results, returnColumnSizes, board);
        return;
    }
    
    for (int col = 0; col < n; col++) {
        int left_diag_index = row - col + n - 1;
        int right_diag_index = row + col;
        
        if (cols[col] || left_diags[left_diag_index] || right_diags[right_diag_index])
            continue; 
        board[row][col] = 'Q';
        cols[col] = left_diags[left_diag_index] = right_diags[right_diag_index] = true;
        solve(row + 1, n, cols, left_diags, right_diags, board, returnSize, results, returnColumnSizes);
        
        board[row][col] = '.';
        cols[col] = left_diags[left_diag_index] = right_diags[right_diag_index] = false;
    }
}

char*** solveNQueens(int n, int* returnSize, int** returnColumnSizes) {
    *returnSize = 0;
    char*** results = NULL;
    *returnColumnSizes = NULL;

    char** board = malloc(n * sizeof(char*));
    for (int i = 0; i < n; i++) {
        board[i] = malloc((n + 1) * sizeof(char));
        memset(board[i], '.', n);
        board[i][n] = '\0'; 
    }
    
    bool* cols = calloc(n, sizeof(bool));
    bool* left_diags = calloc(2 * n - 1, sizeof(bool));
    bool* right_diags = calloc(2 * n - 1, sizeof(bool));
    
    solve(0, n, cols, left_diags, right_diags, board, returnSize, &results, returnColumnSizes);
    
    for (int i = 0; i < n; i++) {
        free(board[i]);
    }
    free(board);
    free(cols);
    free(left_diags);
    free(right_diags);
    
    return results;
}
