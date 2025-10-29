 public class StringBuilderExample {
   public StringBuilderExample() {
   }

   public static void main(String[] var0) {
      StringBuilder var1 = new StringBuilder("Hello");
      var1.append("World");
      System.out.println("After append: " + String.valueOf(var1));
      var1.insert(5, "java");
      System.out.println("After insert: " + String.valueOf(var1));
      var1.replace(6, 10, "Programming");
      System.out.println("After replace: " + String.valueOf(var1));
      var1.delete(5, 15);
      System.out.println("After delete: " + String.valueOf(var1));
      var1.reverse();
      System.out.println("After reverse: " + String.valueOf(var1));
   }
}