import java.util.*;

class RecentCounter {

    /* t <= 1_000_000_000 */
    private Queue<Integer> times = new LinkedList<>();

    public RecentCounter() {}
    
    /**
    * @param t represents some time in ms
    * @return [t-3000, t] 사이에 발생한 ping 요청의 갯수 return
    */
    public int ping(int t) {
        int startTime = t-3000;

        times.offer(t);
        while(!times.isEmpty()) {
            if(times.peek() < startTime) times.poll();
            else break;
        }

        return times.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */