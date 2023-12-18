package com.betrybe.museumfinder.dto;

import com.betrybe.museumfinder.model.Coordinate;
import com.betrybe.museumfinder.model.Museum;

/**
 * The type Museum dto.
 */
public record MuseumDto(
    Long id,
    String name,
    String description,
    String address,
    String collectionType,
    String subject,
    String url,
    Coordinate coordinate
) {

  /**
   * Model to dto museum dto.
   *
   * @param museum the museum
   * @return the museum dto
   */
  public static MuseumDto modelToDto(Museum museum) {
    return new MuseumDto(
        museum.getId(),
        museum.getName(),
        museum.getDescription(),
        museum.getAddress(),
        museum.getCollectionType(),
        museum.getSubject(),
        museum.getUrl(),
        museum.getCoordinate());
  }

  /**
   * Dto to model museum.
   *
   * @param museumCreationDto the museum creation dto
   * @return the museum
   */
  public static Museum dtoToModel(MuseumCreationDto museumCreationDto) {
    Museum newMuseum = new Museum();

    newMuseum.setName(museumCreationDto.name());
    newMuseum.setDescription(museumCreationDto.description());
    newMuseum.setAddress(museumCreationDto.address());
    newMuseum.setCollectionType(museumCreationDto.collectionType());
    newMuseum.setSubject(museumCreationDto.subject());
    newMuseum.setUrl(museumCreationDto.url());
    newMuseum.setCoordinate(museumCreationDto.coordinate());

    return newMuseum;
  }

}
