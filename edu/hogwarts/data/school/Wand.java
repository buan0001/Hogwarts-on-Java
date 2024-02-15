package edu.hogwarts.data.school;

import edu.hogwarts.data.school.TeachingMaterial;

public class Wand extends TeachingMaterial {

  double lengthInInches;
  String wood;
  String core;

  public Wand(double lengthInInches, String wood, String core) {
    this.lengthInInches = lengthInInches;
    this.wood = wood;
    this.core = core;
  }

//   public Wand() {}
}
