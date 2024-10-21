// implements the Tortoise class here

public class Tortoise extends Racer {
   public Tortoise(String name) {
      super(name, 2, 3);
      
   }
   
   @Override
   public void run(double timeIntervalInSeconds) {
      // Compute random speed between minSpeed and maxSpeed
      double speed = Math.random()*(this.maxSpeedInMetersPerSecond - this.minSpeedInMetersPerSecond) + this.minSpeedInMetersPerSecond;
      //compute distance moved
      double distanceMoved = speed * timeIntervalInSeconds;
      // update total distance covered
      this.distanceCoveredInMeters += distanceMoved;
      
      // print progress message Ex: Tom walks 2.73 meters; now at marker 11.51
      System.out.printf("%s walks %.2f meters; now at marker %.2f\n", this.name, distanceMoved, this.distanceCoveredInMeters);

   }
}
