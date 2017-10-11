public class NutritionFactsBuilder {
    private final int servingSize;//必要
    private final int servings;//必要
    private final int calories;//可选
    private final int fat;//可选
    private final int sodium;//可选
    private final int carbohydrate;//可选

    public static class Builder{
        private final int servingSize;//必要
        private final int servings;//必要
        private int calories=0;//可选
        private int fat=0;//可选
        private final int sodium=0;//可选
        private final int carbohydrate=0;//可选

        public Builder(int servingSize,int servings){
            this.servingSize=servingSize;
            this.servings=servings;
        }

        public Builder calories(int val){
            calories=val;
            return this;
        }

        public Builder fat(int val){
            fat=val;
            return this;
        }

        public NutritionFactsBuilder build(){
            return new NutritionFactsBuilder(this);
        }
    }

    private NutritionFactsBuilder(Builder builder){
        this.servingSize=builder.servingSize;
        this.servings=builder.servings;
        this.calories=builder.calories;
        this.fat=builder.fat;
        this.sodium=builder.sodium;
        this.carbohydrate=builder.carbohydrate;
    }


}
