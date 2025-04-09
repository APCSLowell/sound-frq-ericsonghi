import java.util.*;
public class Sound
{
  /** the array of values in this sound; guaranteed not to be null */
  int[] samples;



  /** Changes those values in this sound that have an amplitude greater than limit.
   *  Values greater than limit are changed to limit.
   *  Values less than -limit are changed to -limit.
   *  @param limit the amplitude limit
   *         Precondition: limit >= 0
   *  @return the number of values in this sound that this method changed
   */
  public int limitAmplitude(int limit)
  {  
    /* to be implemented in part (a) */
    int x = 0;
    for(int i = 0; i < Samples.length; i++){
      if(samples[i] > limit){
      samples[i] = limit;
      x++;
  }
  if(samples[i] < -limit){
    samples[i] = -limit;
    x++;
      }
  }
return x;

  }



  /** Removes all silence from the beginning of this sound.
   *  Silence is represented by a value of 0.
   *  Precondition: samples contains at least one nonzero value
   *  Postcondition: the length of samples reflects the removal of starting silence
   */
  public void trimSilenceFromBeginning()
  {
    /* to be implemented in part (b) */
   int y = 0;
for(int i = 0; i < samples.length; i++){
  if(samples[i] == 0){
    y++;
  }else{
    break;
  }
}
  int[] newSample = new int[samples.length - y];
  for(int i = 0; i < newSample.length; i++){
    newSample[i] = Sample[i + y];
  }

}
