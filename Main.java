public class Main {
    public static void main(String[] args) throws Exception {
        LinkedList l = new LinkedList();
        System.out.println(String.valueOf(l.length()) + " == 0");
        l.append(5);
        System.out.println(String.valueOf(l.length()) + " == 1");
        l.append(10);
        System.out.println(String.valueOf(l.length()) + " == 2");
        l.append(15);
        System.out.println(String.valueOf(l.length()) + " == 3");
        l.insert(20, 0);
        System.out.println(String.valueOf(l.length()) + " == 4");
        System.out.println(l.toString());
        
    
    }
}