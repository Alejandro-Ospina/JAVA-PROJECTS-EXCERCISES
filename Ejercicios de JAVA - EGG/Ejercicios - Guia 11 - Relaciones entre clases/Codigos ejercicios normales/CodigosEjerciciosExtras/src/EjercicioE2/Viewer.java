
package EjercicioE2;


// @author new53
 
public class Viewer {
    private String viewerName;
    private int viewerAge;
    private double viewerCash;

    public Viewer() {
    }

    public Viewer(String viewerName, int viewerAge, double viewerCash) {
        this.viewerName = viewerName;
        this.viewerAge = viewerAge;
        this.viewerCash = viewerCash;
    }

    public String getViewerName() {
        return viewerName;
    }

    public void setViewerName(String viewerName) {
        this.viewerName = viewerName;
    }

    public int getViewerAge() {
        return viewerAge;
    }

    public void setViewerAge(int viewerAge) {
        this.viewerAge = viewerAge;
    }

    public double getViewerCash() {
        return viewerCash;
    }

    public void setViewerCash(double viewerCash) {
        this.viewerCash = viewerCash;
    }

    @Override
    public String toString() {
        return "Viewer{" + "viewerName=" + viewerName + ", viewerAge=" + viewerAge + ", viewerCash=" + viewerCash + '}';
    }
}