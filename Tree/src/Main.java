public class Main {

    public static void main(String[] args) {
        //        a tree instances
        Tree oakTree = new Tree(95, 5, TreeType.OAK, "oaky");
        Tree mapleTree = new Tree(78,30,TreeType.MAPLE, "mable");

//      using the grow() method on tree instance
        oakTree.grow();

        System.out.println(oakTree.heightFt);
        oakTree.announceTallTree();
        mapleTree.announceTallTree();

//        accessing static(class based) attributes

        Tree.announceTreeColor();
    }
}
