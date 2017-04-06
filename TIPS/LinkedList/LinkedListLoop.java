package LinkedList;
puclic class LinkedListLoop{
  public static void main(String[] args){
    //lots of compile error for this first version
    //missing import java.util.*
    //some lt wrongly type as "ls";
    //hasNext() type as has.Next()
    //line20, it should be "it.next()", lt is linkedlist, do not have a menthod "next()"
    //add System.out.println() before each new print, sine there is no ln(), u need this to print in a new line.
    LinkedList lt = new LinkedList();
        lt.add(1);
        lt.add(2);
        lt.add(3);
        System.out.println("Loop the LinkedList by ===> for");
        for(int i=0;i<lt.size();i++){
            System.out.print(lt.get(i) + " ");
        }
        System.out.println();
        System.out.println("Loop the LinkedList by ===> iteartor");
        Iterator it = lt.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
        System.out.println();
        System.out.println("Loop the LinkedList by ===> while");
        int nums=0;
        while(lt.size()>nums){
            System.out.print(lt.get(nums) + " ");
            nums++;
        }
        System.out.println();
        System.out.println("Loop the LinkedList by ===> java8");
        lt.forEach(System.out::println);//need check this more
  }  
}
