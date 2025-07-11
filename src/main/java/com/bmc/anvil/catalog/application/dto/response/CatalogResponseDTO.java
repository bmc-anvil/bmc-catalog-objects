package com.bmc.anvil.catalog.application.dto.response;

import java.util.Map;

import com.bmc.anvil.catalog.application.dto.OwnershipDTO;
import com.bmc.anvil.catalog.domain.model.CatalogType;

import lombok.Data;

/**
 * FIXME: add documentation: focus on "description", "why", "how", "caveats"[...] more that simple descriptions, as those should be
 *        inferred from code and names as much as possible.
 *
 * @author BareMetalCode
 */
@Data
public final class CatalogResponseDTO {

    private String              id;
    private CatalogType         catalogType;
    private String              description;
    private String              name;
    private OwnershipDTO        ownership;
    private Map<String, String> properties;

}
