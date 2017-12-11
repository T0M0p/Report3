package jp.ac.uryukyu.ie.e175714;

public class LivingThing {

    private String name;

    private int hitPoint;

    private int attack;

    private boolean dead;


    public LivingThing (String name, int maximumHP, int attack) {
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    public boolean isDead() {
        return dead;
    }



    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name = name;
    }



    public int gethitpoint(){
        return hitPoint;
    }
    public void sethitpoint(int hitPoint){
        this.hitPoint = hitPoint;
    }



    public int getattack(){
        return attack;
    }
    public void setattack(int attack){
        this.attack = attack;
    }



    public boolean getdead(){
        return dead;
    }
    public void setdead(boolean dead){
        this.dead = dead;
    }



    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("モンスター%sは倒れた。\n", name);
        }
    }



    public void attack(LivingThing opponent) {
        if (dead == false) {
            int damage = (int) (Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getname(), damage);
            opponent.wounded(damage);
        }
    }

}