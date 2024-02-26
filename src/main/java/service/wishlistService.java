@Service
public class WishlistService {

    @Autowired
    private WishlistRepository wishlistRepository;

    public List<WishlistItem> getUserWishlist(String username) {
        return wishlistRepository.findByUsername(username);
    }

    public WishlistItem createWishlistItem(String username, WishlistItem wishlistItem) {
        wishlistItem.setUsername(username);
        return wishlistRepository.save(wishlistItem);
    }

    public void deleteWishlistItem(String username, Long id) {
        wishlistRepository.deleteByIdAndUsername(id, username);
    }
}
