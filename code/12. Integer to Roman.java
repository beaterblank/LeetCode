class Solution {
    public String intToRoman(int num) {
        String results = "";
        while (num >= 1) {
            if (num >= 1000){results += 'M';num -= 1000;}
            else if (num >= 900) {results += "CM";num -= 900;} 
            else if (num >= 500) {results += 'D';num -= 500;}
            else if (num >= 400) {results += "CD";num -= 400;} 
            else if (num >= 100) {results += 'C';num -= 100;}
            else if (num >= 90) {results += "XC";num -= 90;}
            else if (num >= 50) {results += 'L';num -= 50;}
            else if (num >= 40) {results += "XL";num -= 40;}
            else if (num >= 10) {results += 'X';num -= 10;}
            else if (num >= 9) {results += "IX";num -= 9;}
            else if (num >= 5) {results += 'V';num -= 5;}
            else if (num >= 4) {results += "IV";num -= 4;}
            else if (num >= 1) {results += 'I';num -= 1;}
        }
        return results;
    }
}
