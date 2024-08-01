package com.stock.GestionStock.Dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.stock.GestionStock.Model.Role;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RoleDto {
    private Integer id;

    private String roleName;
    @JsonIgnore
    private UtilisateurDto utilisateur;
    public static RoleDto fromEntity(Role roles) {
        if (roles == null) {
            return null;
        }
        return RoleDto.builder()
                .id(roles.getId())
                .roleName(roles.getRoleName())
                .build();
    }

    public static Role toEntity(RoleDto dto) {
        if (dto == null) {
            return null;
        }
        Role role = new Role();
        role.setId(dto.getId());
        role.setRoleName(dto.getRoleName());
        role.setUtilisateur(UtilisateurDto.toEntity(dto.getUtilisateur()));
        return role;
    }
}
