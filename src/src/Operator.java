/**
 * Created by nate on 4/10/17.
 */
public interface Operator {
    public double getFreq();
    public double getAmplitude();
    public double[] getSamples();
    public void changeFreq(double freq);
    public void modulate(double[] samples);

}
