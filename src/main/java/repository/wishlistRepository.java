@Repository
public interface WishlistRepository extends JpaRepository<WishlistItem, Long> {

    List<WishlistItem> findByUsername(String username);

    void deleteByIdAndUsername(Long id, String username);
}
