// AvatarItem.java
package com.dnf.cinamon.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "avatar_items")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class AvatarItem {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String itemName;
    private String itemId;
    private String slot;
    private Integer price;
}
