// implement the Hare class here

public class Hare extends Racer {
   private double arrogance;
   public Hare (String name, double initArrogance) {
      super(name, 10, 15);
      this.arrogance = initArrogance;
   }
   
   @Override
   public void run(double timeIntervalInSeconds) {
      // compute random percentage, if it is less than arrogance
      double randArrogance = Math.random();
      // double percentage = randomPercentage / 100.0;
      // int arrogance = percentage;
        
         if(randArrogance < this.arrogance) {
            System.out.printf("%s takes a nap", name);
         }
         
            //otherwise
         else {
         // compute random speed
               double speed = Math.random()*(this.maxSpeedInMetersPerSecond - this.minSpeedInMetersPerSecond) + this.minSpeedInMetersPerSecond;

         // compute distance moved
               double distanceMoved = speed * timeIntervalInSeconds;

         // update distance covered in meters
               this.distanceCoveredInMeters += distanceMoved;

         //print progress message, Ex: Hana hops 2.73 meters; now at marker 11.51
         System.out.printf("%s hops %.2f meters; now at marker %.2f\n", this.name, distanceMoved, this.distanceCoveredInMeters);
      }
   }
}
