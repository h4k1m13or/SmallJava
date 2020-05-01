import java.util.LinkedList;

public class Quads
{
    LinkedList<Quad> quads = new LinkedList<Quad>();
    public int addQuad(String s1,String s2,String s3,String s4)
    {
        return addQuad(new Quad(s1,s2,s3,s4));
    }

    public int addQuad(Quad quad)
    {
        quads.add(quad);
        return quads.size()-1;
    }

    public Quad getQuad(int index)
    {
        return quads.get(index);
    }

    public int size()
    {
        return quads.size();
    }


     public void DisplayQuad() {
    // pour chaque element on le rend un toString et aprés j'affiche
    System.out.println("--------->: QUADRUPLE :<--------\n");
    quads.stream().map(Quadruple->" Q"+quads.indexOf(Quadruple)+" : | "+Quadruple.toString()+" ").forEach(System.out::println);
    System.out.println("_______________________________\n");

}
}
