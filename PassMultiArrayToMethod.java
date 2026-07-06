public class EnhancedForLoop {
    public static void main(String[] args) {
        String[] name = {"John", "Jack", "Mary", "James", "Lucy"};
        int[] marks = {69, 80, 100, 70, 50};

        // Fixed the increment syntax to i++
        for (int i = 0; i < 5; i++) {
            if (marks[i] >= 70) {
                System.out.printf("Students name: %s%n", name[i]);
                System.out.printf("Students Mark: %d%n", marks[i]);
                System.out.println("Students Grade: A");
                System.out.println("======================");
            } else if (marks[i] >= 60) {
                System.out.printf("Students name: %s%n", name[i]);
                System.out.printf("Students Mark: %d%n", marks[i]);
                System.out.println("Students Grade: B");
                System.out.println("======================");
            } else if (marks[i] >= 50) {
                System.out.printf("Students name: %s%n", name[i]);
                System.out.printf("Students Mark: %d%n", marks[i]);
                System.out.println("Students Grade: C");
                System.out.println("======================");
            } else if (marks[i] >= 40) {
                System.out.printf("Students name: %s%n", name[i]);
                System.out.printf("Students Mark: %d%n", marks[i]);
                System.out.println("Students Grade: D");
                System.out.println("======================");
            }
        }  for(String name: names){
			for (int mark : marks){System.out.printf("%s%n",name);}
			
			System.out.println("%s%n",name);
    }
}