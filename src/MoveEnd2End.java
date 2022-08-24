import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveEnd2End {
    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        List<Integer> newArray=new ArrayList<Integer>();
        int count=0;

        for(int i=0,j=0;i<array.size();i++){
            if(array.get(i)==toMove){
                count++;
            }
            else{
                newArray.add(j,array.get(i));
                j++;
            }
        }

        for(int i=array.size()-count;i<array.size();i++)
            newArray.add(i,toMove);
        return newArray;

    }

    public static void main(String[] args) {
        List<Integer> array= Arrays.asList(2, 1, 2, 2, 2, 3, 4, 2);
        int toMove=2;
        List<Integer> r=moveElementToEnd(array,toMove);
        System.out.println(r);

    }
}
