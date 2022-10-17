package com.Glebass.junit;

public class main {
    public static void main(String[] args)
    {
        Game game = new Game();
        int p1 = Game.ArrSum(Game.CubeRandomp1());
        int p2 = Game.ArrSum(Game.CubeRandomp2());
        Game.Result(p1,p2);
    }
}
