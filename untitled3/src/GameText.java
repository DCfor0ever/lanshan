public class GameText {
    public static void main(String[] args) {
        //1.创建第一个角色
        User r1=new User("甲贺忍蛙",100,'男');
        //2.创建第二个角色
        User r2=new User("喷火龙",100,'男');
        r1.showUserInfo();
        r2.showUserInfo();
        //3回合制游戏
        while (true){
            r1.attack(r2);
            //判段r2的剩余血量
            if(r2.getBlood()==0){
                System.out.println(r1.getName()+"ko了"+r2.getName());
                break;

            }
            r2.attack(r1);
            //判段r2的剩余血量
            if(r1.getBlood()==0){
                System.out.println(r2.getName()+"ko了"+r1.getName());
                break;
            }
        }
    }
}
