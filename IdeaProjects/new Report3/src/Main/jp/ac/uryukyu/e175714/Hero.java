package jp.ac.uryukyu.e175714;

public class Hero extends LivingThing{

    public Hero (String Hname,int Hhp,int Hattack) {
        super(Hname,Hhp,Hattack);
    }


    public void wounded(int damage) {

        hitPoint -= damage;
        if (hitPoint < 0) {
            dead = true;
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", name);
        }
    }
}