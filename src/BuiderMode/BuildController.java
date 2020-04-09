package BuiderMode;

public class BuildController {
      private Builder builder;
      public BuildController(Builder builder){
          this.builder=builder;
      }
      public void SetBuilder(Builder builder){
          this.builder = builder;
      }
      public  Actor construct(){
          return this.builder.getActor();
      }
}
