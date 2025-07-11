class listarray {
public static void main(String arg[]){

ArrayList<Integer> list = new ArrayList<>();
list.add(10);
list.add(20);
list.add(30);
list.add(40);
list.add(50);
System.out.println("\n\t ArrayList : " + list);
HashSet<Integer>  hs = new HashSet<>(list);
System.out.println("\n\t HashSet :" + hs);
HashMap <Integer , String> hm  = new  HashMap<>();
hm.put(1,"A");
hm.put(2,"B");
hm.put(3,"C");
System.out.println("\n\t HashMap ");
System.out.println("\n\t HashMap :" + hm.values());
System.out.println("\n\t HashMap  :"+ hm.get(11));
}
}

