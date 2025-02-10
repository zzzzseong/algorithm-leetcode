class Solution {

    private boolean[] vis;

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        vis = new boolean[rooms.size()];
        traversal(rooms, 0);
        for(boolean visit : vis) {
            if(!visit) return false;
        }
        return true;
    }

    public void traversal(List<List<Integer>> rooms, int roomNumber) {
        vis[roomNumber] = true;
        for(int room : rooms.get(roomNumber)) {
            if(!vis[room]) traversal(rooms, room);
        }
    }
}