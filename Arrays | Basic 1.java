class GfG {
    int convertfive(int num) {
        if(num == 0) {
            return 5;
        }
        int temp = num;
        int place = 1;
        while(temp > 0) {
            if(temp % 10 == 0) {
               num += 5 * place;    
            }
            place*=10;
            temp = temp/10;
        }
        return num;   
    }
}
