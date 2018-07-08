package com.example.tanmay.recipeapp;

/**
 * Created by TANMAY on 1/14/2018.
 */

public class Chinese {
    private String nam;
    private String descriptio;
    private int imageI;
    public static final Chinese [] food={
            new Chinese("MONGOLIAN CHICKEN","\tINGREDIENTS :\n"+"\n"+
                    " 1. 1 pound boneless, skinless chicken breast chopped bite size\n" +
                    " 2. 1/4 cup cornstarch\n" +
                    " 3. 2 tablespoons vegetable oil\n" +
                    " 4. 1/2 teaspoon ginger peeled and minced\n" +
                    " 5. 1 tablespoon garlic minced\n" +
                    " 6. 1/4 cup soy sauce\n" +
                    " 7. 1/2 cup low sodium chicken stock\n" +
                    " 8. 2 tablespoons brown sugar\n" +
                    " 9. 1 teaspoon toasted sesame oil\n" +
                    " 10. 4 stalks scallions chopped bite size on the bias\n"
                    +"\n"+"\n"+
                    "\tMETHOD :\n"+"\n"+
                    "1. In a bowl, mix chicken pieces with cornstarch until all the pieces are evenly coated.\n" +
                    " 2. In a pan over high heat, add oil and when the oil is hot, add chicken. Cook until chicken is cooked through (about 4 minutes).\n" +
                    " 3. Add garlic and ginger and cook for 2 minutes.\n" +
                    " 4. Add soy sauce, chicken stock and brown sugar and cook for 3-4 minutes, until sauce thickens.\n" +
                    " 5. Turn the heat off, add sesame oil and scallions. Stir well and serve with white rice.\n"+"\n",R.drawable.mongo),
            new Chinese("VEG HAKKA NOODLES","\tINGREDIENTS :\n"+"\n"+
                    " 1. 350 gm fresh noodles\n" +
                    " 2. 3 finely chopped onion\n" +
                    " 3. 2 sliced capsicum ( green pepper)\n" +
                    " 4. 3 finely chopped spring onions\n" +
                    " 5. 4 finely chopped green chilli\n" +
                    " 6. 1/2 teaspoon powdered white peppercorns\n" +
                    " 7. 1/8 tablespoon ajinomoto\n" +
                    " 8. 4 tablespoon refined oil\n" +
                    " 9. 2 sliced carrot\n" +
                    " 10. 100 gm sliced white cabbage\n" +
                    " 11. 1 inch finely chopped,peeled ginger\n" +
                    " 12. 1/2 tablespoon soy sauce\n" +
                    " 13. 1/2 teaspoon salt\n" +
                    " 14. 2 cloves minced garlic\n"+"\n"+"\n"+
                    "\tMETHOD :\n"+"\n"+
                    "1. Heat oil in a large pan over medium-high flame. Add onions, green chillies, ginger and garlic and saute for a minute or so. Meanwhile, boil the noodles as per packet instructions.\n" +
                    "\n" +
                    " 2. Now, add all the other vegetables, ajinomoto, salt and pepper powder in the pan. Increase flame to high and cook for 3 to 4 minutes.\n" +
                    "\n" +
                    " 3. Add the cooked noodles and stir well. Add soy sauce and cook for a minute more. Garnish with some spring onions and serve hot.\n"+"\n"
                    ,R.drawable.veg),

    };
    public Chinese(String nam,String descriptio,int imageI){
        this.nam=nam;
        this.descriptio=descriptio;
        this.imageI =imageI;

    }
    public String getName(){
        return nam;
    }
    public String getDescription(){
        return descriptio;
    }
    public String toString(){
        return this.nam;
    }

    public int getImageId() {
        return imageI;
    }
}
