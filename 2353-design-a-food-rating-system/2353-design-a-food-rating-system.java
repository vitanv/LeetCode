class Food{
    String name, cuisine;
    int rating;
    Food(String name, String cuisine, int rating){
        this.name = name;
        this.cuisine = cuisine;
        this.rating = rating;
    }
}

class FoodRatings {
    HashMap<String, Food> foodMap;
    HashMap<String, PriorityQueue<Food>> cuisineMap;
    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        this.foodMap = new HashMap<>();
        this.cuisineMap = new HashMap<>();
        for(int i = 0; i < foods.length; i++){
            Food temp = new Food(foods[i], cuisines[i], ratings[i]);
            cuisineMap.putIfAbsent(cuisines[i], new PriorityQueue<>((a, b) -> a.rating == b.rating ? a.name.compareTo(b.name) : b.rating - a.rating));
            PriorityQueue<Food> pq = cuisineMap.get(cuisines[i]);
            pq.add(temp);
            foodMap.put(foods[i], temp);
        }
    }
    
    public void changeRating(String food, int newRating) {
        Food f  = foodMap.get(food);
        PriorityQueue<Food> pq = cuisineMap.get(f.cuisine);
        pq.remove(f);
        f.rating = newRating;
        pq.add(f);
    }
    
    public String highestRated(String cuisine) {
        return cuisineMap.get(cuisine).peek().name;
    }
}

/**
 * Your FoodRatings object will be instantiated and called as such:
 * FoodRatings obj = new FoodRatings(foods, cuisines, ratings);
 * obj.changeRating(food,newRating);
 * String param_2 = obj.highestRated(cuisine);
 */