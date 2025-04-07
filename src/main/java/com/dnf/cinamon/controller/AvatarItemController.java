// AvatarItemController.java
package com.dnf.cinamon.controller;

import com.dnf.cinamon.dto.AvatarItemDto;
import com.dnf.cinamon.service.AvatarItemService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/avatar")
public class AvatarItemController {

    private final AvatarItemService avatarItemService;

    public AvatarItemController(AvatarItemService avatarItemService) {
        this.avatarItemService = avatarItemService;
    }

    @GetMapping("/{itemId}")
    public AvatarItemDto getAvatarItem(@PathVariable String itemId) {
        return avatarItemService.getItemByItemId(itemId);
    }
}
