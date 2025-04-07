// AvatarItemDto.java
package com.dnf.cinamon.dto;

import lombok.*;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class AvatarItemDto {
    private String itemName;
    private String itemId;
    private Integer price;
}
