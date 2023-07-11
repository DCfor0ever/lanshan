public class Gamer {
    public String name;
    public char sex;
    public int dj;//等级
    public int smz;//生命值

    public Gamer() {
    }

    public Gamer(String name, char sex) {
        this.name = name;
        this.sex = sex;
        this.dj = 1;
        this.smz = 100;
    }

    public void dazhao(Gamer g,int i){
        if(g.smz < i){
            System.out.println(g.name+"已阵亡！！！"+this.name+"晋升1级，当前等级="+this.dj+"，晋升后为"+(++dj));
        }else{
            System.out.println(this.name+"攻击了"+g.name+"，杀伤力"+i+"，"+g.name+"的生命值-"+i+"，剩余生命值="+(g.smz-i));
        }
    }

}





