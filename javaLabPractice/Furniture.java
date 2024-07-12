class Furniture{
                String type;
                String material;
                String colour;
            public void showDetails(){
                  System.out.println("Type:"+type);
                  System.out.println("material:"+material);
                  System.out.println("colour:"+colour);

                }
            public static void main(String[]args){
                Furniture studyTable = new Furniture();
                studyTable.type = "Study Table";
                studyTable.material = "wood";
                studyTable.colour = "Brown";
                studyTable.showDetails();
           }
         }