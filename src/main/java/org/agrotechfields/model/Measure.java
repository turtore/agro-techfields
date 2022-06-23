package org.agrotechfields.model;

import io.quarkus.mongodb.panache.PanacheMongoEntity;
import io.quarkus.mongodb.panache.common.MongoEntity;

import java.time.LocalDateTime;

@MongoEntity(collection = "measureshelter")
public class Measure extends PanacheMongoEntity {
  public LocalDateTime moment;

  public Integer temperature;
  public Integer airHumidity;
  public Integer soilMoisture;


  public Measure() {
  }

  public Measure(Integer temperature, Integer airHumidity, Integer soilMoisture) {
    LocalDateTime moment = LocalDateTime.now();
    this.moment = moment;
    this.temperature = temperature;
    this.airHumidity = airHumidity;
    this.soilMoisture = soilMoisture;
  }
}
