import java.util.ArrayList;

public class Code_obj {
    private Quad quad;
    private String inst="";

    private final static String MOV="MOV";
    private final static String ADD="ADD";
    private final static String SUB="SUB";
    private final static String MUL="MUL";
    private final static String DIV="DIV";
    private final static String CMP="CMP";
    private final static String JMP="JMP"; 
    private final static String JB="JB";
    private final static String JBE="JBE"; 
    private final static String JG="JG";
    private final static String JGE="JGE"; 
    private final static String JZ="JZ";
    private final static String JNZ="JNZ";




    private final static String AX="AX";
    private final static String BX="BX";

    private ArrayList<Integer> branchements=new ArrayList<>();



    public Code_obj(Quads tabQuad) {

        for (int j=0;j<tabQuad.size();j++) {
            quad=tabQuad.getQuad(j);
            if (quad.get(0).startsWith("B")) {
                branchements.add(Integer.parseInt(quad.get(1)));
            }

        }


        for (int i=0;i<tabQuad.size();i++) {

         quad=tabQuad.getQuad(i);
         
         if (branchements.contains(i))
         {inst=inst+"ETIQ"+String.valueOf(i)+":\n";}

         switch (quad.get(0)) {
             case "+": inst=inst+MOV+" "+AX+","+quad.get(1)+"\n";
                       inst=inst+ ADD+" "+AX+","+quad.get(2)+"\n";
                       inst=inst+MOV+ " "+quad.get(3)+","+AX+"\n";


             break;

             case "-": inst=inst+MOV+" "+AX+","+quad.get(1)+"\n";
                       inst=inst+ SUB+" "+AX+","+quad.get(2)+"\n";
                       inst=inst+MOV+" "+ quad.get(3)+","+AX+"\n";

             break;

             case "*": inst=inst+MOV+" "+AX+","+quad.get(1)+"\n";
                       inst=inst+ MUL+" "+AX+","+quad.get(2)+"\n";
                       inst=inst+MOV+ quad.get(3)+","+AX+"\n";


             break;

             case "/": inst=inst+MOV+" "+AX+","+quad.get(1)+"\n";
                       inst=inst+ DIV+" "+AX+","+quad.get(2)+"\n";
                       inst=inst+MOV+ quad.get(3)+","+AX+"\n";


             break;

             case "=": inst=inst+MOV+" "+AX+","+quad.get(2)+"\n";
                       inst=inst+MOV+" "+quad.get(3)+","+AX+"\n";


             break;

             case "BR":inst=inst+JMP+" ETIQ "+quad.get(1)+"\n";


             break;

             case "BP":  inst=inst+MOV+" "+AX+","+quad.get(3)+"\n";
                         inst=inst+MOV+" "+BX+","+quad.get(2)+"\n";
                         inst=inst+CMP+" "+AX+","+BX+"\n";
                         inst=inst+JG+" ETIQ "+quad.get(1)+"\n";


             break;

             case "BPZ": inst=inst+MOV+" "+AX+","+quad.get(3)+"\n";
                         inst=inst+MOV+" "+BX+","+quad.get(2)+"\n";
                         inst=inst+CMP+" "+AX+","+BX+"\n";
                         inst=inst+JGE+" ETIQ "+quad.get(1)+"\n";



                 break;

             case "BM": inst=inst+MOV+" "+AX+","+quad.get(3)+"\n";
                        inst=inst+MOV+" "+BX+","+quad.get(2)+"\n";
                        inst=inst+CMP+" "+AX+","+BX+"\n";
                        inst=inst+JB+" ETIQ "+quad.get(1)+"\n";



                 break;

             case"BMZ": inst=inst+MOV+" "+AX+","+quad.get(3)+"\n";
                        inst=inst+MOV+" "+BX+","+quad.get(2)+"\n";
                        inst=inst+CMP+" "+AX+","+BX+"\n";
                        inst=inst+JBE+" ETIQ "+quad.get(1)+"\n";



                 break;


             case "BZ": inst=inst+MOV+" "+AX+","+quad.get(3)+"\n";
                        inst=inst+MOV+" "+BX+","+quad.get(2)+"\n";
                        inst=inst+CMP+" "+AX+","+BX+"\n";
                        inst=inst+JZ+" ETIQ "+quad.get(1)+"\n";



                 break;

             case "BNZ": inst=inst+MOV+" "+AX+","+quad.get(3)+"\n";
                         inst=inst+MOV+" "+BX+","+quad.get(2)+"\n";
                         inst=inst+CMP+" "+AX+","+BX+"\n";
                         inst=inst+JNZ+" ETIQ "+quad.get(1)+"\n";



                 break;



         }


     }

    }



    public void  Display_Code_Obj() {
        System.out.println("\n\n\n\n\n");

        System.out.println("\n-------------------:> [OBJECT CODE] <:-------------------\n");
        System.out.println(""+inst);
        System.out.println("___________________________________________________________\n\n");



    }



}
