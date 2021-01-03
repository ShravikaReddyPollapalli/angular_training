package method;
import method.Sample;
public class Sample1 extends Sample
{
public static void main(String[] args)
{
	Sample s1=new Sample();
	s1.add(2,3);
	Sample.add(3, 4.5);
	s1.add(2, 3,4);
	s1.add(4, 3,2);
}
}
