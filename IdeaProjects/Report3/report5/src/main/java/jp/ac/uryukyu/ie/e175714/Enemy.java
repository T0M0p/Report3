package jp.ac.uryukyu.ie.e175714;

public class Enemy extends LivingThing {
    public Enemy(String Ename, int Ehp, int Eattack) {
        super(Ename, Ehp, Eattack);
    }

    @Override
    public void attack(LivingThing opponent) {
        int damage = (int) (Math.random() * getattack());
        int random = (int) (Math.random() * 100);
        if (getdead() == false) {
            if (random < 30) {
                if (damage == 0) {
                    System.out.printf("%sの攻撃！痛恨の一撃！！,,,だが、%sは攻撃を回避した！\n", getname(), opponent.getname(), damage);
                } else {
                    System.out.printf("%sの攻撃！痛恨の一撃！！%sに%dのダメージを与えた！！\n", getname(), opponent.getname(), damage * 2);
                    opponent.wounded(damage * 2);
                }
            } else {
                    if (damage == 0) {
                        System.out.printf("%sの攻撃！,,,だが、%sは攻撃を回避した！\n", getname(), opponent.getname(), damage);
                    } else {
                        System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", getname(), opponent.getname(), damage);
                        opponent.wounded(damage);
                    }
                }
            }
        }
    }

