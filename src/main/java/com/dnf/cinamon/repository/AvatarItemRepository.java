// AvatarItemRepository.java
package com.dnf.cinamon.repository;

import com.dnf.cinamon.entity.AvatarItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AvatarItemRepository extends JpaRepository<AvatarItem, Long> {
    Optional<AvatarItem> findByItemId(String itemId);
}
