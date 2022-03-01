/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* countBits(int n, int* returnSize){
    *returnSize = n+1;
    int * count = (int*)malloc((n+1)*sizeof(int));
    count[0] = 0;
    for(int i=1;i<n+1;i++){
        count[i] = 1+count[i&(i-1)];
    }
    return count;
}
