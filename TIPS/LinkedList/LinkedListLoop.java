package LinkedList;
puclic class LinkedListLoop{
  public static void main(String[] args){
    //lots of compile error for this first version
    //missing import java.util.*
    //some lt wrongly type as "ls";
    //hasNext() type as has.Next()
    //line20, it should be "it.next()", lt is linkedlist, do not have a menthod "next()"
    LinkedList lt = new LinkedList();
    lt.add(1);
    lt.add(2);
    lt.add(3);
    System.out.println("Loop the LinkedList by ===> for");
      for(int i=0;i<ls.size();i++){
        System.out.print(lt.get(i) + " ");  
      }
    System.out.println("Loop the LinkedList by ===> iteartor");
      Iteartor it = lt.iteartor();
      while(it.has.Next()){
        System.out.print(lt.next() + " ");
      }
    System.out.println("Loop the LinkedList by ===> while");
      int nums=0;
      while(ls.size()>nums){
        System.out.print(lt.get(nums) + " ");
        nums++;
      }
    System.out.println("Loop the LinkedList by ===>java8");
      lt.forEach(System.out::println);//need check this more
  }  
}
