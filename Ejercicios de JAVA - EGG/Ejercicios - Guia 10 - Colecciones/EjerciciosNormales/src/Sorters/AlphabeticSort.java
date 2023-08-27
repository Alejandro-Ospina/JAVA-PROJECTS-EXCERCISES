
package Sorters;

import java.util.Comparator;


// @author new53
 
public class AlphabeticSort implements Comparator<String>{
    @Override
    public int compare(String string1, String string2){
        return string1.compareTo(string2);
    }
}