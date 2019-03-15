/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
   public static void testMirrorVerticalRightToLeft()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVerticalRightToLeft();
    caterpillar.explore();
  }
  
  public static void testMirrorHorizontal()
  {
    Picture redMotorcycle = new Picture("redMotorcycle.jpg");
    redMotorcycle.explore();
    redMotorcycle.mirrorHorizontal();
    redMotorcycle.explore();
  }
  
  public static void testmirrorHorizontalBotToTop()
  {
    Picture redMotorcycle = new Picture("redMotorcycle.jpg");
    redMotorcycle.explore();
    redMotorcycle.mirrorHorizontal();
    redMotorcycle.explore();
  }
  
  public static void mirrorDiagonal()
  {
    Picture beach = new Picture("beach.jpg");
    beach.mirrorDiagonal();
    beach.explore();
  }
  
  public static void mirrorArms()
  {
   Picture snowman = new Picture("snowman.jpg");
   snowman.mirrorArms();
   snowman.explore();
  }
  
  public static void mirrorGull()
  {
   Picture seagull = new Picture("seagull.jpg");
   seagull.mirrorGull();
   seagull.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("blobblob.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  /** Method to test testKeepOnlyBlue */
  public static void testKeepOnlyBlue()
  {
      Picture beach = new Picture("beach.jpg");
      beach.keepOnlyBlue();
      beach.explore();
  }
  
    public static void testNegate() 
  {
   Picture beach = new Picture("water.jpg");
   
   beach.explore();
   beach.negate();
  }  
  
  public static void testGrayscale() 
  {
    Picture beach = new Picture("beach.jpg");
      
    beach.grayscale();
    beach.explore();
  }
  
  public static void fixUnderwater()
  {
    Picture water = new Picture("water.jpg");
      
    water.fixUnderwater();
    water.explore();
  }
  
  public static void testCopy()
  {
    Picture ocean = new Picture("beach.jpg");
    Picture daddy = new Picture("snowman.jpg");
    ocean.copy(daddy, 10, 10);
    ocean.explore();
  }

  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    testZeroBlue();
    testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    testNegate();
    testGrayscale();
    //testFixUnderwater();
    testMirrorVertical();
    testMirrorVerticalRightToLeft();
    testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    testCollage();
    testCopy();
    testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}