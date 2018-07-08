package com.example.tanmay.recipeapp;

/**
 * Created by TANMAY on 1/14/2018.
 */

public class Food {
    private String name;
    private String description;
    private int imageId;
    public static final Food [] foods={
            new Food("KADAI PANEER","\tINGREDIENTS :\n"+"\n"+
                    " 1. 1 Large Onion\n" +
                    " 2. 2 Large Tomatoes\n" +
                    " 3. 1 Green Bell Pepper (Capsicum / Shimla Mirch)\n" +
                    " 4. 250 Gram Paneer, cut in cubes\n" +
                    " 5. 4-5 Cloves of Garlic\n" +
                    " 6. ~1 Inch Ginger\n" +
                    " 7.  2 Teaspoons Coriander Seeds\n" +
                    " 8. 3-4 Dried Red Chillies\n" +
                    " 9. 2 Teaspoons Cumin Seeds (Jeera)\n" +
                    " 10. 1 Teaspoon Fennel Seeds (Saunf)\n" +
                    " 11. 1 Teaspoon Red Chilli Powder\n" +
                    " 12. 1/2 Teaspoon Turmeric Powder (Haldi)\n" +
                    " 13. 2 Teaspoons Coriander Powder (Dhania Powder)\n" +
                    " 14. 1 Teaspoon Garam Masala\n" +
                    " 15. 2 Teaspoons Salt or as per taste\n" +
                    " 16. 1 Teaspoon Sugar or 1 Teaspoon Honey, optional\n" +
                    " 17. 1 Tablespoon Crushed Dry Fenugreek Leaves (Kasuri Methi)\n"+
                    "\n"+"\n"+
                    "\tMETHOD :\n"+"\n"+
                    "1. Roast Cumin Seeds, Dried Red Chillies, Coriander Seeds and Fennel Seeds (Saunf) on low heat till they become slightly dark and fragrant.\n" +
                    " 2. Grind it to a coarse powder with a mortar and pestle. Adding freshly ground spices greatly enhances the taste of this dish.\n" +
                    " 3. Heat oil in a pan and add the ground spice powder to it.\n" +
                    " 4. Roast it on low flame for a minute. Do not overcook the spices otherwise they will become bitter.\n" +
                    " 5. Add finely chopped or pureed onions to the gravy and fry it for 2 minutes.\n" +
                    " 6. Add finely chopped or grated Ginger and Garlic and roast them.\n" +
                    " 7. Add tomato puree to the pan and cook till the raw smell of tomatoes goes away.\n" +
                    " 8. Add the dry spice powders, Turmeric Powder (Haldi), Red Chilli Powder, Garam Masala, Coriander Powder (Dhania Powder), Crushed Dry Fenugreek Leaves (Kasuri Methi), Salt and Sugar\n" +
                    " 9. Add diced capsicum to the gravy. Add 1 Cup water to the gravy and cook for a few minutes.\n" +
                    " 10. Finally add the Paneer cubes. Cover the pan with a lid and cook for 5 minutes till the Paneer is cooked.\n" +
                    " 11. Kadai Paneer is ready. Garnish it with chopped Coriander and serve it hot with any Indian Bread like Naan, Missi Roti, Lachha Parantha.\n" +
                    "\n" +
                    "\n"
                    ,R.drawable.karai),
            new Food("CHICKEN TIKKA KEBAB","\tINGREDIENTS :\n"+"\n"+
                    "1. Chicken Breast/ Boneless Chicken -1 lb(cut into bite size pieces)\n" +
                    " 2. Onion, Colored Bell Peppers,Tomato (diced) - 1 cup (optional)\n" +
                    " 3. Salt - 1 tsp\n" +
                    " 4. Cayenne pepper - 1 tsp\n" +
                    " 5. Chilli flakes - 1/2 tsp\n" +
                    " 6. Ginger garlic paste - 1 tsp\n" +
                    " 7. Coriander powder - 1/2 tsp\n" +
                    " 8. Turmeric - 1/4 tsp\n" +
                    " 9. Yogurt - 1 Cup\n" +
                    " 10. Cashew nuts - 2 tbsp (crushed)\n" +
                    " 11. Lemon -1/2 (juiced)\n" +
                    " 12. Cilantro (finely chopped) - 2 tbsp\n" +
                    " 13. Red color - few drops(optional)\n" +
                    " 14. Oil - 1 tbsp\n"
                    +"\n"+"\n"+
                    "\tMETHOD :\n"+"\n"+
                    " 1. Mix all the ingredients under marination except chicken and veggies to form a paste.\n" +
                    " 2. Now add the marination to the chicken pieces and veggies to coat it .\n" +
                    " 3. Let it marinate for at least 3 hours in refrigerator (increased marination time gives soft chicken with all masala taste).\n" +
                    " 4. Take bamboo skewers and soak in water for 1/2 hour. \n" +
                    " 5. Preheat oven to 300F.\n" +
                    " 6. Grease a baking dish with few drops of olive oil and spread the marinate chicken pieces and veggie pieces on it.\n" +
                    " 7. Bake it for 10 minutes and flip the chicken pieces and again bake for 10 minutes(to evenly cook the chicken)\n" +
                    " 8. Now take the baking dish out from oven and place the chicken and veggies in skewers(use paper towel to handle chicken if its very hot)\n" +
                    " 9. Now place the skewers in the oven at 350F for another 10 minutes(this gives the flavor and taste like in tandoori).\n" +
                    " 10. Now chicken tikka is ready to be served\n" +
                    " 11. Serve the hot and yummy chicken tikka by sprinkling few drops of lemon juice as a snack.\n" +
                    "\n" +
                    "\n"
                    ,R.drawable.chicken),

    };
    public Food(String name,String description,int imageId){
        this.name=name;
        this.description=description;
        this.imageId =imageId;

    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public String toString(){
        return this.name;
    }

    public int getImageId() {
        return imageId;
    }
}
