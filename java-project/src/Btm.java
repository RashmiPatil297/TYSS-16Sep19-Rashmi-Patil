
public class Btm {
	static int totalCount=0;
	int count=0;
	void swipe()
	{
		count++;
		totalCount++;
	}
    int getCount()
    {
    	return count;
    }
    int getTotalCount()
    {
    	return totalCount;
    }
}
