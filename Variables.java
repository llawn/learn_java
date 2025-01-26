public class Variables{
    
    // Understands variables
    
    public static void main(String[] args) {
        
        // Primitive variables (Stack)
        
        int age = 25; 
        System.out.println("age: " + age);

        double temperature = -12.5;
        System.out.println("temperature: " + temperature + "°C");

        char grade = 'A';
        System.out.println("grade: " + grade);

        boolean isStudent = true;
        System.out.println("isStudent:" + isStudent);

        // Reference variables (Stack -> Heap)
        
        String name = "Llawn";
        System.out.println("name: " + name);
    }
}
