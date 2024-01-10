package com.betrybe.museumfinder.controller;

import com.betrybe.museumfinder.dto.MuseumCreationDto;
import com.betrybe.museumfinder.dto.MuseumDto;
import com.betrybe.museumfinder.model.Coordinate;
import com.betrybe.museumfinder.model.Museum;
import com.betrybe.museumfinder.service.MuseumService;
import com.betrybe.museumfinder.service.MuseumServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * The type Museum controller.
 */
@RestController
@RequestMapping("/museums")
public class MuseumController {
  private final MuseumServiceInterface museumService;

  /**
   * Instantiates a new Museum controller.
   *
   * @param museumService the museum service
   */
  @Autowired
  public MuseumController(MuseumServiceInterface museumService) {
    this.museumService = museumService;
  }

  /**
   * Post new museum response entity.
   *
   * @param museum the museum
   * @return the response entity
   */
  @PostMapping
  public ResponseEntity<Museum> postNewMuseum(@RequestBody MuseumCreationDto museum) {
    Museum createdMuseum = museumService.createMuseum(MuseumDto.dtoToModel(museum));

    return ResponseEntity.status(HttpStatus.CREATED).body(createdMuseum);
  }

  /**
   * Gets closest.
   *
   * @param lat       the lat
   * @param lng       the lng
   * @param maxDistKm the max dist km
   * @return the closest
   */
  @GetMapping("/closest")
  public ResponseEntity<MuseumDto> getClosest(
      @RequestParam double lat,
      @RequestParam double lng,
      @RequestParam(name = "max_dist_km") double maxDistKm
  ) {
    Coordinate coordinate = new Coordinate(lat, lng);
    Museum closest = museumService.getClosestMuseum(coordinate, maxDistKm);

    return ResponseEntity.status(HttpStatus.OK).body(MuseumDto.modelToDto(closest));
  }

  @GetMapping("/{id}")
  public ResponseEntity<MuseumDto> getMuseumById(@PathVariable Long id) {
    Museum selectedMuseum = museumService.getMuseum(id);

    return ResponseEntity.status(HttpStatus.OK).body(MuseumDto.modelToDto(selectedMuseum));
  }

}
