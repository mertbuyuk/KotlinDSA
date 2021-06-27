package searching

class LinearSearch<T> {

    fun linearSearch(arr: Array<T>, item : T ): Int {
        for (i in arr.indices){
            if(arr[i] == item){
                return i
            }
        }
        return -1
    }

}