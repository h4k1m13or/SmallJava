public class Quad
{
    String Values[];

    public Quad(String[] Values) {
        this.Values = Values;
    }

    public Quad(String s1,String s2,String s3,String s4)
    {
        Values = new String[4];
        Values[0] = s1;
        Values[1] = s2;
        Values[2] = s3;
        Values[3] = s4;
    }

    public String get(int index)
    {
        return Values[index];
    }

    public void set(int index, String s)
    {
        Values[index] = s;
    }

    @Override
    public String toString()
    {
        return "("+Values[0]+","+Values[1]+","+Values[2]+","+Values[3]+")";
    }
}
