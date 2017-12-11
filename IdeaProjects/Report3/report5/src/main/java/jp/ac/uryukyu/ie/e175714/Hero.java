package jp.ac.uryukyu.ie.e175714;

public class Hero extends LivingThing{
    public Hero (String Hname,int Hhp,int Hattack) {
        super(Hname,Hhp,Hattack);
    }
    @Override
    public void attack(LivingThing opponent) {
        int damage = (int) (Math.random() * getattack());
        int random = (int)(Math.random()*100);
        if (random<40) {
            if (damage == 0) {
                System.out.printf("%sの攻撃！会心の一撃！！,,,だが、%sは攻撃を回避した！\n", getname(), opponent.getname(), damage);
            }else{
            System.out.printf("%sの攻撃！会心の一撃！！%sに%dのダメージを与えた！！\n", getname(), opponent.getname(), damage*2);
            opponent.wounded(damage * 2);
            }
        }else{
            if (getdead() == false) {
                if (damage == 0) {
                    System.out.printf("%sの攻撃！,,,だが、%sは攻撃を回避した！\n", getname(), opponent.getname(), damage);
                }else{
                    System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", getname(), opponent.getname(), damage);
                    opponent.wounded(damage);
                }
            }
        }
    }

    public void wounded(int damage) {

        sethitpoint(gethitpoint() - damage);
        if (gethitpoint() <= 0) {
            setdead(true);
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", getname());
        }
    }
}