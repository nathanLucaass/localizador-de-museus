package com.betrybe.museumfinder.model;

/**
 * The type Museum.
 */
public class Museum {

  /**
   * The Id.
   */
  public Long id;
  /**
   * The Name.
   */
  public String name;
  /**
   * The Description.
   */
  public String description;
  /**
   * The Address.
   */
  public String address;
  /**
   * The Collection type.
   */
  public String collectionType;
  /**
   * The Subject.
   */
  public String subject;
  /**
   * The Url.
   */
  public String url;
  /**
   * The Coordinate.
   */
  public Coordinate coordinate;
  /**
   * The Legacy id.
   */
  public Long legacyId;

  /**
   * Gets id.
   *
   * @return the id
   */
  public Long getId() {
    return id;
  }

  /**
   * Sets id.
   *
   * @param id the id
   */
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Gets name.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Sets name.
   *
   * @param name the name
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Gets description.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Sets description.
   *
   * @param description the description
   */
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Gets address.
   *
   * @return the address
   */
  public String getAddress() {
    return address;
  }

  /**
   * Sets address.
   *
   * @param address the address
   */
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   * Gets collection type.
   *
   * @return the collection type
   */
  public String getCollectionType() {
    return collectionType;
  }

  /**
   * Sets collection type.
   *
   * @param collectionType the collection type
   */
  public void setCollectionType(String collectionType) {
    this.collectionType = collectionType;
  }

  /**
   * Gets subject.
   *
   * @return the subject
   */
  public String getSubject() {
    return subject;
  }

  /**
   * Sets subject.
   *
   * @param subject the subject
   */
  public void setSubject(String subject) {
    this.subject = subject;
  }

  /**
   * Gets url.
   *
   * @return the url
   */
  public String getUrl() {
    return url;
  }

  /**
   * Sets url.
   *
   * @param url the url
   */
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * Gets coordinate.
   *
   * @return the coordinate
   */
  public Coordinate getCoordinate() {
    return coordinate;
  }

  /**
   * Sets coordinate.
   *
   * @param coordinate the coordinate
   */
  public void setCoordinate(Coordinate coordinate) {
    this.coordinate = coordinate;
  }

  /**
   * Gets legacy id.
   *
   * @return the legacy id
   */
  public Long getLegacyId() {
    return legacyId;
  }

  /**
   * Sets legacy id.
   *
   * @param legacyId the legacy id
   */
  public void setLegacyId(Long legacyId) {
    this.legacyId = legacyId;
  }
}
