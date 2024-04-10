import java.util.HashMap;
import java.util.Map;
public class Exercise11{
public static void main(String args[]){
int[] nums = {2,7,11,15};
int target = 9;
int[] indices = findTwoSumIndices(nums , target);
if(indices != null){
System.out.println("Indices of elements whose sum is equal to" +target+ ": "+ indices[0]+" , "+indices[1]);
}else{
System.out.println("No such indices found");
}
}

public static int[] findTwoSumIndices(int[] nums , int target){
if(nums == null || nums.length < 2){
return null;
}

Map < Integer , Integer > map = new HashMap<>();
for(int i = 0;i< nums.length;i++){
int complement = target - nums[i];
if(map.containsKey(complement)){
return new int[]{map.get(complement),i};
}
map.put(nums[i] , i);
}
return null;
}
}
