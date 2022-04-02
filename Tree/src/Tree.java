import java.awt.*;

public class Tree {
    //    ATTRIBUTES
//    properties of a tree
//    AKA: instance members - for each instance these values may differ i.e NON-STATIC
//    AKA: non-static attributes - you have to create an instance of tree to have access to the value of these attributes
    double heightFt;
    double trunkDiameterInches;
    String nickName;
    TreeType treeType;

    //    STATIC attribute (class based attribute, not instance based)
    static Color TRUNK_COLOR = new Color(179, 71, 70);

    //    constructor
    Tree(double heightFt, double trunkDiameterInches, TreeType treeType, String nickName){
        this.heightFt = heightFt;
        this.trunkDiameterInches = trunkDiameterInches;
        this.treeType = treeType;
        this.nickName = nickName;
    }

    //    BEHAVIOURS
//    static methods
    static void announceTreeColor(){
        System.out.println(Tree.TRUNK_COLOR);
    }
    // methods of a tree
    void grow(){
        this.heightFt = this.heightFt + 10;
        this.trunkDiameterInches = this.trunkDiameterInches + 1;
    }

    void announceTallTree(){
        if(this.heightFt > 100){
            System.out.println("The " + this.treeType + " tree with the nickname: '" + this.nickName + "' height is too high");
        }
        else{
            System.out.println("The " + this.treeType + " tree with the nickname: '" + this.nickName + "' height is normal");
        }
    }
}
