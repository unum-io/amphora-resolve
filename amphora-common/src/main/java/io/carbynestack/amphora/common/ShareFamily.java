package io.carbynestack.amphora.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
public enum ShareFamily {
  Hemi("Hemi", false, 16),
  CowGear("CowGear", true, 32);

  private static Map<String, ShareFamily> mapping = loadMapping();

  @Getter private final String familyName;

  @Getter private final boolean verifiable;

  @Getter private final int shareSize;

  public static ShareFamily getShareFamilyByName(String familyName) {
    return mapping.get(familyName);
  }

  private static Map<String, ShareFamily> loadMapping() {
    Map<String, ShareFamily> mapping = new HashMap<>();
    mapping.put(Hemi.familyName, Hemi);
    mapping.put(CowGear.familyName, CowGear);

    return mapping;
  }
}
