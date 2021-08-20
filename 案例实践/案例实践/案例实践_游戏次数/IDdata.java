package 案例实践.案例实践_游戏次数;

import java.io.Serializable;

public class IDdata implements Serializable {
    private String identity;
    private String password;
    private playGame pg = new playGame();
    private int count = 0;//游戏次数

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public playGame getPg() {
        return pg;
    }

    public void setPg(playGame pg) {
        this.pg = pg;
    }

    @Override
    public String toString() {
        return "IDdata{" +
                "identity='" + identity + '\'' +
                ", password='" + password + '\'' +
                ", pg=" + pg +
                ", count=" + count +
                '}';
    }
}
