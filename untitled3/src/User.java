import java.util.Random;

public class User {
private String name;
private int blood;
private char gender;
private String face;
String[] boyfaces={"勇敢","开朗","固执","大胆","认真","调皮","悠闲","保守"};
String[] girlfaces={"害羞","孤僻","无虑","沉着","胆小","慎重","浮躁"};
    String[] attacks_desc={
            "%s使用了火焰漩涡，灼伤了%s",
            "%s使用了水手里剑，击伤伤了%s",
            "%s使用了龙爪，击伤了%s",
            "%s使用了地球上投，重伤了%s",
            "%s使用了水之波动，击伤了%s",
            "%s使用了暗袭要害，击伤了%s",


    };
    String[] injureds_desc={
            "导致%s后退一步，面露痛苦"
    };

    public User() {
    }

    public User(String name, int blood,char gender) {
        this.name = name;
        this.blood = blood;
        this.gender=gender;
        setFace(gender);
    }
    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getFace() {
        return face;
    }

    public void setFace(char gender) {
    Random r=new Random();
    //长相是随机的
        if (gender=='男'){

            int index=r.nextInt(boyfaces.length);
            this.face=boyfaces[index];
        } else if (gender=='女') {
            int index=r.nextInt(girlfaces.length);
            this.face=girlfaces[index];
        }else {
            this.face="认真";
        }
        this.face = face;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }
    //定义一个方法用于攻击人
    //r1.攻击(r2)
    //方法的调用者去攻击参数
    public void attack(User user){
        Random r=new Random();
        int index=r.nextInt(attacks_desc.length);
        String kungFu=attacks_desc[index];

        //输出一个伤害都效果
        System.out.printf(kungFu,this.getName(),user.getName());
        System.out.println();
        //计算造成的伤害

        int hurt=r.nextInt(20)+1;
        //修改原被打人有的血量
        int remainBlood=user.getBlood()-hurt;
        //剩余血量如果小于0就修改为0
        remainBlood=remainBlood<0?0:remainBlood;
        user.setBlood(remainBlood);
        //this 表示方法的调用者
        //受伤的描述
        System.out.printf(injureds_desc[0],user.getName());
        System.out.println();
    }
    public void  showUserInfo(){
        System.out.println("姓名为："+getName());
        System.out.println("血量为："+getBlood());
        System.out.println("性别为："+getGender());
        System.out.println("性格为："+getFace());

    }
}

