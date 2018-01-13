public class ZigZagIterator{
	Queue<Iterator> q ;

	public ZigZagIterator(List<Integer> v1, List<Integer> v2)
	{
		q = new LinkedList();
		if(!v1.isEmpty()) q.offer(v1.iterator());
		if(!v2.isEmpty()) q.offer(v2.iterator());
	}

	public int next()
	{
		Iterator curr = q.poll();
		int res = (int) curr.next();
		if(curr.hasNext()) q.offer(curr);
		return res;
	}

	public boolean hasNext()
	{
		return q.peek()!=null;
	}
}