 public static int howManyGames(int p, int d, int m, int s) {
        
        int gamesBought = 0;
        
        while(s >= p){
            gamesBought++;
            s-=p;
            p = Math.max(p-d, m);
        }
        return gamesBought;
    }
