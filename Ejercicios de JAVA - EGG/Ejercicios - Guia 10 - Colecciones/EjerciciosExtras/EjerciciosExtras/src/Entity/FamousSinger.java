
package Entity;


// @author new53
 
public class FamousSinger {
    private String singerName;
    private int discCopiesBestSelled;

    public FamousSinger() {
    }

    public FamousSinger(String singerName, int discCopiesBestSelled) {
        this.singerName = singerName;
        this.discCopiesBestSelled = discCopiesBestSelled;
    }

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public int getDiscCopiesBestSelled() {
        return discCopiesBestSelled;
    }

    public void setDiscCopiesBestSelled(int discCopiesBestSelled) {
        this.discCopiesBestSelled = discCopiesBestSelled;
    }

    @Override
    public String toString() {
        return "\nSINGER DATA..." + "\n[" +
                "\nSinger name: " + singerName + 
                "\nNumber of disc best selled: " + discCopiesBestSelled + "\n]";
    }    
}