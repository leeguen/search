package com.example.search.wishlist.repository;

        import com.example.search.db.MemoryDbRepositoryAbstract;
        import com.example.search.wishlist.entity.WishListEntity;
        import org.springframework.stereotype.Repository;

@Repository // Db를 저장하는 곳
public class WishListRepository extends MemoryDbRepositoryAbstract<WishListEntity> {
}
