class Solution:
    def convert(self, s: str, numRows: int) -> str:
        rows = [""]*numRows
        row  = 0
        inc  = 1
        for i in range(len(s)):
            if(row == 1):
                inc =1
            if(row == numRows):
                inc =-1
            row = row + inc
            if(row<0):
                row = 0
            if(row>numRows):
                row = numRows
            rows[row-1]+=s[i]
        return "".join(rows)
