//选择排序
for(int i ; i< len.length;i++){
    min = arr[i];
    for(int j= i+1;j<len.length;j++){
        if(arr[j]<min){
        min= arr[j];
        }
    }
    swap(arr,i,min);
}
