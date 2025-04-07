// AvatarItemService.java
package com.dnf.cinamon.service;

import com.dnf.cinamon.dto.AvatarItemDto;
import com.dnf.cinamon.entity.AvatarItem;
import com.dnf.cinamon.repository.AvatarItemRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AvatarItemService {

    private final AvatarItemRepository avatarItemRepository;

    public AvatarItemService(AvatarItemRepository avatarItemRepository) {
        this.avatarItemRepository = avatarItemRepository;
    }

    public AvatarItemDto getItemByItemId(String itemId) {
        Optional<AvatarItem> item = avatarItemRepository.findByItemId(itemId);
        return item.map(i -> AvatarItemDto.builder()
                .itemId(i.getItemId())
                .itemName(i.getItemName())
                .price(i.getPrice())
                .build()).orElse(null);
    }
}
