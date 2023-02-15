import java.util.*;
import java.util.stream.Stream;

public class ManagingQueues {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int [] nk = Arrays.stream(sc.nextLine().trim().split("\\s"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] arr = Arrays.stream(sc.nextLine().trim().split("\\s"))
                .mapToInt(Integer::parseInt)
                .toArray();

        Deque<Integer> deque = new ArrayDeque<>();
        Set<Integer> uniqueValues = new HashSet<>();
        int maxUnique = 0;

        for(int i = 0; i < nk[0]; i++){
            maxUnique = Math.max(maxUnique , arr[i] <= nk[1] ? arr[i] : uniqueValues.size());

            if(!deque.isEmpty() && deque.peekFirst() <= i - nk[1]){
                int removed = deque.removeLast();
                uniqueValues.remove(arr[removed]);

            }

            while(!deque.isEmpty() && arr[deque.peekLast()] < arr[i]){
                int removed = deque.removeLast();
                uniqueValues.remove(arr[removed]);
            }

            deque.addLast(i);
            uniqueValues.add(arr[i]);

        }
        System.out.println(uniqueValues.size());
        System.out.println(nk[1]);
        System.out.println(nk[0]);
        // check if deque contains max unique elements for last window
        maxUnique = Math.max(maxUnique, uniqueValues.size());

        System.out.println(maxUnique);



    }
}
