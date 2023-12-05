public class SortClass <T> {
    T numList;
    SortClass(T numList){
        this.numList = numList;
    }
    public void sort(){
        int n = this.numList.length;
        int temp = 0;
        for(int i=0; i<n; i++){
            for(int j=1; j<(n-i); j++){
                if(this.numList[j-1] > this.numList[j]){
                    temp = this.numList[j-1];
                    this.numList[j-1] = this.numList[j];
                    this.numList[j] = temp;
                }
            }
        }
    }
}