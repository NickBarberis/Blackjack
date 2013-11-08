import org.newdawn.slick.Image;

/**
 *
 * @author Nick Barberis
 */
public class Card extends Object
{
  private Image cardImage;
  private int cardInt;
  private int distance;
  
  public Card(Image im, int val)
  {
    cardImage = im;
    cardInt = val;
  }
  
  public Image getImage()
  {
    return cardImage;
  }
  
  public int getValue()
  {
	if (cardInt >= 10) {
		cardInt = 10;
	}
    return cardInt;
  }
  
  public int getWidth() {
	  return cardImage.getWidth();
  }
  
  public int getHeight() {
	  return cardImage.getHeight();
  }
  
  /*public int distanceTo(Card rhs)
  {
    if (rhs.getValue() == 0)
    {
      return 1;
    }
    else if (cardInt == 0)
    {
      return 1;
    }
    else if (rhs.getValue() == 13 && cardInt == 1)
    {
      return 1;
    }
    else if (rhs.getValue() == 1 && cardInt == 13)
    {
      return 1;
    }
    else return Math.abs(cardInt - rhs.getValue());
  }*/
}
