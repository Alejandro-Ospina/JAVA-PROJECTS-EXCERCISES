
package algorithms;


// @author new53
 
public abstract class Algorithms<T> {
    private T content;
    
    public T getContent(){
        return this.content;
    }
    
    public void setContent(T content){
        this.content = content;
    }
    
    @Override
    public abstract String toString();
}