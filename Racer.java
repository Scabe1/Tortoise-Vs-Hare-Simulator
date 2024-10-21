// implement the Racer class here


   public abstract class Racer {
   protected String name;
   protected double distanceCoveredInMeters;
   protected double minSpeedInMetersPerSecond;
   protected double maxSpeedInMetersPerSecond;
   
   public Racer(String initName, double minSpeed, double maxSpeed) {
      this.distanceCoveredInMeters = 0;
      this.name = initName;
      this.minSpeedInMetersPerSecond = minSpeed;
      this.maxSpeedInMetersPerSecond = maxSpeed;
   }
   
   public double getDistanceCoveredInMeters() {
      return this.distanceCoveredInMeters;
      
   }
   
   public abstract void run(double timeIntervalInSeconds);
   
   //@override 
   public String toString() {
      
      // Racer {name: Bob}
      return String.format("Racer {name: %s}", this.name);
      
   }
}
