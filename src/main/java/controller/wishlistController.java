@RestController
@RequestMapping("/api/wishlists")
public class WishlistController {

    @Autowired
    private WishlistService wishlistService;

    @GetMapping
    public List<WishlistItem> getUserWishlist(Authentication authentication) {
        String username = authentication.getName();
        return wishlistService.getUserWishlist(username);
    }

    @PostMapping
    public WishlistItem createWishlistItem(@RequestBody WishlistItem wishlistItem, Authentication authentication) {
        String username = authentication.getName();
        return wishlistService.createWishlistItem(username, wishlistItem);
    }

    @DeleteMapping("/{id}")
    public void deleteWishlistItem(@PathVariable("id") Long id, Authentication authentication) {
        String username = authentication.getName();
        wishlistService.deleteWishlistItem(username, id);
    }
}
