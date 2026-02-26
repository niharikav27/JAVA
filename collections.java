import java.util.*;

// ARRAYLIST
// class collections {
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(5);
//         list.add(10);
//         list.add(4);
//         // System.out.println(list);
//         // System.out.println(list.get(0));
//         // System.out.println(list.set(0, 100));
//         // System.out.println(list);
//         // list.remove(0);
//         // System.out.println(list);
//         // System.out.println(list.size());
//         // System.out.println(list.contains(100));
//         for(int i =0 ; i<list.size(); i++){
//             System.out.println(list.get(i));
//         }
//     }
// }

// HASHMAP
// class collections{
//  public static void main(String[] args) {
//         HashMap <Integer,Integer> map = new HashMap<>();
//         map.put(0,10);
//         map.put(1,15);
//         map.put(2,20);
//         System.out.println(map);

//         System.out.println(map.get(0));

//         map.remove(2);
//         System.out.println(map);

//         System.out.println(map.containsKey( 2));

//         System.out.println(map.containsValue(23));

//     }
// }
   

// COUNT THE FREQUENCY OF CHARACTERS IN A STRING USING HASHMAP
// class collections{
//     public static void main(String[] args) {
//         String str = "hello";
//         HashMap<Character,Integer> map = new HashMap<>();
//         for(int i = 0 ; i < str.length() ; i++){
//             char ch = str.charAt(i);
//             map.put(ch,map.getOrDefault(ch, 0)+1);
            
//         }
//         System.out.println(map);
//     }
// }



// PRINT CHARACTERS OF STRING WHOSE FREQUENCY IS ONE
// class collections{
//     public static void main(String[] args) {
//         String str = "hello";
//         HashMap<Character,Integer> map = new HashMap<>();
//         for(int i = 0 ; i < str.length() ; i++){
//             char ch = str.charAt(i);
//             map.put(ch,map.getOrDefault(ch, 0)+1);
            
//         }
//         for(char ch : str.toCharArray()){
//             if(map.get(ch)==1){
//                 System.out.println(ch);
//             }
//         }
//         System.out.println(map);
//     }
// }


// TARGET SUM
// class collections{
//     public static void main(String[] args) {
//         int arr[] = {1,2,3,4,5};
//         int target = 6;
//         for( int i = 0;i<arr.length-1;i++){
//             for(int j = i+1; j <arr.length ; j++){
//                 if((arr[i]+arr[j])==target)
//                 System.out.println(i+ " "+j);
//             }
//         }
        
//     }
// }


class collections{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int target = 6;
        HashMap<Integer,Integer> map =  new HashMap<>();
        for(int i = 0 ; i < arr.length ; i++){
              int diff = target - arr[i];
              if(map.containsKey(diff)){
                System.out.println(map.get(diff) + " "+ i);
                return;
              }
              map.put(arr[i], i);
            }
        }
}





