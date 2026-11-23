class ProductOfNumbers {
    List<Integer> li;
    int count;
    public ProductOfNumbers() {
        li=new ArrayList<>();
        int count=0;
    }
    
    public void add(int num) {
        li.add(num);
        count++;
    }
    
    public int getProduct(int k) {
        int p=1;
        int len=count-1;
        while (k!=0){
            p*=li.get(len);
            if (p==0) return 0;
            len--;
            k--;
        }
        return p;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */
