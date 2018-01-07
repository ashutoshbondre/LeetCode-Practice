public ArrayList<Integer> getRandomList(ArrayList<Integer> list, int size)
{
	if(list.size()<size) return null; //throw new exception
	int length = list.size();
	int minIndex = 0;
	int maxIndex = list.size()-size;
	ArrayList<Integer> answer = new ArrayList<Integer>();
	while(size>0)
	{
		int index = randIndex(minIndex,maxIndex);
		answer.add(list.get(index));
		size--;
		minIndex = index;
		maxIndex++;
	}
	return answer;
}

private int randIndex(int min, int max)
{
	Random r = new Random();
	return r.nextInt((max-min)+1) +min;
}