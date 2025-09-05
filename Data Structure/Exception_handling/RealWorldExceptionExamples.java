// import java.util.Scanner;
// class MeghaException extends Exception{
//   public MeghaException(String message){
//       super(message);
//   }
// }

// public class Custom_exception {
//       public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int age;
//         System.out.println("enter age:");
//         age=sc.nextInt();
//       try{
//         if(age<18){
//           throw new MeghaException("You must be 18 or older.");
//         }
//         else {
//                 System.out.println("You are eligible.");
//             }

//       }catch(MeghaException e){
//                     System.out.println("Caught exception: " + e.getMessage());

//       }

//       }
// }

//  class AgeException extends Exception {
//     public AgeException(String message) {
//         super(message);
//     }
// }

// public class Custom_exception {
//     public static void validateAge(int age) throws AgeException {
//         if (age < 18) {
//             throw new AgeException("Age must be 18 or older to register.");
//         }
//         System.out.println("Registration successful.");
//     }

//     public static void main(String[] args) {
//         try {
//             validateAge(16);
//         } catch (AgeException e) {
//             System.out.println("Caught Exception: " + e.getMessage());
//         }
//     }
// }



// **Real Wrorld cutom exception

// Real-world custom exceptions for different domains

// 1. User Management Exception
class UserNotFoundException extends Exception {
    private String userId;
    
    public UserNotFoundException(String userId) {
        super("User not found with ID: " + userId);
        this.userId = userId;
    }
    
    public String getUserId() {
        return userId;
    }
}

// 2. Validation Exception
class ValidationException extends Exception {
    private String fieldName;
    private String fieldValue;
    
    public ValidationException(String fieldName, String fieldValue, String reason) 
    {
        super("Validation failed for field '" + fieldName + "' with value '" + fieldValue + "': " + reason);
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
    }
    
    public String getFieldName() { 
        return fieldName;
     }
    public String getFieldValue() { return fieldValue; }
}

// 3. Business Logic Exception
class InsufficientInventoryException extends RuntimeException {
    private String productId;
    private int requestedQuantity;
    private int availableQuantity;
    
    public InsufficientInventoryException(String productId, int requested, int available) {
        super(String.format("Insufficient inventory for product %s. Requested: %d, Available: %d", 
              productId, requested, available));
        this.productId = productId;
        this.requestedQuantity = requested;
        this.availableQuantity = available;
    }
    
    public String getProductId() { return productId; }
    public int getRequestedQuantity() { return requestedQuantity; }
    public int getAvailableQuantity() { return availableQuantity; }
}

// 4. Configuration Exception
class ConfigurationException extends Exception {
    private String configKey;
    
    public ConfigurationException(String configKey, String message) {
        super("Configuration error for key '" + configKey + "': " + message);
        this.configKey = configKey;
    }
    
    public String getConfigKey() { return configKey; }
}

public class RealWorldExceptionExamples {
    
    // User management service
    public static void getUserById(String userId) throws UserNotFoundException {
        // Simulate user lookup
        if (!"USER123".equals(userId)) {
            throw new UserNotFoundException(userId);
        }
        System.out.println("User found: " + userId);
    }
    
    // Validation service
    public static void validateEmail(String email) throws ValidationException {
        if (email == null || email.isEmpty()) {
            throw new ValidationException("email", email, "cannot be null or empty");
        }
        if (!email.contains("@")) {
            throw new ValidationException("email", email, "must contain @ symbol");
        }
        System.out.println("Valid email: " + email);
    }
    
    // Inventory service
    public static void processOrder(String productId, int quantity) {
        // Simulate inventory check
        int availableStock = 5; // Assume we have 5 items
        
        if (quantity > availableStock) {
            throw new InsufficientInventoryException(productId, quantity, availableStock);
        }
        System.out.println("Order processed for " + quantity + " units of " + productId);
    }
    
    // Configuration service
    public static void loadConfiguration(String configKey) throws ConfigurationException {
        // Simulate configuration loading
        if ("database.url".equals(configKey)) {
            throw new ConfigurationException(configKey, "database URL not found in config file");
        }
        System.out.println("Configuration loaded for: " + configKey);
    }
    
    public static void main(String[] args) {
        System.out.println("=== Real-World Custom Exception Examples ===\n");
        
        // 1. User management exception
        try {
            getUserById("USER123");  // Success
            getUserById("INVALID");  // Exception
        } catch (UserNotFoundException e) {
            System.out.println("❌ " + e.getMessage());
            System.out.println("   Failed User ID: " + e.getUserId());
        }
        
        // 2. Validation exception
        try {
            validateEmail("user@example.com");  // Success
            validateEmail("invalid-email");     // Exception
        } catch (ValidationException e) {
            System.out.println("❌ " + e.getMessage());
            System.out.println("   Field: " + e.getFieldName());
            System.out.println("   Value: " + e.getFieldValue());
        }
        
        // 3. Business logic exception
        try {
            processOrder("LAPTOP001", 3);   // Success
            processOrder("LAPTOP001", 10);  // Exception
        } catch (InsufficientInventoryException e) {
            System.out.println("❌ " + e.getMessage());
            System.out.println("   Product: " + e.getProductId());
            System.out.println("   Requested: " + e.getRequestedQuantity());
            System.out.println("   Available: " + e.getAvailableQuantity());
        }
        
        // 4. Configuration exception
        try {
            loadConfiguration("app.name");     // Success
            loadConfiguration("database.url"); // Exception
        } catch (ConfigurationException e) {
            System.out.println("❌ " + e.getMessage());
            System.out.println("   Config Key: " + e.getConfigKey());
        }
    }
}