public class Player {
    String name;
    int ownedbryg;
    int ownedfærge;
    int position;
    int balance;
    boolean prison;
    int houses;
    public Player(String name, int ownedbryg, int ownedfærge, int position, int balance, boolean prison, int houses){
        this.name = name;
        this.ownedbryg = ownedbryg;
        this.ownedfærge = ownedfærge;
        this.position = position;
        this.balance = balance;
        this.prison = prison;
        this.houses = houses;
    }
    public boolean getPrison(){
        return prison;
    }
    public void setPrison(boolean isprison){
        prison = isprison;
    }
    public String getName(){
        return name;
    }
    public int getBryg(){
        return ownedbryg;
    }
    public void setBryg(int bryg){
        ownedbryg = bryg;
    }
    public int getFærge(){
        return ownedfærge;
    }
    public void setFærge(int færge){
        ownedfærge = færge;
    }
    public int getPosition(){
        return position;
    }
    public void addPosition(int add){
        position = position + add;
    }
    public void setPosition(int pos){
        position = pos;
    }
    public int getBalance(){
        return  balance;
    }
    public void setBalance(int bal){
        balance = bal;
    }
    public void addBalance(int add){
        balance = balance + add;
    }
    public int getHouses(){
        return houses;
    }
    public void addHouses(int add){
        houses = houses + add;
    }
    public void setHouses(int set){
        houses = set;
    }
}
