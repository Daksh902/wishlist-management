@Entity
public class WishlistItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String itemName;

    // Getters and setters

    // Additional logic or validations can be added here
}
