class MyCircularQueue {
    int size;
    int cursize=0;
    int start=-1;
    int end=-1;
    int[] que;
    public MyCircularQueue(int k) {
        size=k;
        que= new int[size];
    }
    
    public boolean enQueue(int value) {
        if (isFull()){
            return false;
        }else{
            if (isEmpty()){
                start=0;
                end=0;
                que[start]=value;
            }else{
                end=(end+1)%size;
                que[end]=value;
            }
        }
        cursize++;
        return true;
    }
    
    public boolean deQueue() {
        if (isEmpty()) return false;
        if (cursize==1){
            start=-1;
            end=-1;
        }else{
            start=(start+1)%size;
        }
        cursize--;
        return true;
    }
    
    public int Front() {
        if (isEmpty()) return -1;
        return que[start];
    }
    
    public int Rear() {
        if (isEmpty()) return -1;
        return que[end];
    }
    
    public boolean isEmpty() {
        if (cursize==0){
            return true;
        }
        return false;
    }
    
    public boolean isFull() {
        if (cursize==size){
            return true;
        }
        return false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
