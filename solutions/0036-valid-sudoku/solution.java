class Solution {
    public boolean isValidSudoku(char[][] board) {
        char[] el_1=new char[9];
        char[] el_2=new char[9];
        char[] el_3=new char[9];
        char[] el_4=new char[9];
        char[] el_5=new char[9];
        char[] el_6=new char[9];
        char[] el_7=new char[9];
        char[] el_8=new char[9];
        char[] el_9=new char[9];
        List<Character> sq1=new ArrayList<>();
        List<Character> sq2=new ArrayList<>();
        List<Character> sq3=new ArrayList<>();
        for (int i=0;i<board.length;i++){
            List<Character> rowelements=new ArrayList<>();
            for (int j=0;j<board[i].length;j++){
                char cell=board[i][j];
                if (cell=='.') continue;
                if (rowelements.contains(cell)) return false;
                rowelements.add(cell);
                if (cell=='1'){
                    if (el_1[j]==cell) return false;
                    el_1[j]=cell;
                }else if(cell=='2'){
                    if (el_2[j]==cell) return false;
                    el_2[j]=cell;
                }else if(cell=='3'){
                    if (el_3[j]==cell) return false;
                    el_3[j]=cell;                    
                }else if(cell=='4'){
                    if (el_4[j]==cell) return false;
                    el_4[j]=cell;                   
                }else if(cell=='5'){
                    if (el_5[j]==cell) return false;
                    el_5[j]=cell;                   
                }else if(cell=='6'){
                    if (el_6[j]==cell) return false;
                    el_6[j]=cell;                   
                }else if(cell=='7'){
                    if (el_7[j]==cell) return false;
                    el_7[j]=cell;                   
                }else if(cell=='8'){
                    if (el_8[j]==cell) return false;
                    el_8[j]=cell;                    
                }else{
                    if (el_9[j]==cell) return false;
                    el_9[j]=cell;                    
                }
                if (j<3){
                    if(sq1.contains(cell)) return false;
                    sq1.add(cell);
                }else if(j<6){
                    if (sq2.contains(cell)) return false;
                    sq2.add(cell);
                }else{
                    if (sq3.contains(cell)) return false;
                    sq3.add(cell);
                }
            }
            if (i==2 || i==5){
                sq1.clear();
                sq2.clear();
                sq3.clear();
            }
        }
        return true;
    }
}
