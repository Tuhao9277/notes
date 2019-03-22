
public static int midSearch(arr,int l ,int r){
    int l = arr;
    int r = arr.length;
   
    int mid = （l+r)/2;
    if(arr[mid] == value){
    return arr[mid];
    }
    else if(value < arr[mid])
        r = mid-1;
        return midSearch(arr,l,r);
    else
        l = mid+1
        return midSearch(arr,l,r);
        
    }
}

//处理 mid = （L+R)/2;也可写成 L+(R-L)/2);还可写成 (R-L) >>1
