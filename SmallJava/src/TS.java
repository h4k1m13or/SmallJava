import java.util.ArrayList;

public class TS
{
    static public class Element {

        public Element(String name, int declared, int type, int value ,int defined) {
            this.name = name;
            this.declared = declared;
            this.type = type;
            this.value = value;
            this.defined=defined;
        }

        String name;
        int declared; // 2:undeclared 1:declared
        int type; // 1:int 2:float 3:string
        int value;
        int defined;

        @Override
        public String toString()
        {
            String dec = (this.declared == 1)? "Declared":"Undeclared";
            String typ="";
            String defined=(this.defined==1)? "Defined":"Undefined";
            switch (this.type)
            {
                case 1:
                    typ="int_SJ";
                    break;
                case 2:
                    typ="float_SJ";
                    break;
                case 3:
                    typ="string_SJ";
                    break;
                 default: typ="Library";
            }


            return "| " + String.format( "%-18s",name) + " | "+ String.format("%-13s",typ ) + " | " + String.format("%-16s",dec )+" | "+ String.format("%-12s",defined )+" |";
        }

        public void setDefined(int defined) {
            this.defined = defined;
        }
    }


    public ArrayList<Element> L = new ArrayList<Element>();


    public Element getElement(String name)
    {
        for (int i = 0; i < L.size(); i++) {
            if(L.get(i).name.equals(name))
                return L.get(i);
        }
        return null;
    }

    public boolean containsElement(String name)
    {
        return getElement(name) != null;
    }

    public void addElement(Element e)
    {
        L.add(e);
    }

    public void deleteElement(String name)
    {
        for (int i = 0; i < L.size(); i++) {
            if(L.get(i).name.compareTo(name)==0)
            {
                deleteElement(L.get(i));
                return;
            }
        }
    }

    public void deleteElement(Element e)
    {
        L.remove(e);
    }

    public int getSize()
    {
        return L.size();
    }

    public Element getElement(int i)
    {
        return L.get(i);
    }


}
