package com.example.tanmay.recipeapp;

/**
 * Created by TANMAY on 1/14/2018.
 */

public class American {
    private String nam;
    private String descriptio;
    private int imageI;
    public static final American [] food={
            new American("CLASSIC POTATO SALAD","\tINGREDIENTS :\n"+"\n"+
                    "1. 8 medium potatoes, cooked and diced\n" +
                    "2. 1/2 cups mayonnaise\n" +
                    "3. 2 tablespoons cider vinegar\n" +
                    "4. 2 tablespoons sugar\n" +
                    "5. 1 tablespoon yellow mustard\n" +
                    "6. 1 teaspoon salt\n" +
                    "7. 1 teaspoon garlic powder\n" +
                    "8. 1/2 teaspoon pepper\n" +
                    "9. 2 celery ribs, sliced\n" +
                    "10. 1 cup onion, minced\n" +
                    "11. 5 hard-boiled eggs\n"+
                    "\n"+"\n"+
                    "\tMETHOD :\n"+"\n"+
                    "1. Boil peeled potatoes in salted water until done. Cool to room temperature.\n" +
                    "2. Place diced potatoes in large bowl.\n" +
                    "3. Mix mayonnaise, cider vinegar, sugar, mustard, salt, garlic powder, and pepper in another bowl.\n" +
                    "4. Add to potatoes.\n" +
                    "5. Add celery and onions and mix well.\n" +
                    "6. Stir in eggs.\n" +
                    "7. Sprinkle a little paprika on top.\n"+"\n",R.drawable.potato),
            new American("CHESSY CHILI MAC","\tINGREDIENTS :\n"+"\n"+
                    "1. 2 tablespoon vegetable oil\n" +
                    "2. 1 large onion, finely chopped (about 1 1/2 cups)\n" +
                    "3. 1 red bell pepper, diced (about 3/4 cup)\n" +
                    "4. 3 medium cloves garlic, microplaned (about 3 teaspoons)\n" +
                    "5. 3 tablespoons chili powder\n" +
                    "6. 1 tablespoon ground cumin\n" +
                    "7. 2 teaspoons dried oregano\n" +
                    "8. 1 1/2 pounds fresh ground chuck\n" +
                    "9. 1 (28-ounce) can whole peeled tomatoes packed in juice, roughly chopped, juice reserved\n" +
                    "10. 2 (15-ounce) cans kidney beans, rinsed and drained\n" +
                    "11. 1/4 cup hot sauce (like Frank's)\n" +
                    "12. Kosher salt and freshly ground black pepper\n" +
                    "13. 1 pound elbow macaroni\n" +
                    "14. 4 tablespoons butter\n" +
                    "15. 1 (12-ounce) can evaporated milk\n" +
                    "16. 1 pound grated Cheddar or Jack cheese\n" +
                    "17. 4 ounces finely grated Parmigiano-Reggiano (about 2 cups)\n" +
                    "18. 2 tablespoons chopped cilantro leaves or scallion greens for garnish\n"+
                    "\n"+"\n"+
                    "\tMETHOD :\n"+"\n"+
                    "1. Heat the vegetable in a large saucepan over high heat until shimmering. Add the onion and red pepper and cook, stirring frequently, until lightly softened, about 2 minutes. Add the garlic, chili powder, cumin, and oregano. Cook, stirring constantly until fragrant, about 1 minute. Add the beef and cook, stirring occasionally and using a wooden spoon to break up the meat until it is no longer pink, about 7 minutes. Add the tomatoes and their juice, the beans, and the hot sauce. Season to taste with salt and pepper. Simmer until thickened, about 30 minutes.\n" +
                    "\n" +
                    "2. Meanwhile, adjust the oven rack to the middle position and preheat the oven to 400°F. Place the pasta in a large saucepan and cover with water by 2 inches. Add 1 tablespoon salt. Heat over high heat until boiling, stirring occasionally to prevent pasta from sticking. Once it comes to a boil, cover pot and remove from heat. Let sit until pasta is fully cooked (see package for cooking time). Drain pasta and return it to the pot. Add the butter and evaporated milk and return the pot to low heat. Add half of the cheese and stir to combine until the cheese is fully melted.\n" +
                    "\n" +
                    "3. Add the chili to the pot and stir until well combined. Season to taste with salt and pepper.\n" +
                    "\n" +
                    "4. Transfer mixture to a large casserole dish (or two smaller ones). Top with remaining cheddar and parmesan cheese. Bake until lightly browned and bubbly, about 20 minutes. Remove from oven, allow to rest 10 minutes, sprinkle with scallions and/or cilantro, and serve.\n"+"\n"
                    ,R.drawable.chili),

    };
    public American(String nam,String descriptio,int imageI){
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
